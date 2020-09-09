drop table member;
create table member (
	code varchar2(10) not null,
	name varchar2(30) not null,
	id varchar2(30),
	pwd varchar2(15),
	age number(5)
)

insert into member(code, name, id, pwd, age)
 values('1001', '강지아', 'jeea', '1111', 20);
 
insert into member(code, name, id, pwd, age)
 values('1002', '이장미', 'rose', '2222', 20);
 
insert into member(code, name, id, pwd, age)
 values('1003', '김백합', 'lily', '333', 18);
 
insert into member
 values('1004','홍길동','gildong','444',18);
 --조회(검색) select 필드명들 from 테이블명;
 select * from member;
 select code, name from member;
 select code, name, age from member where code='1001';
 select age from member;
 select distinct age from member;
 select * from member where name='홍길동';
 select * from member where name like '홍%';
 select * from member where name like '%홍%';
 select * from member where name like '김__' and code='1004';
 select * from member order by code asc;
 select * from member order by name desc;
 select name, '당신의나이는', age from member;
 select name, age+10 from member;
 select count(*) from member;
 --count(), sum(), avg(), max(), min() 집단함수
 select * from member where age in(20,30);
 select * from member where age=20 or age=30; --위에꺼랑 같은 의미
 select * from member where age not in(20,30);
 select * from member where age between 20 and 30;
 select * from member where pwd is null; -- 완전히 일치할 때만 = 씀
 select * from member where pwd is not null;
 select avg(age) from member;
 select age, count(age) from member group by age;
 
 --수정(업데이트)update 테이블명 set 수정내용 where 조건;
 update member set pwd='1234' where name='이장미';--where뒤에 이름이 이장미인 사람
 select * from member;
 update member set code='1005' where name like '홍%'; --%나 like는 like 써야함
 update member set age=age+1 where name='홍길동' and pwd='444';
 
 --DB에서 레코드 삭제(제거) delete from 테이블명 where 조건;
 delete from member where name='이장미';
 select * from member;
 delete from member where name like '%홍%'
 
 delete from member;
 
 --DML (데이터조작언어)-insert, select, update, delete
 --DDL(데이터 정의 언어)- create, alter, drop
 
 --구조변경 alter table 테이블명 add(  )
 --구조변경 alter table 테이블명 modify
 --구조변경 alter table 테이블명 drop
 
 alter table member add(email varchar2(20));
 select * from member;
 alter table member modify(email varchar2(40));
 select * from member;
 
 alter table member drop column email;
 
 alter table member modify( code varchar2(10) primary key);
 
 drop table member;
 
 
 