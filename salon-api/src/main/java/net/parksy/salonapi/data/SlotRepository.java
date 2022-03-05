package net.parksy.salonapi.data;

import net.parksy.salonapi.entity.Slot;
import org.springframework.data.repository.CrudRepository;

public interface SlotRepository
extends CrudRepository<Slot, Long> {
}
