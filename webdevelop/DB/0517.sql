-- HAVING 절
-- GROUP BY로 집계된 값중 WHERE처럼 특정 조건을 추가하는 것
-- 그룹함수에 조건을 달아야 할 때 사용

-- 각 부서별 급여의 최대값, 최소값, 인원수를 출력하되 급여의 최대값이 8000이상인 결과만 보여줄 것
SELECT DEPARTMENT_ID , MAX(SALARY), MIN(SALARY), COUNT(*) 
FROM EMPLOYEES e 
GROUP BY DEPARTMENT_ID 
HAVING MAX(SALARY) >= 8000
ORDER BY MAX(SALARY ) DESC ;

-- Q. 각 부서별 인원수가 20명 이상인 부서의 정보를 부서번호, 급여의 합, 급여의 평균, 인원수 순으로 출력하되,
-- 급여의 평균은 소수점 2자리까지 반올림하여 출력
SELECT DEPARTMENT_ID , SUM(SALARY), ROUND(AVG(SALARY),2), COUNT(*)
FROM EMPLOYEES e 
GROUP BY DEPARTMENT_ID 
HAVING COUNT(*) >= 20;

-- Q. 부서별, 직종별로 그룹화 하여 결과를 부서번호, 직종, 인원수 순으로 출력하되 직종이
-- 'MAN'으로 끝나는 경우에만 조회
SELECT DEPARTMENT_ID , JOB_ID , COUNT(*) 
FROM EMPLOYEES e 
WHERE JOB_ID LIKE '%MAN'
GROUP BY DEPARTMENT_ID, JOB_ID ;

-- Q. 각 부서별 평균 급여를 소수점 한자리까지 버림으로 출력하되,
-- 평균 급여가 10000미만인 그룹만 조회해야하며, 부서번호가 50이하인 부서만 조회
SELECT DEPARTMENT_ID ,TRUNC(AVG(SALARY),1)  
FROM EMPLOYEES e
WHERE DEPARTMENT_ID <= 50
GROUP BY DEPARTMENT_ID 
HAVING TRUNC(AVG(SALARY),1) < 10000;


-- DCL(Data Control Language)
-- 데이터 제어어
-- 데이터베이스에 접근하고 객체들을 사용하도록 권한을 주고 회수하는 명령어

-- 종류
-- GRANT : 권한을 부여
-- REVOKE : 권한을 강탈

-- SUBQUERY
--  특정 SQL문장 안에 또다른 SQL문장이 포함되어 있는 것
--  여러번 DB접속이 필요한 상황을 한번으로 줄여서 속도를 증가시킬 수 있다.
--  사용 가능한곳
--   WHERE, HAVING절
--   SELECT, DELECT FROM절
--   UPDATE문의 SET절
--   INSERT문의 INTO절

-- 사원테이블에서 이름이 'Michael'이고, 직종이 'MK_MAN'인 사원의 급여보다 많이받는 사원들의 정보를 사번, 이름, 직종, 급여 순으로 출력
SELECT EMPLOYEE_ID , FIRST_NAME , JOB_ID , SALARY 
FROM  EMPLOYEES e 
WHERE SALARY > (SELECT SALARY 
				FROM EMPLOYEES e
				WHERE FIRST_NAME ='Michael' AND JOB_ID ='MK_MAN');

-- 사번이 150번인 사원의 급여와 같은 급여를 받는 사원들의 정보를 사번, 이름, 급여순으로 출력
SELECT EMPLOYEE_ID , FIRST_NAME , SALARY  
FROM EMPLOYEES e 
WHERE SALARY = (SELECT SALARY 
				FROM EMPLOYEES
				WHERE EMPLOYEE_ID = 150);

-- Q. 급여가 회사의 평균 급여 이상인 사람들의 이름과 급여를 조회
SELECT FIRST_NAME , SALARY 
FROM EMPLOYEES
WHERE SALARY >= (SELECT AVG(SALARY)
				FROM EMPLOYEES);

-- Q. 사번이 111번인 사원의 직종과 같고, 사번이 159번인 사원의 급여보다 많이받는 사원의 정보를 사번, 이름, 직종, 급여순으로 출력
SELECT EMPLOYEE_ID , FIRST_NAME , JOB_ID , SALARY 
FROM EMPLOYEES e 
WHERE JOB_ID = (SELECT JOB_ID 
				FROM EMPLOYEES
				WHERE EMPLOYEE_ID = 111)
AND SALARY > (SELECT SALARY 
			  FROM EMPLOYEES
			  WHERE EMPLOYEE_ID = 159);

-- Q. 100번 부서의 최소 급여보다 많이 받는 다른 부서의 부서번호, 최소 급여를 조회
SELECT DEPARTMENT_ID ,MIN(SALARY)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID 
HAVING MIN(SALARY) > (SELECT MIN(SALARY)
                      FROM EMPLOYEES
                      WHERE DEPARTMENT_ID = 100);

-- PLAYER테이블에서 TEAM_ID가 'K01'인 선수중 POSITION이 'GK'인 선수
SELECT * FROM PLAYER p WHERE TEAM_ID ='K01';
SELECT * 
FROM (SELECT * 
	  FROM PLAYER p 
	  WHERE TEAM_ID ='K01') 
WHERE"POSITION" = 'GK';

-- PLAYER테이블에서 전체 평균키와 포지션별 평균키 구하기
SELECT "POSITION" ,
	    AVG(HEIGHT), 
	    (SELECT AVG(HEIGHT)
		 FROM PLAYER)
FROM PLAYER p 
WHERE "POSITION" IS NOT NULL
GROUP BY "POSITION" ;

-- CONCATENATION(연결)
-- 두개의 컬럼을 마치 하나의 컬럼처럼 조회하는 것
-- || 
SELECT FIRST_NAME || ' ' || LAST_NAME 
FROM EMPLOYEES e ;

-- 00의 급여는 00이다.
SELECT FIRST_NAME || '의 급여는' || SALARY || '이다'
FROM EMPLOYEES e ;

-- ALIAS(별칭)
-- 조회된 컬럼의 이름이 너무 길다면 별명을 줘서 대신 사용할 수 있다.
-- SELECT 절
	-- AS뒤에 작성
	-- 한칸 띄우고 작성
-- FROM절
	-- 테이블 이름 뒤에 한칸 띄우고 작성

-- 별칭의 특징
-- 테이블에 별칭을 줘서 컬럼을 단순, 명확히 할 수 있다.
-- 조회된 SELECT문장에서만 유효하다
-- 테이블 별칭은 길이가 30자까지 가능하나 짧을수록 좋다.
-- 테이블 별칭에는 의미가 있는 것이 좋다.


-- 사원 테이블에서 EMPLOYEE_ID를 "사번", FIRST_NAME을 "이름". SALARY를 "급여"로 바꿔서 조회
SELECT EMPLOYEE_ID AS "사번", FIRST_NAME AS "이름", SALARY AS "급여"
FROM EMPLOYEES e; 

SELECT e.DEPARTMENT_ID , d.DEPARTMENT_ID 
FROM EMPLOYEES e, DEPARTMENTS d; 

-- PLAYER테이블에서 NICENAME이 NULL인 선수들의 닉네임을 정태민 선수의 닉네임으로 바꾸기
UPDATE PLAYER 
SET NICKNAME = (SELECT NICKNAME
				FROM PLAYER
				WHERE PLAYER_NAME = '정태민')
WHERE NICKNAME IS NULL;

SELECT * FROM PLAYER p ;








