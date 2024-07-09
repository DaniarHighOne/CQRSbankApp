package com.example.cqrsBankingApp.service.event;

import com.example.cqrsBankingApp.events.AbstarctEvent;
import com.example.cqrsBankingApp.respository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService{

    private final EventRepository repository;


    @Override
    public void create(AbstarctEvent event) {
        repository.save(event);
    }
}
