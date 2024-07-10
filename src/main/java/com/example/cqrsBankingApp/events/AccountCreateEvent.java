package com.example.cqrsBankingApp.events;

import com.example.cqrsBankingApp.domain.aggregate.Aggregate;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccountCreateEvent extends AbstarctEvent {


    public AccountCreateEvent(Object payload) {
        super(null,EventType.ACCOUNT_CREATE, payload);
    }



    @Override
    public void apply(Aggregate aggregate) {

    }
}
