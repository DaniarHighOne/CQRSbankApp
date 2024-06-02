package com.example.cqrsBankingApp.events;

import com.example.cqrsBankingApp.domain.aggregate.Aggregate;

public interface Event {

    void apply(Aggregate aggregate);

}