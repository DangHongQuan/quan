create table manufactures (
    id int not null primary key auto_increment,
    code nvarchar(10) null,
    name nvarchar(50) null,
    address nvarchar(500) null
);

create table devices (
    id int not null primary key auto_increment,
    man_id int not null references manufactures(id),
    code nvarchar(10) null,
    name nvarchar(50) null,
    type nvarchar(50) null,
    quantity int null,
    price double null
);