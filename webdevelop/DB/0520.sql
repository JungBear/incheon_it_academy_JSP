/*
 * ## JOIN

- 데이터베이스에서 ‘두 개 이상의 테이블’을 연결하여 하나의 결과 테이블로 만드는 것을 의미한다.
- 사용하는 이유는 데이터베이스에서 테이블을 분리하여 ‘데이터의 중복을 최소화’하고 데이터의 일관성을 유지하기 위해서
- join의 방식에 따라 결과가 달라진다

### 종류

- INNER JOIN
    - 각 테이블에서 조인 조건에 일치되는 데이터만 가져온다
    - A와 B의 공통된 부분을 의미(교집합과 비슷)
    
    - ANSI JOIN
        - 테이블A INNER JOIN 테이블 B ON 조건식
        - 테이블A JOIN 테이블 B ON 조건식
        
    - ORACLE JOIN
        - FROM 테이블A, 테이블B WHERE 조건식
        
    - SELF INNER JOIN
	    - 하나의 테이블 내에서 다른 컬럼을 참조하기 위해 사용하는 자기 자신과의 조인
	    - 이를 통해 데이터베이스에서 한 테이블 내의 값을 다른 값과 연결할 수 있다
	    SELECT 테이블A.열, 테이블B.열
	    FROM 테이블A JOIN 테이블B ON 조건식
	    
	- CROSS JOIN
	    - 두 개 이상의 테이블에서 모든 가능한 조합을 만들어 결과를 반환하는 방법
	    - 이를 통해 두 개 이상의 테이블을 조합하여 새로운 테이블을 만들 수 있다
	    - 각 행의 모든 가능한 조합을 만들기 때문에 결과가 매우 큰 테이블이 될 수 있으므로 사용에 주의해야 한다
	    SELECT 테이블1.열, 테이블2.열
	    FROM 테이블1 CROSS JOIN 테이블2;
	    
	    
        **/
SELECT * FROM EMPLOYEES e;

SELECT * FROM DEPARTMENTS d ;

-- 부서번호에 따른 부서명을 조회
SELECT e.FIRST_NAME , e.DEPARTMENT_ID , d.DEPARTMENT_NAME  
FROM EMPLOYEES e JOIN DEPARTMENTS d 
ON e.DEPARTMENT_ID  = d.DEPARTMENT_ID ;

-- 부서, 지역테이블로부터 부서이름과 CITY 조회하기
SELECT * FROM DEPARTMENTS d ;
SELECT * FROM LOCATIONS l ;

SELECT d.DEPARTMENT_NAME , l.CITY 
FROM DEPARTMENTS d JOIN LOCATIONS l
ON d.LOCATION_ID = l.LOCATION_ID ;

-- Q.지역(Locations), 나라(countries)테이블에서 city와 country_name조회
SELECT * FROM COUNTRIES c ;
SELECT * FROM LOCATIONS l ;

SELECT city, country_name
FROM LOCATIONS l JOIN COUNTRIES c 
ON l.COUNTRY_ID  = c.COUNTRY_ID ;

-- Q. first_name, last_name, job_id, job_title을 출력
--	  employees와 jobs테이블에서 조회
SELECT FIRST_NAME , LAST_NAME , e.JOB_ID , j.JOB_TITLE 
FROM EMPLOYEES e JOIN JOBS j 
ON e.JOB_ID = j.JOB_ID ;

-- 사원, 부서, 지역테이블로부터 first_name,email ,department_id, department_name, location_id, city를 출력하되 
-- city가 'Seattle'인 경우만 출력
SELECT e.FIRST_NAME, e.EMAIL  , e.DEPARTMENT_ID , d.DEPARTMENT_NAME , d.LOCATION_ID , l.city
FROM EMPLOYEES e JOIN DEPARTMENTS d 
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID 
	JOIN LOCATIONS l
	ON d.LOCATION_ID = l.LOCATION_ID AND l.CITY = 'Seattle';

/*
 * ## OUTER JOIN

- 두 테이블에서 ‘공통된 값을 가지지 않는 행들’도 반환

### LEFT OUTER JOIN
- ‘왼쪽 테이블의 모든행‘과 오른쪽 테이블에서 왼쪽 테이블과 공통된 값’을 가지고 있는 행들을 반환
SELECT 컬럼명1, 컬럼명2
FROM 테이블1 LEFT OUTER JOIN 테이블2
ON 조건식

### RIGHT OUTER JOIN
- LEFT OUTER JOIN의 반대
SELECT 컬럼명1, 컬럼명2
FROM 테이블1 RIGHT OUTER JOIN 테이블2
ON 조건식

### FULL OUTER JOIN

- 두 테이블에서 ‘모든 값’을 반환
- 만약 공통된 값을 가지고 있지 않은 행이 있다면 NULL값을 반환
- 합집합 연산 결과와 같다
    - 양쪽 테이블 데이터 집합에서 공통적으로 존재하는 데이터, 한쪽에만 존재하는 데이터 모두 추출
SELECT 컬럼명1, 컬럼명2
FROM 테이블1 FULL OUTER JOIN 테이블2
ON 조건식

 * */

-- 사원 테이블과 부서 테이블의 LEFT OUTER JOIN을 이용하여 사원이 어느 부서에 속해 있는지 조회
SELECT e.FIRST_NAME , d.DEPARTMENT_NAME  
FROM EMPLOYEES e LEFT OUTER JOIN DEPARTMENTS d 
ON e.DEPARTMENT_ID  = d.DEPARTMENT_ID 

-- 부서 이름은 다 나오는데 부서에 사람이 없는 경우도 조회된다
SELECT e.FIRST_NAME , d.DEPARTMENT_NAME  
FROM EMPLOYEES e RIGHT OUTER JOIN DEPARTMENTS d 
ON e.DEPARTMENT_ID  = d.DEPARTMENT_ID 

SELECT e.FIRST_NAME , d.DEPARTMENT_NAME  
FROM EMPLOYEES e FULL OUTER JOIN DEPARTMENTS d 
ON e.DEPARTMENT_ID  = d.DEPARTMENT_ID 

/*
 * ## 집합 연산자

### UNION
- 두 개의 테이블에서 ‘중복을 제거하고 합친 모든 행’을 반환
*/

-- 사원이름과 부서 이름의 모든 값을 가져와서 중복을 제거하고 합친다
SELECT e.FIRST_NAME 
FROM EMPLOYEES e 
UNION
SELECT d.DEPARTMENT_NAME
FROM DEPARTMENTS d ;

/*
 * ### VIEW

- 하나 이상의 테이블이나 다른 뷰의 데이터를 볼수 있게 하는 데이터베이스 객체
- 실제 데이터는 뷰를 구성하느 ㄴ테이블에 담겨 있지만 마치 테이블처럼 사용할 수 있을 뿐만 아니라 다른 뷰를 참조해 새로운 뷰를 만들어 사용할 수 있다
- 특징
    - 독립성
        - 테이블 구조가 변경되어도 뷰를 사용하는 응용 프로그램은 변경하지 않아도 된다.
    - 편리성
        - 복잡한 쿼리문을 뷰로 생성함으로써 관련 쿼리를 단순하게 작성할 수 있다.
        - 또한 해당 형태의 SQL문을 자주 사용할 때 뷰를 사용하면 편리하게 이용할 수 있다
	- 보안성
    	- 숨기고 싶은 정보가 존재한다면, 뷰를 생성할 때 해당 컬럼을 빼고 생성함으로써 사용자에게 정보를 감출 수 있다
- 생성
    - CREATE OR REPLACE VIEW 뷰이름 AS(쿼리문)
- 삭제
    - DROP VIEW 뷰이름 RESTRICT OR CASCADE
    	- RESTRICT : 뷰를 다른곳에서 참조하고 있다면 삭제 취소
		- CASCADE : 뷰를 참조하는 다른 뷰나 제약조건까지 모두 삭제
 * */

CREATE OR REPLACE VIEW MY_EMPL AS (
	SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, (SALARY * COMMISSION_PCT) AS "보너스"
	FROM EMPLOYEES e 
);

SELECT * FROM MY_EMPL ;

-- Q. DATA_PLUS라는 VIEW를 만들고 
-- 	  이름, 급여, 급여를 많이 받는 순으로 순위를 매겨서 조회
CREATE OR REPLACE VIEW DATA_PLUS AS (
	SELECT FIRST_NAME , SALARY , RANK() OVER(ORDER BY SALARY DESC) AS "RANK"
	FROM EMPLOYEES e 
);

SELECT * FROM DATA_PLUS ;

-- Q. VIEW를 PLAYER_AGE라는 이름으로 만들고
--    선수들의 이름과 나이를 구하여 저장하고 조회
CREATE OR REPLACE VIEW PLAYER_AGE AS (
	SELECT PLAYER_NAME, TRUNC((SYSDATE - BIRTH_DATE)/365) AS "AGE" 
	FROM PLAYER 
);

SELECT * FROM PLAYER_AGE;

-- 나이가 35살 이상인 선수만 조회
SELECT *
FROM PLAYER_AGE 
WHERE AGE >= 35;

-- Q. TEAM_NAME이라는 이름으로 VIEW를 만들고
--    선수이름, 팀이름을 조회하여 VIEW에 저장
--    TEAM_NAME은 TEAM테이블에 있음
--    PLAYER_NAME은 PLATER테이블에 있음
SELECT * FROM PLAYER p ;
SELECT * FROM TEAM t;

SELECT p.PLAYER_NAME , t.TEAM_NAME 
FROM PLAYER p JOIN TEAM t 
ON p.TEAM_ID = t.TEAM_ID ;

CREATE OR REPLACE VIEW TEAM_NAME AS(
	SELECT p.PLAYER_NAME , t.TEAM_NAME 
	FROM PLAYER p  TEAM t 
	ON p.TEAM_ID = t.TEAM_ID
);

SELECT * FROM TEAM_NAME ;

SELECT * FROM STADIUM s ;
SELECT * FROM TEAM t;

-- Q. STADIUM_ID, STADIUM_NAME, TEAM_NAME을 
--    검색하여 STADIUM_INFO라는 VIEW로 만들고
--    해당 VIEW에서 TEAM_NAME이 NULL인 경기장 조회
SELECT s.STADIUM_ID,  s.STADIUM_NAME , t.TEAM_NAME 
FROM STADIUM s LEFT OUTER JOIN TEAM t 
ON t.STADIUM_ID = s.STADIUM_ID;

SELECT s.STADIUM_ID,  s.STADIUM_NAME , t.TEAM_NAME 
FROM STADIUM s LEFT OUTER JOIN TEAM t 
ON t.TEAM_ID  = s.HOMETEAM_ID;

CREATE OR REPLACE VIEW STADIUM_INFO AS(
	SELECT s.STADIUM_ID,  s.STADIUM_NAME , t.TEAM_NAME 
	FROM TEAM t RIGHT OUTER JOIN STADIUM s 
	ON t.STADIUM_ID = s.STADIUM_ID
);

SELECT * FROM STADIUM_INFO
WHERE TEAM_NAME IS NULL;

/*
 * ## TCL(Transaction Control Language)

- 트랜잭션 제어 언어
    - 트랜잭션 : 데이터베이스 작업을 처리하는 논리적 연산 단위
    - ex) select, update, insert delect 문장
### 속성

- 원자성(Amotomicity)
    - 원자와 같이 데이터베이스 연산들이 나눌수도, 줄일수도 없는 하나의 유닛으로 취급
    - 트랜잭션에 정의된 연산들은 모두 성공적으로 실행되던지, 전혀 실행되지 않은 상태로 남아야한다
	ex) 10,000원이 든 계좌 A에서 0원이 든 계좌 B로 10,000원을 보낸다
	UPDATE 계좌A SET 잔액 = 0 WHERE 계좌번호 = A;
	-- 중간에 문제가 생겨서 아래 SQL문이 실행되지 않았을 경우 위의 SQL또한 실행되어서는 안된다
	-- -> 실행된 SQL문을 취소해야 한다.
	UPDATE 계좌B SET 잔액 = 10,000 WHERE 계좌번호 = B;

- 일관성(Consistency)
    - 데이터베이스의 트랜잭션이 제약조건, cascades, triggers를 포함한 정의된 모든 조건에 맞게 데이터 값이 변경
    - 트랜잭션 실행 전의 데이터베이스 내용이 잘못되지 않으면 실행 후에도 데이터베이스의 내용이 잘못되면 안된다
    
- 고립성(Isolation)
    - 특정 DBMS에서 다수의 유저들이 같은 시간에 같은 데이터에 접근하였을 때 수행중인 트랜잭션이 완료될 때까지 다른 트랜잭션의 
      요청을 막음으로서 데이터가 꼬이는 것을 방지
  
 - 영속성(Durability)
    - 트랜잭션 실행이 성공적일 때, 그 트랜잭션이 갱신한 데이터베이스 내용은 영구적으로 저장
    
### 종류

- COMMIT
    - INSERT, UPDATE, DELETE문으로 변경된 데이터를 데이터베이스에 적용할 때 사용
    - COMMIT문 사용시 이전 데이터는 영원히 지워짐
    - COMMIT문 사용시 모든 사용자가 변경된 데이터 확인 가능
    - SQLServer는 기본적으로 AUTO COMMIT모드 이므로 자동으로 COMMIT을 수행
    
- ROLLBACK
    - INSERT, UPDATE, DELETE문으로 변경된 데이터를 변경 이전 상태로 되돌릴 때 사용
    - 데이터에 대한 변경사항 취소
    - ROLLBACK문 사용 시 이전 데이터 다시 재저장 → COMMIT되지 않은 상위 트랜잭션을 모두 ROLLBACK 시킴
    - ROLLBACK문 사용 시 관련 행의 잠금(LOCKING이 풀려 다른 사용자들이 데이터 변경 가능
    - SQLServer는 기본적으로 AUTO COMMIT모드이므로 자동으로 COMMIT을 수행하지만 오류가 발생하면 자동으로 ROLLBACK처리
    
- SAVEPOINT
    - 오류 복구에 효과적인  방법
    - 전체 트랜잭션을 ROLLBACK하지 않고도 오류 복귀가 가능
    - 효과적으로 오류 복구 처리를 위해 저장점을 만들어 놓고 사용
    - 복잡한 대규모 트랜잭션에서 에러가 발생했을 때 주로 사용
    - 복수의 저장점 정의 가능
    - 저장점 만들기 :`SAVEPOINT 저장점명;
	- 저장점까지 롤백할 때 : ROLLBACK TO 저장점명;		
 * */
-- 사원테이블에서 JON_ID가 'IT_PROG'인 사람들의 이름을 홍길동으로 바꾸기
UPDATE EMPLOYEES SET FIRST_NAME = '홍길동'
WHERE JOB_ID = 'IT_PROG';

SELECT * FROM EMPLOYEES e WHERE JOB_ID = 'IT_PROG';

