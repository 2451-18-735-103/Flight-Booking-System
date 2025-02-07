package capgemini.na.checkIn.controller;

import java.util.Arrays;
import java.util.List;

import capgemini.na.checkIn.exception.BookingNotFoundException;
import capgemini.na.checkIn.model.CheckIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import capgemini.na.checkIn.exception.AlreadyCheckedInException;
import capgemini.na.checkIn.service.CheckInService;

@RestController
@RequestMapping("/checkIn")
public class CheckInController {

	@Autowired
	CheckInService service;
//<<<<<<< HEAD

	// post endpoint  for checking in.
//	@PostMapping("/{bookingId}/{userName}")
//	public ResponseEntity<CheckIn> checkIn(@PathVariable String bookingId, @PathVariable String userName,
//			
//			@RequestBody List<String> seatNumbers) throws AlreadyCheckedInException, BookingNotFoundException {
//		
//=======
	
	@PostMapping("/{bookingId}/{userName}")
	public ResponseEntity<CheckIn> checkIn(@PathVariable String bookingId, @PathVariable String userName, @RequestBody List<String> seatNumbers) throws AlreadyCheckedInException, BookingNotFoundException {
//>>>>>>> e08c1da8496682ee9b4fd4a2282e7e66d2ba4400
		return new ResponseEntity<>(service.checkIn(bookingId, userName, seatNumbers), HttpStatus.OK);
	}

	//put endpoint to cancel check in.
	@PutMapping("/cancelCheckIn/{checkInId}")
	public ResponseEntity<CheckIn> cancelCheckIn(@PathVariable String checkInId) throws BookingNotFoundException {
		
		return new ResponseEntity<>(service.cancelCheckIn(checkInId), HttpStatus.OK);
	
	}

}
