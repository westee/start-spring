create table user (
    id bigint primary key auto_increment,
    name varchar (100)
);

create table match (
    id bigint primary key auto_increment,
    user_id bigint,
    score int
);

insert into user (id, name) values (1,'aaa');
insert into user (id, name) values (2,'bbb');
insert into user (id, name) values (3,'ccc');
insert into user (id, name) values (4,'ddd');
insert into user (id, name) values (5,'eee');
insert into user (id, name) values (6,'fff');

insert into match (id, user_id, score) values (1, 1, 1000);
insert into match (id, user_id, score) values (2, 2, 2000);
insert into match (id, user_id, score) values (3, 3, 3000);
insert into match (id, user_id, score) values (4, 4, 4000);
insert into match (id, user_id, score) values (5, 5, 5000);
insert into match (id, user_id, score) values (6, 6, 6000);