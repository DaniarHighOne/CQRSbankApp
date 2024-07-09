package com.example.cqrsBankingApp.service.client;

import com.example.cqrsBankingApp.domain.model.Client;
import com.example.cqrsBankingApp.service.CommandService;
import com.example.cqrsBankingApp.service.QueryService;

public interface ClientService
        extends CommandService<Client>, QueryService<Client> {
}
