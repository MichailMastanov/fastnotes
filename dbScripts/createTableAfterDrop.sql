create table if not exists user_accounts
(
id  bigserial not null,
email varchar(255),
first_name varchar(255),
is_enabled boolean not null,
last_auth_date timestamp not null,
password varchar(255),
last_name varchar(255),
reg_date timestamp not null,
primary key (id)
);

create table if not exists users_role
(
    user_id int not null,
    roles varchar(32),
    unique(user_id, roles)
);