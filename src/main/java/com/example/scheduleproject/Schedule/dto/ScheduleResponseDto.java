package com.example.scheduleproject.Schedule.dto;

import com.example.scheduleproject.Schedule.entity.Schedule;
import lombok.Getter;

import java.util.Date;

@Getter
public class ScheduleResponseDto {
    private Long id;
    private String name;
    private String title;
    private String password;
    private Date create_date;

    public ScheduleResponseDto(Schedule schedule){
        this.id = schedule.getId();
        this.name = schedule.getName();
        this.title = schedule.getTitle();
        this.password = schedule.getPassword();
        this.create_date = schedule.getCreate_date();
    }
}
