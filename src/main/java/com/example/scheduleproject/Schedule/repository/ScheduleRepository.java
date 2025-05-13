package com.example.scheduleproject.Schedule.repository;

import com.example.scheduleproject.Schedule.entity.Schedule;

public interface ScheduleRepository {
    Schedule saveSchedule(Schedule schedule);

    Schedule findById(Long id);
}
