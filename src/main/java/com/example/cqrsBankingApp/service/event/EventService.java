package com.example.cqrsBankingApp.service.event;

import com.example.cqrsBankingApp.events.AbstarctEvent;
import com.example.cqrsBankingApp.events.Event;
import com.example.cqrsBankingApp.service.CommandService;
import com.example.cqrsBankingApp.service.QueryService;

public interface EventService {
    //extends from abstract one for creating any types
    void create(AbstarctEvent event);
}
