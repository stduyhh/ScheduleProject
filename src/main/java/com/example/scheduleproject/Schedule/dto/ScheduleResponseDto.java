package com.example.scheduleproject.Schedule.dto;

import com.example.scheduleproject.Schedule.entity.Schedule;
import lombok.Getter;

import java.util.Date;

@Getter
public class ScheduleResponseDto {
    private long scheduleId;
    private String userName;
    private String title;
    private String description;
    private String password;
    private Date startTime;
    private Date endTime;


    public ScheduleResponseDto(Schedule schedule){
        this.scheduleId = schedule.getScheduleId();
        this.userName = schedule.getUserName();
        this.title = schedule.getTitle();
        this.description = schedule.getDescription();
        this.password = schedule.getPassword();
        this.startTime = schedule.getStartTime();
        this.endTime = schedule.getEndTime();
    }
}
