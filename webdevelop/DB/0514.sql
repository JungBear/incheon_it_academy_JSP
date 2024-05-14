SELECT * FROM EMPLOYEES e ;

-- 사원테이블에서 06년도에 입사한 사원들의 정보를 사번, 이름, 직종, 입사일 순
SELECT EMPLOYEE_ID ,FIRST_NAME ,JOB_ID , HIRE_DATE 
FROM EMPLOYEES e 
WHERE e.HIRE_DATE >= TO_DATE('20060101','yyyymmdd') AND HIRE_DATE <= TO_DATE('20061231', 'yyyymmdd');

SELECT EMPLOYEE_ID , FIRST_NAME , JOB_ID,HIRE_DATE 
FROM EMPLOYEES e 
WHERE HIRE_DATE BETWEEN TO_DATE('20060101','yyyymmdd') AND TO_DATE('20061231','yyyymmdd');  

-- 사원 테이블에서 급여가 5000이상이고 6000이하인 사원의 정보를 사번 이름 급여 순으로
SELECT EMPLOYEE_ID , FIRST_NAME ,SALARY 
FROM EMPLOYEES e 
WHERE SALARY BETWEEN 5000 AND 6000;

-- IN
-- 직종이 SA_MAN IT_PROG인 사원들의 정보를 이름, 직종 순
SELECT FIRST_NAME , JOB_ID 
FROM EMPLOYEES e 
WHERE JOB_ID IN ('SA_MAN', 'IT_PROG');

-- 급여가 2200, 3200, 5000을 받는 사원들의 정보를 이름, 직종, 급여순으로 출력
SELECT FIRST_NAME , JOB_ID , SALARY 
FROM EMPLOYEES e 
WHERE SALARY IN(2200, 3200, 5000);

-- LIKE
-- 사원테이블에서 사원들의 이름중 M으로 시작하는 사원들의 정보를 사번, 이름, 직종 순으로 출력
SELECT EMPLOYEE_ID , FIRST_NAME , JOB_ID 
FROM EMPLOYEES e 
WHERE FIRST_NAME LIKE 'M%';

-- 사원테이블에서 이름이 d로 끝나는 사원들의 정보를 사번, 이름, 직종을 출력
SELECT EMPLOYEE_ID , FIRST_NAME , JOB_ID 
FROM EMPLOYEES e 
WHERE FIRST_NAME LIKE '%d';

-- 이름의 첫글자가 M이면서 총 7글자의 이름을 가진 사원의 정보를 사번, 이름 순으로 출력
SELECT EMPLOYEE_ID , FIRST_NAME 
FROM EMPLOYEES e 
WHERE FIRST_NAME LIKE 'M______';

-- 이름에 소문자 o가 들어가면서 이름이 a로 끝나는 사원들의 정보를 이름, 급여 순으로 조회
SELECT FIRST_NAME , SALARY 
FROM EMPLOYEES e 
WHERE FIRST_NAME LIKE '%o%a';

-- 사원테이블에서 이름의 세번째 글자에 a가 들어가는 사원의 정보를 사번, 이름 순으로 출력
SELECT EMPLOYEE_ID , FIRST_NAME 
FROM EMPLOYEES e 
WHERE FIRST_NAME LIKE '__a%';

-- 이름이 H로 시작하면서 6글자 이상인 사원들의 정보를 사번, 이름순으로 조회
SELECT EMPLOYEE_ID , FIRST_NAME 
FROM EMPLOYEES e 
WHERE FIRST_NAME LIKE 'H_____%';

-- 사원테이블에서 이름에 s가 포함되어 있지 않은 사원들의 정보를 사번, 이름으로 검색
SELECT EMPLOYEE_ID , FIRST_NAME  
FROM EMPLOYEES e 
WHERE FIRST_NAME NOT LIKE '%s%';

-- OR연산자를 통해 여러조건을 검색
SELECT EMPLOYEE_ID , FIRST_NAME 
FROM EMPLOYEES e 
WHERE FIRST_NAME LIKE '%el%' OR FIRST_NAME  LIKE '%en%';

-- REGEXP_LIKE
SELECT EMPLOYEE_ID , FIRST_NAME 
FROM EMPLOYEES e 
WHERE REGEXP_LIKE(FIRST_NAME, 'el|en') ;

-- A% -> ^A
-- %A -> A$

-- INSERT
-- INSERT INTO

INSERT INTO TBL_STUDENT (id, name, major, gender, birth)
VALUES (0, '홍길동', '컴퓨터공학과', 'M', TO_DATE('1980-01-02','YYYY-MM-DD'));

SELECT * FROM TBL_STUDENT ts ;

INSERT INTO TBL_STUDENT (id, name, major,  birth)
VALUES (1, '김길동', '컴퓨터공학과',  TO_DATE('1980-01-02','YYYY-MM-DD'));

INSERT INTO TBL_STUDENT (id, name, major, gender, birth)
VALUES (2, '홍길동', '컴퓨터공학과', 'M', TO_DATE('1999-01-02','YYYY-MM-DD'));

INSERT INTO TBL_STUDENT (id, name, major, birth)
VALUES (3, '박길동', '컴퓨터공학과', TO_DATE('2020-03-02','YYYY-MM-DD'));

INSERT INTO TBL_STUDENT 
VALUES (4, '홍길동', '컴퓨터공학과', 'M', TO_DATE('1999-01-02','YYYY-MM-DD'));

-- 테이블에서 SELECT한 데이터를 INSERT한 경우
-- SELECT한 테이블의 속성의 갯수와 INSERT하려고 하는 테이블의 속성의 개수가 일치

-- UPDATE

UPDATE TBL_STUDENT 
SET NAME = '제임스';

UPDATE TBL_STUDENT 
SET MAJOR = '산업경영공학과'
WHERE ID = 1;

SELECT * FROM TBL_STUDENT ts ;

-- DELETE
DELETE FROM TBL_STUDENT
WHERE ID BETWEEN 0 AND 2;

DELETE FROM TBL_STUDENT;

-- ORDER BY
-- 사원테이블에서 급여를 많이 받는 사원순으로 사번, 이름, 급여, 입사일을 출력
SELECT EMPLOYEE_ID , FIRST_NAME , SALARY , HIRE_DATE 
FROM EMPLOYEES e 
ORDER BY SALARY DESC;

SELECT EMPLOYEE_ID , FIRST_NAME , SALARY , HIRE_DATE 
FROM EMPLOYEES e 
ORDER BY SALARY DESC, HIRE_DATE ;

-- 사원테이블에서 부서번호가 빠른순, 부서번호가 같다면 직종이 빠른순, 직종까지 같다면 급여를 많이 받는 순으로 
-- 사번 이름 부서번호 직종 급여순 조회
SELECT EMPLOYEE_ID , FIRST_NAME , DEPARTMENT_ID , JOB_ID , SALARY 
FROM EMPLOYEES e 
ORDER BY DEPARTMENT_ID, JOB_ID, SALARY DESC;

-- 급여가 15000이상인 사원들의 사번, 이름, 급여, 입사일을 입사일이 빠른 순으로 조회
SELECT EMPLOYEE_ID , FIRST_NAME , SALARY , HIRE_DATE 
FROM EMPLOYEES e 
WHERE SALARY >= 15000
ORDER BY HIRE_DATE ;

/*
## 정규화

- 함수적 종속성
    - 하나의 테이블에서 하나의 컬럼의 값(X)가 다른 컬럼의 값(Y)을 결정하는 관계
    - 정규화가 잘된 테이블일수록 결정자 X는 PK한개이고 종속자가 여러개인 주소를 갖는다
    - 종속자가 기본키에만 종속되며, 기본키가 여러 속성으로 구성된 경우 기본키를 구성하는 모든 속성이 포함된 기본키의 부분집합에 종속된 경우를 완전함수종속이라고 한다
- 부분함수 종속
    - 테이블에서 기본키가 복합키일 경우 기본키를 구성하는 속성 중 일부에게 종속된 경우를 부분함수 종속이라고 한다
    
- 이행함수 종속
    - 테이블에서 X, Y, Z라는 세개의 컬럼이 존재할 때 X→Y, Y→Z란 종속관계가 있을 경우 X→Z가 성립되는 것을 이행적 함수 종속

### 정규화

- 불필요한 컬럼이나 데이터를 걸러내는 작업
- 논리모델링시 정규화를 진행
- 1차 ~ 5차까지 있지만 대부분 3차까지 진행
- 1NF (도메인이 원자값)
    - 도메인이 원자값이어야 한다.
- 2NF (부분함수 종속)
    - 1차 정규화의 조건을 만족하며 테이블의 모든 컬럼이 서로 관계가 있어야한다
- 3NF ( 이행적 함수 종속 제거)
    - 2차 정규화의 조건을 만족하면서 이행적 함수 종속 제거를 해야한다.

### 정규화의 이점

- 저장공간을 최소화할 수 있고, 데이터 변경 시 데이터의 불일치 성을 최소화하거, 연산작업을 최소화 할 수 있다.*/
