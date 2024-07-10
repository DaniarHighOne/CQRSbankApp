package com.example.cqrsBankingApp.service.account;

import com.example.cqrsBankingApp.domain.model.Account;
import com.example.cqrsBankingApp.events.AccountCreateEvent;
import com.example.cqrsBankingApp.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountCommandServiceImpl implements AccountCommandService{

    private EventService eventService;



    @Override
    public void create(Account object) {
        AccountCreateEvent event = new AccountCreateEvent(object);
        eventService.create(event);

    }
}
