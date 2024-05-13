-- 학생 테이블
CREATE TABLE TBL_STUDENT(
    ID NUMBER, 
    NAME VARCHAR2(100),
    MAJOR VARCHAR2(100),
    GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTRAINT BAN_CHAR CHECK(GENDER='M' OR GENDER='W'),
    BIRTH DATE CONSTRAINT BAN_DATE CHECK (BIRTH >= TO_DATE('1980-01-01', 'YYYY-MM-DD')),
    CONSTRAINT STD_PK PRIMARY KEY(ID)
);

/*### 무결성

- 데이터베이스에 저장된 데이터 값과 그것이 표현하는 현실 세계의 실제 값이 일치하는지 정확성을 의미
- 무결성 제약조건은 DB에 들어있는 데이터의 정확성을 보장하기 위해 부정확한 자료가 아닌 DB내에 저장되는 것을 방지하기 위한 제약 조건
- 데이터의 정확성, 일관성 유효성이 유지되게 하는 것
    - 정확성 : 중복이나 누락이 없는 상태
    - 일관성 : 원인과 졀과의 의미가 연속적으로 보장되어 변하지 않는 상태
    - 유효성 : 사용자로부터 값을 입력받을 떄 정확한 값만 입력되도록 하는 것
1. 개체 무결성
    - PK로 선택된 컬럼은 고유한 값을 가지며 빈값, NULL값은 허용X
2. 참조 무결성
    - 외래키 값은 NULL이거나 참조하는 테이블의 기본키로 설정된 속성과 동일
    - 즉, 테이블은 참조할 수 없는 외래키 값을 가질 수 없다
3. 도메인 무결성
    - 주어진 속성의 값들이 도메인에 속한 값이어야 한다.
4. 사용자 정의 무결성
    - 속성 값들이 사용자가 정의한 제약 조건에 만족해야 한다.

## 모델링

- 정보시스템 구축의 대상이 되는 업무 내용을 분석하고 이해하고 약속된 표기법에 의해 표현하는 것
- 분석된 모델을 가지고 실제 데이터 베이스를 생성하여 개발 및 관리에 사용
- 특히, 데이터를 추상화한 데이터 모델은 데이터베이스의 골격을 이해하고 그 이해를 바탕으로 SQL문장을 기능과 성능적인 측면에서 효율적으로 작성할 수 있기 때문에, 모델링 작업은 데이터베이스 설계의 핵심 과정이다

### 특징

- 추상화
    - 현실 세계를 일정한 형식에 맞춰 간략하게 표현
- 단순화
    - 누구나 쉽게 이해할 수 있도록 제한된 푝법이나 언어를 사용
- 명확화
    - 명확하게 의미가 해성되어야 하고, 한 가지 의미만을 가져야 한다
    
### 순서

1. 요구사항 분석
2. 개념 모델링
    - 내가 하고자 하는 일의 데이터 간의 관계를 구상하는 단계
    - 각 객체들과 그들관의 관계를 발견하고 표현하기 위해 ERD를 생성
3. 논리 모델링
    - 개념적인 데이터 모델이 완성되면 논리 데이터 모델을 만들어 내야 한다
    - KEY, 속성, 관계들을 표시하며, 정규화 활동을 수행한다
    - 정규화
        - 데이터 모델의 일관성을 확보하고 중복을 제거하여 신뢰성 있는 데이터 구조를 얻는데 목적
4. 물리 모델링
    - 최종적으로 데이터를 관리할 데이터베이스를 선택하고, 선택한 데이터베이스에 실제 테이블을 만드는 과정
    - 시각적인 구조로 만들었으면 그것을 실제로 SQL코딩을 통해 완성하는 단계
5. 구현
    - SQL문을 통한 실제 구현
    
    -- 1. 요구사항
    꽃 테이블과 화분테이블이 필요하고 곷을 구마할 때 화분도 같이 구매
    - 테이블에는 꽃이름, 색깔, 가격
    - 화분테이블에는 제품번호, 화분색깔, 화분모양, 꽃이름
    **/

CREATE TABLE FLOWER(
	name VARCHAR2(100) NOT NULL,
	color VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL,
	CONSTRAINT FLOWER_PK PRIMARY KEY(name)
);

CREATE TABLE POT(
	id NUMBER NOT NULL,
	color VARCHAR2(100) NOT NULL,
	pre VARCHAR2(100) NOT NULL,
	f_name VARCHAR2(100) NOT NULL,
	CONSTRAINT POT_PK PRIMARY KEY(id),
	CONSTRAINT fk_flower_name FOREIGN KEY (f_name) REFERENCES FLOWER(name)
);

DROP TABLE FLOWER;
DROP TABLE POT;

-- EMPLOYEES의 모든 정보 조회
SELECT * FROM EMPLOYEES;

-- DEPARTMENTS테이블의 모든 정보
SELECT * FROM DEPARTMENTS;

-- 사원테이블에서 이름, 직종, 급여 조회
SELECT FIRST_NAME, JOB_ID, SALARY FROM EMPLOYEES e ;

-- 사원테이블에서 사번, 이름, 직종, 급여, 보너스 비율, 실제 보너스
SELECT EMPLOYEE_ID,
	   FIRST_NAME, 
	   JOB_ID, SALARY,
	   COMMISSION_PCT,
	   (SALARY * COMMISSION_PCT) AS COMMISSION  
FROM EMPLOYEES e ;

-- 사원테이블에서 급여가 1만이상인 사원들을 사번, 이름, 급여순
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY  
FROM EMPLOYEES e
WHERE SALARY > 10000;

-- 사원테이블에서 이름이 Michael인 사원의 사번, 이름
SELECT EMPLOYEE_ID, FIRST_NAME
FROM EMPLOYEES e 
WHERE FIRST_NAME = 'Michael';

-- 사원테이블에서 직종이'IT_PROG'인 사원들의 정보를 사번, 이름, 직종, 급여 순으로 출력
SELECT EMPLOYEE_ID, FIRST_NAME , JOB_ID, SALARY 
FROM EMPLOYEES e 
WHERE JOB_ID ='IT_PROG';

-- 사원 테이블 에서 급여가 10000이상 13000 이하인 사원의 정보를 이름, 급여
SELECT FIRST_NAME , SALARY 
FROM EMPLOYEES e 
WHERE SALARY >= 10000 AND e.SALARY <= 13000
ORDER BY SALARY DESC;

-- 사원 테이블에서 입사일이 05년 9월 21인 사원의 정보를 사번, 이름, 입사일 순
SELECT EMPLOYEE_ID, FIRST_NAME , HIRE_DATE 
FROM EMPLOYEES e 
WHERE HIRE_DATE = '2005-09-21';












