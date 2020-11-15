insert into user_accounts (
                           email,
                           first_name,
                           last_name,
                           password,
                           is_enabled,
                           reg_date,
                           last_auth_date)
values (
        'fastnotes01@gmail.com',
        'Pavel',
        'Durov',
        'pswd',
        'true',
        '2020-11-13 12:00',
        '2020-11-13 12:01');


insert into users_role
(
 user_id, roles
) VALUES
(
 1, 'ADMIN'
);