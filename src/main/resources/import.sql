-- preload dta insert role table value

insert into role(roleid,rolename)	values( 1, 'admin');
insert into role(roleid,rolename)	values( 2, 'developer');
insert into user(userid,roleid,email,username,password,isactive,isnonexpired,isnonlocked)	values( 1,1, 'admin@jschool.com', 'admin','123456','Y','Y','Y');
insert into privilege(privilege_id,privilege_name,roleid,userid)	values( 1, 'create', '1','1');
insert into privilege(privilege_id,privilege_name,roleid,userid)	values( 2, 'read', '1','1');
insert into privilege(privilege_id,privilege_name,roleid,userid)	values( 3, 'update', '1','1');
insert into privilege(privilege_id,privilege_name,roleid,userid)	values( 4, 'delete', '1','1');