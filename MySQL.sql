create table roles (
id int not null auto_increment,
name varchar(50),
primary key (id)
);

create table account (
id int not null auto_increment,
username varchar(50) null,
password varchar(50) null,
address varchar (100) null,
birthday date null,
primary key(id),
id_role int,
foreign key (id_role) references roles(id)

);

insert into login.roles (id,name) value ('1','user');
insert into login.roles (id,name) value ('0','admin');

insert into login.account(id, username, password, address, birthday)  value (1, 'admin', '123456', 'TH', 1991);
insert into login.account(id, username, password, address, birthday) value (0, 'vannhang','123456','TH',1996);

select * from account where username = ? and password = ?;
