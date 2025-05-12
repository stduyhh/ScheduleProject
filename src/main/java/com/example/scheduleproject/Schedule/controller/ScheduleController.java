package com.example.scheduleproject.Schedule.controller;

import com.example.scheduleproject.Schedule.dto.ScheduleRequestDto;
import com.example.scheduleproject.Schedule.dto.ScheduleResponseDto;
import com.example.scheduleproject.Schedule.entity.Schedule;
import com.example.scheduleproject.Schedule.scheduleService.Scheduleservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    private final Map<Long, Schedule> scheduleMap = new HashMap<>();

    private final Scheduleservice scheduleservice;

    public ScheduleController(Scheduleservice scheduleservice) {
        this.scheduleservice = scheduleservice;
    }

    @PostMapping
    public ResponseEntity<ScheduleResponseDto> createSchedule(@RequestBody ScheduleRequestDto scheduleRequestDto){
        Schedule schedule = new Schedule(
                scheduleRequestDto.getScheduleId(),
                scheduleRequestDto.getUserName(),
                scheduleRequestDto.getPassword(),
                scheduleRequestDto.getTitle(),
                scheduleRequestDto.getDescription(),
                scheduleRequestDto.getStartTime(),
                scheduleRequestDto.getEndTime()
        );

        scheduleMap.put(schedule.getScheduleId(), schedule);
        return new ResponseEntity<>(new ScheduleResponseDto(schedule), HttpStatus.CREATED);

    }
}
