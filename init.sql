drop table if exists person;
CREATE TABLE person
(
    id          INTEGER PRIMARY KEY autoincrement,
    person_name varchar(11)  NOT NULL,
    gender      varchar(1)   not null,
    birthday    date         NOT NULL,
    address     varchar(50)  NOT NULL,
    company     varchar(100) not null,
    email       varchar(50),
    avatar      text,
    ringtones   text,
    status      varchar(1)   not null,
    remark      varchar(512),
    input_time  datetime     not null,
    update_time datetime     not null
);

INSERT INTO person (id, person_name, gender, birthday, address, company, email, avater, ringtones, statue, remark,
                    input_time, update_time)
VALUES (null, '李娟', '0', '1715212800000', '西安', '大大撒旦', '飞洒地方撒旦飞洒地方', '发大师傅撒地方', '发士大夫萨芬', '1', '发生发射点发射点',
        '1721606098000', '1729986892000');
INSERT INTO person (id, person_name, gender, birthday, address, company, email, avater, ringtones, statue, remark,
                    input_time, update_time)
VALUES (null, '李娟2', '0', '1720656000000', '西安', '大大撒旦', '飞洒地方撒旦飞洒地方', '发大师傅撒地方', '发士大夫萨芬', '1', '发生发射点发射点',
        '1721606227000', '1721606234000');


drop table if exists person_card;
CREATE TABLE person_card
(
    id           INTEGER PRIMARY KEY autoincrement,
    person_id    integer     NOT NULL,
    card_no      varchar(11) not null,
    card_type_id varchar(1)  not null,
    status       varchar(1)  not null,
    input_time   datetime    not null,
    update_time  datetime    not null
);

drop table if exists card_type;
CREATE TABLE card_type
(
    id             INTEGER PRIMARY KEY autoincrement,
    card_type_name integer    NOT NULL,
    status         varchar(1) not null,
    remark         varchar(512),
    input_time     datetime   not null,
    update_time    datetime   not null
);
