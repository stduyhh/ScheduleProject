package com.example.scheduleproject.Schedule.controller;

import com.example.scheduleproject.Schedule.dto.ScheduleRequestDto;
import com.example.scheduleproject.Schedule.dto.ScheduleResponseDto;
import com.example.scheduleproject.Schedule.scheduleService.Scheduleservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedules")
public class ScheduleContorller {
    private final Scheduleservice scheduleservice;

    public ScheduleContorller(Scheduleservice scheduleservice) {
        this.scheduleservice = scheduleservice;
    }

    @PostMapping
    public ResponseEntity<ScheduleResponseDto> createSchedule(@RequestBody ScheduleRequestDto scheduleRequestDto){
        long schduleId =
    }
}
