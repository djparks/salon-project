package net.parksy.salonapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.parksy.salonapi.data.SalonServiceDetailRepository;
import net.parksy.salonapi.entity.SalonServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/services")
@CrossOrigin("*")
@Api(value="salonstore", description="Operations pertaining to Salon Details")
public class SalonServiceDetailsController {
    @Autowired
    private SalonServiceDetailRepository salonServiceDetailRepo;

	@GetMapping(value = "/retrieveAvailableSalonServices", produces = "application/json")
	@ApiOperation("RetrieveAvailableSalonServicesAPI")
	public Iterable<SalonServiceDetail> retrieveAvailableSalonServices() {
		return salonServiceDetailRepo.findAll();
	}

}
