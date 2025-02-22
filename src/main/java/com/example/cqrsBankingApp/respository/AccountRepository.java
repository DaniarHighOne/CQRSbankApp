package com.example.cqrsBankingApp.respository;

import com.example.cqrsBankingApp.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
