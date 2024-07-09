package com.example.cqrsBankingApp.service.account;

import com.example.cqrsBankingApp.domain.model.Account;
import com.example.cqrsBankingApp.service.CommandService;
import com.example.cqrsBankingApp.service.QueryService;

public interface AccountService
        extends QueryService<Account>, CommandService<Account> {
}
