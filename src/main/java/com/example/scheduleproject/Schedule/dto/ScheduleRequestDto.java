package com.example.scheduleproject.Schedule.dto;

import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    private int scheduleId;
    private String userName;
    private String title;
    private String description;
    private String password;
}
