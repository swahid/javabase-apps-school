-- preload dta insert role table value

-- ==========================
-- === Role Preload Insert ==
-- ==========================
INSERT INTO role(role_id,role_name, display_name, description) VALUES (1,'Admin', 'Admin', 'Role Define For Administrative task');

-- ==========================
-- === User Preload Insert ==
-- ==========================

INSERT INTO user(is_active, create_date, email, is_non_expired, is_non_locked, password, username)VALUES (true, now(), 'admin@jschool.com', true, true, '123456', 'admin');


-- ==========================
-- === Permission Insert ====
-- ==========================
INSERT INTO permission (perm_name, display_name, description, flag, perm_code)VALUES ('create', 'Insert', 'Insert Form', '', 001);
INSERT INTO permission (perm_name, display_name, description, flag, perm_code)VALUES ('read', 'View', 'View Form', '', 002);
INSERT INTO permission (perm_name, display_name, description, flag, perm_code)VALUES ('update', 'Update', 'Update Form', '', 003);
INSERT INTO permission (perm_name, display_name, description, flag, perm_code)VALUES ('delete', 'Delete', 'Delete Form', '', 004);

-- ==========================
-- === UserRole Insert ====
-- ==========================
INSERT INTO user_role(user_id, role_id) VALUES (1, 1);

-- ==========================
-- == UserPermission Insert =
-- ==========================
INSERT INTO role_permission(perm_id,role_id,is_active,grant_user) VALUES (1, 1 ,1 ,1 );
INSERT INTO role_permission(perm_id,role_id,is_active,grant_user) VALUES (2, 1 ,1 ,1 );
INSERT INTO role_permission(perm_id,role_id,is_active,grant_user) VALUES (3, 1 ,1 ,1 );
INSERT INTO role_permission(perm_id,role_id,is_active,grant_user) VALUES (4, 1 ,1 ,1 );
