package com.example.cqrsBankingApp.service.transaction;

import com.example.cqrsBankingApp.domain.model.Transaction;
import com.example.cqrsBankingApp.service.CommandService;
import com.example.cqrsBankingApp.service.QueryService;

public interface TransactionService
        extends CommandService<Transaction>, QueryService<Transaction> {
}
