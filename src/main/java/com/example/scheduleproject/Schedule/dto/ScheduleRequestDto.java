package com.example.scheduleproject.Schedule.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class ScheduleRequestDto {
    private long scheduleId;
    private String userName;
    private String title;
    private String description;
    private String password;
    private Date startTime;
    private Date endTime;
}
