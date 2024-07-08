package com.example.cqrsBankingApp.events;

import com.example.cqrsBankingApp.domain.model.ObjectConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "events")
@Entity
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstarctEvent implements  Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JdbcTypeCode(SqlTypes.VARCHAR)//uuid keep inside varchar
    private UUID aggregateId;

    @Enumerated(EnumType.STRING)
    private EventType type;

    @CreationTimestamp
    private LocalDateTime timestamp;

    @JdbcTypeCode(SqlTypes.JSON)
    @Convert(converter = ObjectConverter.class)
    private Object payload;//simple object with payload

    public AbstarctEvent( UUID aggregateId, EventType type, Object payload) {
        this.aggregateId = aggregateId;
        this.type = type;
        this.payload = payload;
    }
}
