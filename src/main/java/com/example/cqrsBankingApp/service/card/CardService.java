package com.example.cqrsBankingApp.service.card;

import com.example.cqrsBankingApp.domain.model.Card;
import com.example.cqrsBankingApp.service.CommandService;
import com.example.cqrsBankingApp.service.QueryService;

public interface CardService extends CommandService<Card>, QueryService<Card> {
}
