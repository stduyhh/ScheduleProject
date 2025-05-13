package com.example.scheduleproject.Schedule.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class ScheduleRequestDto {
    private String name;
    private String title;
    private String password;
    private Date create_date;
}
