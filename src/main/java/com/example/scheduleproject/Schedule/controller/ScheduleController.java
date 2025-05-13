package com.example.scheduleproject.Schedule.controller;


import com.example.scheduleproject.Schedule.dto.ScheduleRequestDto;
import com.example.scheduleproject.Schedule.dto.ScheduleResponseDto;
import com.example.scheduleproject.Schedule.scheduleService.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {
    private final ScheduleService scheduleservice;

    public ScheduleController(ScheduleService scheduleservice) {
        this.scheduleservice = scheduleservice;
    }
    @PostMapping
    public ResponseEntity<ScheduleResponseDto> createSchedule(@RequestBody ScheduleRequestDto dto){
        //user 요청, 응답
        return new ResponseEntity<>(scheduleservice.saveSchedule(dto), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScheduleResponseDto> findById (@PathVariable Long id){
        return new ResponseEntity<>(scheduleservice.findById(id), HttpStatus.OK);
    }


}
