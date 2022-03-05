package net.parksy.salonapi.data;

import net.parksy.salonapi.entity.SalonServiceDetail;
import org.springframework.data.repository.CrudRepository;

public interface SalonServiceDetailRepository
    extends CrudRepository<SalonServiceDetail, Long> {
    //DJP:TODO Add more?
}
