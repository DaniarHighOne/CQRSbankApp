package com.example.cqrsBankingApp.respository;

import com.example.cqrsBankingApp.domain.model.Card;
import com.example.cqrsBankingApp.events.AbstarctEvent;
import com.example.cqrsBankingApp.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<AbstarctEvent, Long> {
}
