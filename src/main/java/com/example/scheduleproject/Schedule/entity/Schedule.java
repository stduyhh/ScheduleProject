package com.example.scheduleproject.Schedule.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@AllArgsConstructor
public class Schedule {

    @Setter
    private Long id;
    private String name;
    private String title;
    private String password;
    private Date  create_date;

    public Schedule(String name, String title, String password, Date create_date){
        this.id = id;
        this.name = name;
        this.title = title;
        this.password = password;
        this.create_date = create_date;

    }
}
