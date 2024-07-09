package com.example.cqrsBankingApp.service.account;

import com.example.cqrsBankingApp.domain.exception.ResourceNotFoundException;
import com.example.cqrsBankingApp.domain.model.Account;
import com.example.cqrsBankingApp.respository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountQueryServiceImpl implements AccountQueryService{

    private final AccountRepository repository;

    @Override
    public Account getById(UUID id) {
        return repository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
}
