-- 회원 테이블

create table member(
    mno         int         auto_increment,/*순번이 자동으로 생성*/
    userid      varchar(18) unique,
    password    varchar(18) not null ,
    name        varchar(10) not null ,
    email       varchar(50) not null ,
    regdate     datetime    default current_timestamp,
    primary key (mno)
);

-- 게시판 테이블
create table board(
    bno         int             auto_increment,
    title       varchar(100)    not null,
    userid      varchar(18)     not null ,
    regdate     datetime        default current_timestamp,
    views       int             default 0,
    contents    text            not null ,
    primary key (bno),
    foreign key (userid) references member(userid)
);