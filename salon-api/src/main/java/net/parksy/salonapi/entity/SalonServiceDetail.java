package net.parksy.salonapi.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class SalonServiceDetail {

    @Id
    private final long id; // bigint
    private final String description; //  char(255)
    private final String name; //  char(255)
    private final long  price; // bigint
    private final int time_in_minutes; // integer

}
