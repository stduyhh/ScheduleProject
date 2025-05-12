package com.example.scheduleproject.Schedule.dto;

import com.example.scheduleproject.Schedule.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private long scheduleId;
    private String userName;
    private String title;
    private String description;
    private String password;


    public ScheduleResponseDto(Schedule schedule){
        this.scheduleId = schedule.getScheduleId();
        this.userName = schedule.getUserName();
        this.title = schedule.getTitle();
        this.description = schedule.getDescription();
        this.password = schedule.getPassword();
    }
}
