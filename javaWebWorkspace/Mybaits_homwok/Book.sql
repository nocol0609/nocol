create table Book(
	id number(7),
	bookname varchar2(20) not null primary key,
	author varchar2(20),
	publishDate date,
	price number(7,2)
)