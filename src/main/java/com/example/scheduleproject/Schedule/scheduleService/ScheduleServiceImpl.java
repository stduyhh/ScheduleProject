package com.example.scheduleproject.Schedule.scheduleService;


import com.example.scheduleproject.Schedule.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements Scheduleservice {
    private final ScheduleRepository repository;

    public ScheduleServiceImpl(ScheduleRepository repository) {
        this.repository = repository;
    }
}
