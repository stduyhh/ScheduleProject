package com.example.scheduleproject.Schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Schedule {
    private int scheduleId;
    private String userName;
    private String password;
    private String title;
    private String description;
    private Date startTime;
    private Date endTime;
    private String createTime;

    public Schedule(int scheduleId, String userName, String password, String title, String description, Date startTime, Date endTime) {
        this.scheduleId = scheduleId;
        this.userName = userName;
        this.password = password;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTime);
    }
}
