package com.example.schoolweb22.service;

import com.example.schoolweb22.dto.AdminDto;
import com.example.schoolweb22.dto.ApiResponse;
import com.example.schoolweb22.dto.EventsDto;
import com.example.schoolweb22.entity.Admin;
import com.example.schoolweb22.entity.Events;
import com.example.schoolweb22.repository.EventsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventsService {

    final EventsRepository eventsRepository;

    public EventsService(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    public ApiResponse add(EventsDto eventsDto) {
        Events events=new Events();
        events.setStudentClass(eventsDto.getStudent_class());
        events.setLastName(eventsDto.getLast_name());
        events.setFirstName(eventsDto.getFirst_name());
        events.setPhoneNumber(eventsDto.getPhone_number());
        eventsRepository.save(events);

        return new ApiResponse("saved",true);
    }

    public ApiResponse edit(Long id, EventsDto eventsDto) {
        Events events = new Events();
        events.setFirstName(eventsDto.getFirst_name());
        events.setLastName(eventsDto.getLast_name());
        events.setPhoneNumber(eventsDto.getPhone_number());
        Events save = eventsRepository.save(events);
        return new ApiResponse("Saved", true, save);
    }
}
