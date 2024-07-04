select * from EMPLOYEES;

-- select 다음 내가 가져오고 싶은 솏성을 입력하면 원하는 속성만 가져올 수 있어여
selecy email, phone_number from employees;

-- 모든 sql 명령어는 ;으로 끝난다
-- 이클립스에서 여러개의 명령어를 한꺼번에 그룹으로 ㅅ실행하고자 할ㄸ꺠는 반드시 ;을 입력
-- 이클립스에서 한개의 명령만 실행하는 경우 ; 입력 안해도 괜찮
-- 속성명은 내망대로 별명 지울 수 있음
-- as 별명을 쓰거나 한칸 띄고 별명을 써서 별명을 지을 수 있ㄲ다
select email as "이메일", phone_number as "전화번호" from employees;
-- sql에서 문자는 '', 열이름은 ""을 쓴다
select email, phone_number from emplyees where email = 'sking';
-- db에서 예약어ㅡ 속성명, 테이블 명 등은 대소문ㄴ자를 구분하지 않는데, 데이터의 내용에서는 대문자를 구분한다
select email, phone_number from employees where email = 'SKING';

select * from EMPLOYEES order by phoner_number;

select commission_pct, salary from employees order by commission_pct desc;

--Null은 특수한 데이터로 아무것도 아닌것, ' '나 ''와는 다르다

--집단 함수는 같은 열을 계산할 때 사용
--sum, avg, max, min, dev 엑셀과비슷
select sum(salary) from employees

select deplartment_id, sum(salary) from employees group by department_id;
--join 하는 방법은 여러가지
select * from employees, departments where employees.department_id = departments.department_id;

select * from employees where department_id is null;
--2개 이상의 테이블을 아용하여 조회하는 경우에는 테이블명.속성명을 select 다음에 써줘야 하는데, 두개의 테이블에 공통적으로 사용하는 속성명이 아닌 경우 테이블 이름 생략 가능
select * from employees e, departments d where e.department_id = d.department_id;
--inner join
--null도 가져올랭
-- outer join
select first_name, last_name, d.department_id, department_name from employees e inner join DEPARTMENTS d on e.department_id = d.department_id;

select first_name, last_name, d.department_id, department_name from employees e left outer join DEPARTMENTS d on e.department_id = d.department_id;

insert into employees (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary) values (207, 'soyou', 'shin', 'ewha', '134', sysdate, 'SH_CLERK', 5000);
