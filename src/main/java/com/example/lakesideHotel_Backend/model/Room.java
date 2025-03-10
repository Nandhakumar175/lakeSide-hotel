package com.example.lakesideHotel_Backend.model;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.apache.commons.lang3.RandomStringUtils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Room {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String roomType;

	private BigDecimal roomPrice;

	private boolean isBooked = false;
@JsonIgnore
	@Lob
	private Blob photo;

	 @OneToMany(mappedBy="room",fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private List<BookedRoom> bookings;



	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public BigDecimal getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(BigDecimal roomPrice) {
		this.roomPrice = roomPrice;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean booked) {
		isBooked = booked;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public List<BookedRoom> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookedRoom> bookings) {
		this.bookings = bookings;
	}

	public void addBooking(BookedRoom booking) {
		if (bookings == null) {
				bookings = new ArrayList<>();
				}
		        bookings.add(booking);
				booking.setRoom(this);
				isBooked = true;
				String Bookingcode = RandomStringUtils.randomNumeric(10);
				booking.setBookingConfirmationCode(Bookingcode);

		}


}




