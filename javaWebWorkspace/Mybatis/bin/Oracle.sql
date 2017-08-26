create table address(
add_id number(10) constraint address_add_id_pk primary key,
county varchar2(10),
province varchar2(10),
city varchar2(10),
zip varchar2(10)
);

insert into address values(1,'中国','北京','海定',100000);
insert into address values(2,'中国','上海','徐汇',200030);
insert into address values(3,'中国','江西','南昌',330000);
insert into address values(4,'中国','江苏','昆山',215300);
insert into address values(5,'中国','山西','太原',030001);

alter table students
add addr_id number(7) constraint students_addr_id_fk references address(addr_id);

 create table person(
 id number primary key,
 name varchar2(15),
 age number(7),
 addr_id number(7) constraint person_addr_id_fk references address(addr_id));

