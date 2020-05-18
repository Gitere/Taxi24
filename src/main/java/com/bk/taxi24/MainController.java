package com.bk.taxi24;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Component
@Controller
@RequestMapping(path = "/taxi24")
public class MainController {

	@Autowired
	private DriverRepository driverRepository;

	@Autowired
	private TripRepository tripRepository;
	
	@Autowired
	private RiderRepository riderRepository;
		
	
	// drivers
	
	@GetMapping(path = "/alldrivers")
	public @ResponseBody Iterable<Driver> getAllDrivers() {
		return driverRepository.findAll();
	}
	
	// get available drivers
	@GetMapping(path = "/availabledrivers")
	public @ResponseBody Iterable<Driver> getAvailableDrivers() {
		return driverRepository.availableDrivers();
	}

	// drivers by location
	@GetMapping(path = "/driversbylocation")
	public @ResponseBody Iterable<Driver> getDriversByLocation(String location) {
		return driverRepository.driversByLocation(location);
	}

	// driver by id
	@GetMapping(path = "/driverbyid")
	public @ResponseBody List<Driver> getDriverById(long id) {			
		return driverRepository.driverById(id);
	}
	
	
	// riders
	// get rider by id
	@GetMapping(path = "/riderbyid")
	public @ResponseBody List<Rider> getRiderById(long id) {		
		return riderRepository.riderById(id);
	}
	
	// get all rides
	@GetMapping(path = "/allriders")
	public @ResponseBody List<Rider> getAllRiders() {		
		return riderRepository.allRiders();
	}
	
	// get closest
	@GetMapping(path = "/closestdrivers")
	public @ResponseBody List<Driver> getClosestDrivers() {		
		return riderRepository.closestDrivers();
	}

	
	// trips
	// create trip
	@PostMapping(path = "/createtrip")
	public @ResponseBody String newTrip(@RequestParam long driverid, @RequestParam long riderid) {

		String response = "";

		Trip newTrip = new Trip();

		if (driverid == 0 || riderid == 0) {
			response = "Provide driver id and rider id";
		} else {
			newTrip.setDriver_id(driverid);
			newTrip.setRider_id(riderid);
			newTrip.setStatus("Active");
			newTrip.setStart_time(Calendar.getInstance());
			try {
				tripRepository.save(newTrip);
				response = "Trip Created Successfully";
			} catch (Exception ex) {
				response = "Request failed " + ex.getMessage();
			}
		}
		return response;
	}
	
	// complete trip
	@PostMapping(path = "/completetrip")
	public @ResponseBody Invoice completeTrip(@RequestParam Long id, @RequestParam double distance) {

		String response = "";
		Invoice newInvoice = new Invoice();

		if (id == 0) {
			response = "Provide trip id";
		} else {
			
			try {
				
				tripRepository.completeTrip(id, distance,  LocalDateTime.now().toString(), "Completed");				
				
				Trip dbTrip = tripRepository.getTripById(id).get(0);				
				
				// create invoice
				
				newInvoice.setDriver_id(dbTrip.getDriver_id());
				newInvoice.setRider_id(dbTrip.getRider_id());
				newInvoice.setInvoice_date(Calendar.getInstance());
				newInvoice.setAmount(distance*40);
				newInvoice.setStatus("new");
								
				
			} catch (Exception ex) {
				response = "Request failed " + ex.getMessage();
			}
		}
		return newInvoice;
	}
	
	// get active trips
	@GetMapping(path = "/activetrips")
	public @ResponseBody List<Trip> getActiveTrips() {
		return tripRepository.activeTrips();
	}

}
