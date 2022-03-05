package net.parksy.salonapi.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class Slot {
    @Id
    private final long id; // bigint
    private final Timestamp confirmed_at;
    private final Timestamp locked_at;
    private final Timestamp slot_for;
    private final int status;
    private final String stylist_name;
    private final long  selected_service_id;
}
