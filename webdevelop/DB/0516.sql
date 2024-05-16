-- 문자함수

-- ASCII()
--  지정된 문자의 ASCII값을 반환한다.
--  * DUAL (가상의 테이블)
SELECT ASCII('A') FROM DUAL;  -- 65

-- chr()
--  지정된 수치와 일치하는 ASCII코드를 반환
SELECT CHR(65) FROM DUAL;  -- A

-- RPAD(데이터, 고정길이, 문자)
--  보정길이 안에 데이터를 출력하고 남는 공간을 문자로 채운다.
SELECT RPAD(DEPARTMENT_NAME, 10, '*') FROM DEPARTMENTS; 

-- LPAD(데이터, 고정길이, 문자)
--  RPAD의 반대
SELECT LPAD(DEPARTMENT_NAME, 10, '*') FROM DEPARTMENTS;


-- TRIM()
--  문자열 공백 문자들을 삭제
SELECT TRIM(' HELLO   ') FROM DUAL;  -- HELLO
-- RTRIM() : 오른쪽 지움, LTRIM() : 왼쪽지움

-- INSER(문자열, 문자)
--  특정 문자의 위치를 반환
--  찾는 문자열이 없으면 0반환
SELECT INSTR('HELLOW','O') FROM DUAL; -- 5

--INTICAP()
--  첫문자를 대문자로 변환하는 함수
--  공백이나 /를 구분자로 인식
SELECT INITCAP('good morning') FROM DUAL; -- Good Morning
SELECT INITCAP('good/morning') FROM DUAL; -- Good/Morning


-- length()
--  문자열의 길이를 반환
SELECT LENGTH ('john') FROM DUAL; -- 4

-- replace(문자열, 문자1, 문자2)
--  문자열에서 문자1을 문자2로 변환하는 함수
SELECT REPLACE ('good morning','good','bad') FROM DUAL; -- bad morning

-- CONCAT(문자열1, 문자열2)
--  주어지는 두 문자열을 연결
SELECT CONCAT('Republic of ', 'korea') FROM DUAL; -- Republic of korea  

-- LOWER(데이터)
--  데이터를 소문자로 반환
SELECT LOWER('GOOD MORNING') FROM DUAL; -- good morning

-- UPPER(데이터)
--  데이터를 대문자로 반환
SELECT UPPER('good mornign') FROM DUAL; -- GOOD MORNING

-- SUBSTR(데이터, 시작위치, 끝위치)
--  시작위치부터 선택한 갯수만큼 문자를 반환
SELECT SUBSTR('good morning', 1, 4) FROM DUAL; -- good

-- 숫자함수

-- ABS()
--  절대값을 반환
SELECT -10, ABS(-10) FROM DUAL; -- - 10, 10

-- ROUDN(데이터, 자릿수)
--  특정한 자릿수에서 반올림하여 반환
--  지정한 숫자가 양수면 소숫점 아래
--  음수면 소숫점 위
--  생략되면 정수를 만환
SELECT ROUND(1234.567, 1), -- 1234.6
	   ROUND(1234.567, -1), -- 1230
       ROUND(1234.567)  -- 1235
FROM DUAL;

-- FLOOR()
--  주어진 숫자보다 작거나 같은 경우 중 최댓값을 반환(내림)
SELECT FLOOR(2), -- 2
	   FLOOR(2.1) -- 2
FROM DUAL;

-- TRUNC()
--  특정 자리수를 버리고 반환
SELECT TRUNC(1234.567, 1), -- 1234.5
       TRUNC(1234.567, -1), -- 1230
       TRUNC(1234.567) -- 1234
FROM DUAL;

-- SIGN()
--  주어진 값의 음수, 정수, 0의 여부를 판단
SELECT SIGN(-10), -- 1
       SIGN(0), -- 0
       SIGN(10) -- 1
FROM DUAL;

-- CEIL()
--  주어진 숫자보다 크거나 같은 정수 중 최소값을 반환(올림)
SELECT CEIL(2), -- 2
       CEIL(2.1) -- 3
FROM DUAl;

-- MOD(데이터, 나누는 수)
--  나누기 후 나머지를 반환
SELECT MOD(1,3), -- 1
       MOD(2,3), -- 2
       MOD(3,3), -- 0
       MOD(4,3), -- 1
       MOD(0,3)  -- 0
FROM DUAL;

-- POWER()
--  주어진 숫자의 지정된 수만큼 제곱값을 반환
SELECT POWER(2, 1), -- 2
       POWER(2, 2), -- 4
       POWER(2, 3), -- 8
       POWER(2, 0)  -- 1
FROM DUAl;

-- 날짜 함수
--  날짜 + 날짜 불가능
--  SYSDATE : 현재 날짜를 반환하는 키워드

-- ADD_MONTHS(날짜, 정수)
--  특정 날짜에 개월수를 더해준다.
SELECT ADD_MONTHS(SYSDATE, 2)FROM DUAL; -- 2024-07-16

-- MONTHS_BETWEEN(날짜, 날짜)
--  두 날짜 사이의 개월수를 구해줌
SELECT FIRST_NAME  ,SYSDATE , HIRE_DATE , MONTHS_BETWEEN(SYSDATE, HIRE_DATE) FROM EMPLOYEES; 

-- NEXT_DAY(날짜, 요일)
--  주어진 날짜로부터 내가 지정한 요일이 나오는 날짜를 반환
--  1 : 일요일 ~ 7 : 토요일
--  다음주 일요일
SELECT SYSDATE, NEXT_DAY(SYSDATE, '일요일') FROM DUAL;
-- 저번주 일요일
SELECT SYSDATE, NEXT_DAY(SYSDATE-7, '일요일') FROM DUAL;


-- Q. 부서 번호가 50번인 사원들의 이름을 출력하되,
-- 이름 중 'el'을 모두 '**'로 대체하여 출력하세요
SELECT REPLACE (FIRST_NAME, 'el', '**') AS FIRST_NAME 
FROM EMPLOYEES e 
WHERE DEPARTMENT_ID = 50;

-- Q. 사원들의 이름, 입사일, 입사 후 오늘까지의 개월수를 조회하되
-- 입사기간이 200개월 이상인 사람만 출력하고 
-- 입사 개월수는 소수점 이하 한자리까지만 버림하세요.
SELECT FIRST_NAME , HIRE_DATE , TRUNC(MONTHS_BETWEEN(SYSDATE, HIRE_DATE),1) AS MONTH
FROM EMPLOYEES e
WHERE MONTHS_BETWEEN(SYSDATE, HIRE_DATE) >= 200 ;

-- 형변환 함수
-- TO_CHAR(날짜, 포맷)
SELECT TO_CHAR(SYSDATE, 'yyyy-mm-dd'),
       TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY'),
       TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:ss')
FROM DUAL;

-- TO_NUMBER()
--  오라클에서는 숫자만 있는 문자열은 묵시적으로 숫자취급을 하기때문에 잘 사용하지 않음
/*
 * 0 : 숫자, 공백시 0으로 채움
 * 9 : 숫자
 * , : 쉼표 표기
 * L : 지역 통화 기호
 * */
SELECT TO_CHAR(1234567, '9,999,999') FROM DUAL; -- 1,234,567

SELECT TO_CHAR(1234567, 'L9,999,999') FROM DUAL; -- \1,234,567 

SELECT TO_CHAR(12, '0999') FROM DUAL; -- 0012 

-- TO_DATE(날짜, 포맷)
SELECT TO_DATE('2024.05.16') FROM DUAL; -- 2024-05-16 00:00:00.000
SELECT TO_DATE('05.16.2024', 'MM,DD,YYYY') FROM DUAL; -- 2024-05-16 00:00:00.000
SELECT TO_DATE('2024.05', 'YYYY.MM') FROM DUAL; -- 2024-05-01 00:00:00.000
--  올해, 지금 월에 해당하는 년, 월이 배정됨
SELECT TO_DATE('16', 'DD') FROM DUAL; -- 2024-05-16 00:00:00.000

-- NULL 처리 함수
--  NULL값을 다른 값으로 변경(임시)
SELECT * FROM PLAYER p ;

SELECT PLAYER_NAME, "POSITION"  
FROM PLAYER p 
WHERE "POSITION" IS NULL;

-- NUL(컬럼, 치환할 값)
SELECT PLAYER_NAME, NVL("POSITION", '미정')
FROM PLAYER p 
WHERE "POSITION" IS NULL;

-- NUL2(컬럼, NULL아닐 때 치환할 값, NULL일때 치환할 값)
SELECT FIRST_NAME , NVL2(COMMISSION_PCT, '받음', '안받음')  
FROM EMPLOYEES e

-- 순위함수
-- RANK() OVER(ORDER BY 컬럼)
SELECT RANK () OVER(ORDER BY SALARY DESC) AS RANK, FIRST_NAME , SALARY  FROM EMPLOYEES e ;

-- DENSE_RANK()
--  중복순위 계산 X
SELECT DENSE_RANK () OVER(ORDER BY SALARY DESC) AS RANK, FIRST_NAME , SALARY  FROM EMPLOYEES e ;

-- 집계 함수
--  여러 행들에 대한 연산결과를 하나의 행으로 반환
--  집계 함수는 NULL값이 있는 행을 집계하지 않는다
--  집계 함수와 일반 행들은 일반적으로 같이 조회할 수 없다.

-- COUNT : 행의 개수를 반환
--  NULL값이여도 카운트 해준다
SELECT COUNT(*) FROM EMPLOYEES e ; -- 107
-- MIN : 행 중 최소값을 반환
-- MAX : 행 중 최대값을 반환
-- SUM : 행들의 합계를 반환
-- AVG : 행들의 평균을 반환
-- STDDEV : 행들의 표준편차를 반환
-- VARIANCE : 행들의 분산을 반환

-- 사원테이블에서 직종이 SAREP인 사원들의 평균 급여,  급여 최고액, 최저액, 총 합계를 출력
SELECT AVG(SALARY), -- 8350
       MAX(SALARY), -- 11500
       MIN(SALARY), -- 6100
       SUM(SALARY)  -- 250500
FROM EMPLOYEES e 
WHERE JOB_ID = 'SA_REP';

-- 부서의 개수를 출력
--  * DISTINCT : 중복을 제거
SELECT COUNT(DISTINCT DEPARTMENT_ID) FROM EMPLOYEES e; 

-- Q. 부서번호가 80번인 부서의 사원들의 급여의 평균을 출력
SELECT ROUND(AVG(SALARY) ,1) 
FROM EMPLOYEES e 
WHERE DEPARTMENT_ID = 80;

-- 그룹화
--  GROUP BY

-- 각 부서별 급여의 평균과 총 합을 출력
SELECT DEPARTMENT_ID ,AVG(SALARY), SUM(SALARY) 
FROM EMPLOYEES e 
GROUP BY DEPARTMENT_ID 
ORDER BY DEPARTMENT_ID ;

-- Q. 각 직종별 인원수를 출력
SELECT JOB_ID, COUNT(*) 
FROM EMPLOYEES e 
GROUP BY JOB_ID ;

-- Q. 부서별로 가장 높은 급여 조호
SELECT DEPARTMENT_ID  , MAX(SALARY) 
FROM EMPLOYEES e 
GROUP BY DEPARTMENT_ID ;

-- Q. 부서별 급여의 합계를 내림차순으로 조회
SELECT DEPARTMENT_ID, SUM(SALARY)
FROM EMPLOYEES e 
GROUP BY DEPARTMENT_ID 
ORDER BY SUM(SALARY) DESC;

-- 그룹 함수
CREATE TABLE 월별매출(
	상품ID VARCHAR2(5),
	월 VARCHAR2(10),
	회사 VARCHAR2(10),
	매출액 NUMBER
);

INSERT INTO 월별매출 VALUES('P001', '2019.10', '삼성', 15000);
INSERT INTO 월별매출 VALUES('P001', '2019.11', '삼성', 25000);
INSERT INTO 월별매출 VALUES('P002', '2019.10', 'LG', 10000);
INSERT INTO 월별매출 VALUES('P002', '2019.11', 'LG', 25000);
INSERT INTO 월별매출 VALUES('P003', '2019.10', '애플', 15000);
INSERT INTO 월별매출 VALUES('P003', '2019.11', '애플', 35000);

SELECT * FROM 월별매출;

-- ROLLUP()
-- ROLLUP(A) : A그루핑 -> 합계
-- ROLLUP(A, B) : A, B 그루핑 -> A소계/합계
-- ROLLUP(A, B, C) : A,B,C 그룹핑 -> (A소계, B소계)/ 합계
SELECT 상품ID, 월, SUM(매출액) FROM 월별매출
GROUP BY ROLLUP (상품ID, 월);

-- CUBE
-- CUBE(A) : A그루핑 -> 합계
-- CUBE(A,B) : A,B 그루핑/A그루핑/B그루핑 -> A소계, B소계/합계
-- CUBE(A,B,C) : A,B,C그루핑/A,B그루핑/A,C그루핑/B,C그루핑/A그루핑/B그루핑/C그루핑 ->(A소계, B소계), (B소계)/합계
SELECT 상품ID, 월, SUM(매출액)
FROM 월별매출
GROUP BY CUBE(상품ID, 월);


