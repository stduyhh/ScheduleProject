use schedules;

create table schedules
(
    schedule_id bigint auto_increment primary key comment "스케줄 식별 번호",
    user_name varchar(20) comment "사용자 이름",
    title varchar(50) comment "일정 제목",
    description varchar(200) comment "일정 내용",
    start_date datetime comment "일정 시작 일자",
    end_date datetime comment "일정 종료 일자",
    create_date datetime comment "일정 생성 일자"
);

alter table schedules modify column user_name varchar(20) not null ;
alter table schedules modify column title varchar(50) not null ;
alter table schedules modify column description varchar(200) not null ;

alter table schedules add column password varchar(20) not null comment "비밀번호";