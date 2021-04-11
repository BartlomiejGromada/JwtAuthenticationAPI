INSERT INTO user_role (role_name) VALUES ('ROLE_ADMIN');
INSERT INTO user_role (role_name) VALUES ('ROLE_USER');
INSERT INTO user_role (role_name) VALUES ('ROLE_ADMINNEW');


INSERT INTO USER(id_user, username, password, first_name, last_name, is_enabled, is_account_non_expired,
                 is_account_non_locked, is_credentials_non_expired)
VALUES (1, 'bartas', '$2a$04$L8iDk8VsveGNz7HeIIrJMOyFkITgoju8cw7d2qH8OgpdcSMhRy8dS',
        'Bartłomiej', 'Gromada', true, true,
        true, true),
       (2, 'tom', '$2a$04$GtRIK6mtR6n6qIdsTtXPJuJyvQErwiRe4X55YNk3lAqEuAA/5KQHu',
        'Tomasz', 'Kowalski', true, true,
        true, true),
       (3, 'kasia', '$2a$04$L8iDk8VsveGNz7HeIIrJMOyFkITgoju8cw7d2qH8OgpdcSMhRy8dS',
        'Kasia', 'Nowak', true, true,
        true, true);


INSERT INTO USER_USER_ROLE(user_id, user_role_id)
VALUES (1, 1),
       (2, 2),
       (3, 1);




