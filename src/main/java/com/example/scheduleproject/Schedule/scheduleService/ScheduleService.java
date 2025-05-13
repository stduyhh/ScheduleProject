package com.example.scheduleproject.Schedule.scheduleService;

import com.example.scheduleproject.Schedule.dto.ScheduleRequestDto;
import com.example.scheduleproject.Schedule.dto.ScheduleResponseDto;

public interface ScheduleService {
    ScheduleResponseDto saveSchedule(ScheduleRequestDto dto);

    ScheduleResponseDto findById(Long id);
}
