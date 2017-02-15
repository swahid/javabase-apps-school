-- preload dta insert role table value

-- ==========================
-- === Role Preload Insert ==
-- ==========================
INSERT INTO role(role_name, display_name, description) VALUES ('admin', 'Admin', 'Role Define For Administrative task');
INSERT INTO role(role_name, display_name, description) VALUES ('teacher', 'Teacher', 'Role Define For Teacher task');
INSERT INTO role(role_name, display_name, description) VALUES ('student', 'Student', 'Role Define For Student task');
INSERT INTO role(role_name, display_name, description) VALUES ('parent', 'Parent', 'Role Define For Parent task');
INSERT INTO role(role_name, display_name, description) VALUES ('staff', 'Staff', 'Role Define For Staff task');

-- ==========================
-- === User Preload Insert ==
-- ==========================

INSERT INTO user(role_id,is_active, create_date, email, is_acc_non_expired,is_pass_non_expired, is_non_locked, password, username)VALUES (1,true, now(), 'admin@jschool.com', true,true, true, '123456', 'admin');
INSERT INTO user(role_id,is_active, create_date, email, is_acc_non_expired,is_pass_non_expired, is_non_locked, password, username)VALUES (2,true, now(), 'teacher@jschool.com', true,true, true, '123456', 'teacher');
INSERT INTO user(role_id,is_active, create_date, email, is_acc_non_expired,is_pass_non_expired, is_non_locked, password, username)VALUES (3,true, now(), 'student@jschool.com', true,true, true, '123456', 'student');


-- ==========================
-- === Permission Insert ====
-- ==========================
INSERT INTO permission (perm_name, display_name, description, flag, perm_code)VALUES ('create', 'Insert', 'Insert Form', '', 001);
INSERT INTO permission (perm_name, display_name, description, flag, perm_code)VALUES ('read', 'View', 'View Form', '', 002);
INSERT INTO permission (perm_name, display_name, description, flag, perm_code)VALUES ('update', 'Update', 'Update Form', '', 003);
INSERT INTO permission (perm_name, display_name, description, flag, perm_code)VALUES ('delete', 'Delete', 'Delete Form', '', 004);
INSERT INTO permission (perm_name, display_name, description, flag, perm_code)VALUES ('library', 'Delete', 'Delete Form', '', 004);

-- ==========================
-- === UserRole Insert ====
-- ==========================
INSERT INTO user_permission(user_id, perm_id,is_active,grant_user,grant_date) VALUES (1, 5 ,1 ,1,now() );

-- ==========================
-- == UserPermission Insert =
-- ==========================
INSERT INTO role_permission(perm_id,role_id,is_active,grant_user,grant_date) VALUES (1, 1 ,1 ,1,now() );
INSERT INTO role_permission(perm_id,role_id,is_active,grant_user,grant_date) VALUES (2, 1 ,1 ,1,now() );
INSERT INTO role_permission(perm_id,role_id,is_active,grant_user,grant_date) VALUES (3, 1 ,1 ,1,now() );
INSERT INTO role_permission(perm_id,role_id,is_active,grant_user,grant_date) VALUES (4, 1 ,1 ,1,now() );
