/* Populate tabla clientes */


INSERT INTO items (nombre, marca, modelo, descripcion, precio, create_at) VALUES('MACBOOK', 'Apple', 'M1','Laptop de alta Gama',30000.00, '2020-01-01');
INSERT INTO items (nombre, marca, modelo, descripcion, precio, create_at) VALUES('MOUSE', 'Delux', 'Pro','Mouse Pro',30000.00, '2021-01-01');
INSERT INTO items (nombre, marca, modelo, descripcion, precio, create_at) VALUES('TV', 'SAMSUNG', '8k','TV de gran definición',50000.00, '2022-01-01');


/* Creamos algunos usuarios con sus roles */
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('bancamifel','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Banca', 'Mifel','bancamifel@bm.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',1, 'Administrador', 'admin','admin@admin.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);