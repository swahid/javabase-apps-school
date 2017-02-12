-- preload dta insert role table value

insert into role(roleid,rolename)	values( 1, 'admin');
insert into role(roleid,rolename)	values( 2, 'developer');
insert into user(userid,roleid,email,username,password,isactive,isnonexpired,isnonlocked)	values( 1,1, 'admin@jschool.com', 'admin','123456','Y','Y','Y');
insert into privilege(privilege_id,privilege_name)	values( 1, 'create');
insert into privilege(privilege_id,privilege_name)	values( 2, 'read');
insert into privilege(privilege_id,privilege_name)	values( 3, 'update');
insert into privilege(privilege_id,privilege_name)	values( 4, 'delete');
insert into user_privilege(user_privilege_id,privilege_id,roleid,userid)	values('1', 1,  '1','1');
insert into user_privilege(user_privilege_id,privilege_id,roleid,userid)	values('2', 2,  '1','1');
insert into user_privilege(user_privilege_id,privilege_id,roleid,userid)	values('3', 3,  '1','1');
insert into user_privilege(user_privilege_id,privilege_id,roleid,userid)	values('4', 4,  '1','1');