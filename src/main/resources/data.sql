delete from user_roles;
delete from role;
delete from user;

insert into user(id, nom, prenom, email, password) values(1, 'Marchivesss', 'Cyril', 'cyril.marchive@gmail.com', '{bcrypt}$2a$10$F/kEGUBGtokJwiIWjTmtg.JLdeFqiftMeJ/MpmDkRU3Rt.NrWwlSq');
insert into user(id, nom, prenom, email, password) values(2, 'Boussat', 'Melanie', 'melanie.boussat@gmail.com', '{bcrypt}$2a$10$F/kEGUBGtokJwiIWjTmtg.JLdeFqiftMeJ/MpmDkRU3Rt.NrWwlSq');

insert into role(id, role) values(1, 'ROLE_ADMIN');
insert into role(id, role) values(2, 'ROLE_USER');

insert into user_roles(user_id, roles_id) values(1, 2);
insert into user_roles(user_id, roles_id) values(1, 1);
insert into user_roles(user_id, roles_id) values(2, 2);