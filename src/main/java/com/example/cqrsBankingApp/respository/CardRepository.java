package com.example.cqrsBankingApp.respository;

import com.example.cqrsBankingApp.domain.model.Card;
import com.example.cqrsBankingApp.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {
}
