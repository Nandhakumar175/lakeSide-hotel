package com.example.lakesideHotel_Backend.response;

import java.math.BigDecimal;
import java.util.Base64;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor

public class RoomResponse {

    private long id;

	private String RoomType;

	private BigDecimal roomPrice;

	private boolean isBooked;


	private String photo;


	private List<BookingResponse> bookings;

	public RoomResponse(Long id, String roomType, BigDecimal roomPrice, byte[] photoBytes) {
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
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

	public String getPhoto() {
		return photo;
	}

//	public void setPhoto(String photo) {
//		this.photo = photo;
//	}

	public List<BookingResponse> getBookings() {
		return bookings;
	}

	public void setBookings(List<BookingResponse> bookings) {
		this.bookings = bookings;
	}

	public RoomResponse(long id, String roomType, BigDecimal roomPrice) {
		super();
		this.id = id;
		RoomType = roomType;
		this.roomPrice = roomPrice;
	}


	public RoomResponse(long id, String roomType, BigDecimal roomPrice, boolean isBooked, byte[] photobyte) {
		super();
		this.id = id;
		this.RoomType = roomType;
		this.roomPrice = roomPrice;
		this.isBooked = isBooked;
		this.photo = (photobyte != null) ? Base64.getEncoder().encodeToString(photobyte) : null;
	//	this.bookings = bookings;
	}




	public void add(RoomResponse roomResponse) {

	}

	public void setPhoto(String base64Photo) {
	}
}
