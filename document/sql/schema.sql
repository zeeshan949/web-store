-- ----------------------------
-- Table structure for ums_member
-- ----------------------------
drop  table if exists ums_member;
create table if not exists ums_member
(
    id              bigint auto_increment primary key,
    username        varchar(64)  null comment 'username',
    password        varchar(64)  null comment 'password',
    status          int(1)       null comment 'account enabled: 0-> disabled; 1-> Enable',
    member_level_id bigint       null,
    nickname        varchar(64)  null comment 'nickname',
    phone           varchar(64)  null comment 'phone number',
    create_time     datetime     null comment 'Registered',
    icon            varchar(500) null comment 'head',
    gender          int(1)       null comment 'Gender: 0-> Unknown; 1-> Male; 2-> Female',
    birthday        date         null comment 'birthday',
    city            varchar(64)  null comment 'the city',
    job             varchar(100) null comment 'occupation',
    constraint idx_phone unique (phone),
    constraint idx_username unique (username)
) comment 'Member Table';

