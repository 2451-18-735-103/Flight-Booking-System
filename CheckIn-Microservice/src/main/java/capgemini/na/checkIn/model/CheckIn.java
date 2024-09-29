package capgemini.na.checkIn.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "checkIn")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CheckIn {

	@Id
	private String checkInId;
	private Integer flightId;
	private String userName;
	private String checkInStatus;
	private List<String> seatsBooked;
	public String getCheckInId() {
		return checkInId;
	}
	public void setCheckInId(String checkInId) {
		this.checkInId = checkInId;
	}
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCheckInStatus() {
		return checkInStatus;
	}
	public void setCheckInStatus(String checkInStatus) {
		this.checkInStatus = checkInStatus;
	}
	public List<String> getSeatsBooked() {
		return seatsBooked;
	}
	public void setSeatsBooked(List<String> seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	public CheckIn(String checkInId, Integer flightId, String userName, String checkInStatus,
			List<String> seatsBooked) {
		super();
		this.checkInId = checkInId;
		this.flightId = flightId;
		this.userName = userName;
		this.checkInStatus = checkInStatus;
		this.seatsBooked = seatsBooked;
	}
	public CheckIn() {
		
		// TODO Auto-generated constructor stub
	}
	
	
}
