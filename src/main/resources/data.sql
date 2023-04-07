insert into
    MANUFACTURES (Code, Name, Address)
values
    ('MAN-1', 'Sanno', 'Tokyo'),
    ('MAN-2', 'Yuki', 'Kyoto'),
    ('MAN-3', 'Shiro', 'Tokyo');

insert into
    DEVICES (code, Name, Type, Quantity, Price, Man_ID)
values
    ('PRO-1', 'BOXDG', 'Mainboard', 5, 70, 1),
    ('PRO-2', 'GAG31MS2L', 'Mainboard', 10, 100, 2),
    ('PRO-3', 'GAG33MDS2R', 'Mainboard', 10, 120, 2),
    ('PRO-4', '1GB DDRAM', 'RAM', 30, 40, 3),
    ('PRO-5', '512MB DDRAM', 'RAM', 20, 35, 3),
    ('PRO-6', '256MB DDRAM', 'RAM', 20, 30, 3);