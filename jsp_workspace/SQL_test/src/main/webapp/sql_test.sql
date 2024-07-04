--모든 쿼리문은 세미콜론으로 끝난다
-- *는 모든 것
--select * from EMPLOYEES;
--select * from DEPARTMENTS;

--원하는 속성만을 가져오고 싶은 경우에는 *대신 속성명을 써주면 됨
select last_name, first_name from EMPLOYEES;

--속성명은 조회할때 변경 가능
-- 변경하기 위해서는 as 변경속성명을 쓰거나
-- 한칸 띄고 변경 성명을 쓰면 된다.
select last_name 성, first_name as 이름 from EMPLOYEES; 

--변경 속성명에 특수문자나 빈칸이 있는 경우에는 반드시 쌍따옴표를 써야한다.
select last_name as 성, first_name 이름, phone_number "전화 번호" from EMPLOYEES;

--데이터베이스에서 문자는 '' 열이름은 ""을 써야 한다
select last_name as 성, first_name 이름, phone_number "전화 번호" from EMPLOYEES where last_name = 'King';

--속성을 연결하려는 경우에는 연결연산자 ||를 사용해야 한다.

select last_name || ' ' || first_name "이름", phone_number "전화 번호" from EMPLOYEES;

--select문에 단순한 연산을 할 수 있다.
select 1+3 from dual;
select 1+3 from employees;
-- 월급을 10% 올리는 연산 해보기
select salary * 1.1 from employees;
-- 연결연산자는 db에 들어있는 값 이외에 문자와도 연결 가능한다
select '$'||salary from employees;

-- 같다는 ==가 아니라 =
-- 논리연산자는 &&는 and, ||는 or 사용
-- 비교연산자는 자바와 같다
select salary from EMPLOYEES where salary >= 5000 and salary <= 10000; 
select * from EMPLOYEES where salary between 5000 and 10000;

--이름에 a가 들어간 사람들 가져오기
--%기호는 아무글자나 (빈문자포함)를 의미한다.
select last_name from EMPLOYEES where last_name like '%a%';

--가져온 데이터는 순서대로 볼 수 있다.
select * from employees order by last_name desc;
---order by 에 아무것도 안쓰면 오름차순
select * from employees order by last_name;

--조회해 오는 속성의 순서를 order by절의 속성 이름을 대신해서 사용할 수 있다
select * from employees order by 3;
-- last_name으로 정렬한 후 first_name도 오름차순으로 정렬하고 싶어요
select * from employees order by 3, 2;

-- ㅈㅇ렬은 섞어서 사용할 수 있어요
-- first_name의 내림차수느 last_name 오름차순으로 정렬
select * from employees order by 3 desc, 2;

select * from EMPLOYEES where first_name like '___';
select * from EMPLOYEES where first_name like 'P__';
-- db에서 null은 아무것도 아닌것에 해당해도
-- ' ' 공백문자나 ''빈문자와는 다른 의미입니다.
select * from EMPLOYEES where commission_pct is null; 
select * from EMPLOYEES where commission_pct is not null; 
-- null은 특수 데이터이기때문에 정렬이 DB마다 달라요
-- 오라클에서는 오름차순인 경우에는 null이 맨 마지막
-- 내림차순인 경우에는 null이 맨 뒤에 나와용
select * from employees order by commission_pct desc;

select * from employees order by commission_pct desc nulls last;

--컬럼의 들어있는 값을 가지고 연산을 하는 경우애는 COUNTRIES-- 집합연산자를 써요
select sum(salary) from EMPLOYEES;

--부서별 월급의 합을 구하기를 할때는
--부서별로 그룹을 만들어 줘야 해서 group by젛을 사용
select department_id, sum(salary) from employees group by department_id;

--부서번호의 오름차순으로 정렬해서 월급의 합을 보기
select department_id, sum(salary) from employees group by department_id order by 1 asc;