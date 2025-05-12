package com.example.scheduleproject.Schedule.entity;

import com.example.scheduleproject.Schedule.dto.ScheduleRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@AllArgsConstructor
public class Schedule {
    private long scheduleId;
    private String userName;
    private String password;
    private String title;
    private String description;
    private Date startTime;
    private Date endTime;
    private String createTime;

    public Schedule(long scheduleId, String userName, String password, String title, String description, Date startTime, Date endTime) {
        this.scheduleId = scheduleId;
        this.userName = userName;
        this.password = password;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTime);
    }

    public void createSchedule(ScheduleRequestDto scheduleRequestDto){
        this.scheduleId = scheduleRequestDto.getScheduleId();
        this.userName = scheduleRequestDto.getUserName();
        this.title = scheduleRequestDto.getTitle();
        this.description =  scheduleRequestDto.getDescription();
        this.password = scheduleRequestDto.getPassword();
    }
}
