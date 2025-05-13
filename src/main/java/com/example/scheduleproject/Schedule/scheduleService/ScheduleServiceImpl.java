package com.example.scheduleproject.Schedule.scheduleService;


import com.example.scheduleproject.Schedule.dto.ScheduleRequestDto;
import com.example.scheduleproject.Schedule.dto.ScheduleResponseDto;
import com.example.scheduleproject.Schedule.entity.Schedule;
import com.example.scheduleproject.Schedule.repository.ScheduleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public ScheduleResponseDto saveSchedule(ScheduleRequestDto dto) {
        Schedule schedule = new Schedule(dto.getName(), dto.getTitle(), dto.getPassword(), dto.getCreate_date());

        scheduleRepository.saveSchedule(schedule);

        return new ScheduleResponseDto(schedule);
    }

    @Override
    public ScheduleResponseDto findById(Long id) {
        Schedule schedule = scheduleRepository.findById(id);

        if (schedule == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "");
        }

        return new ScheduleResponseDto(schedule);
    }
}
