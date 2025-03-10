package com.example.lakesideHotel_Backend.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booked_room")
public class BookedRoom {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;

    @Column(name = "Check_in")
	private LocalDate checkInDate;

    @Column(name = "Check_out")
	private LocalDate checkOutDate;

    @Column(name = "guest_FullName")
	private String guestFullName;

    @Column(name = "guest_Email")
	private String guestEmail;

    @Column(name = "Adults")
	private int numOfAdults;

    @Column(name = "children")
	private int numOfChildren;

    @Column(name = "total_Guest")
	private int totalNumOfGuest;

    @Column(name = "confirmationCode")
	private String bookingConfirmationCode;


	@Getter
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id")  // ✅ Foreign key column
	private Room room;

	private LocalDate checkinDate;


	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

    public void setCheckinDate(LocalDate checkinDate) {
		this.checkinDate = checkinDate;
	}

    public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

    public void setGuestFullName(String guestFullName) {
		this.guestFullName = guestFullName;
	}

    public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

    public void setTotalNumOfGuest(int totalNumOfGuest) {
		this.totalNumOfGuest = totalNumOfGuest;
	}

    public void TotalNumberOfGuest() {

		this.totalNumOfGuest = this.numOfAdults + this.numOfChildren;
	}



	public void setNumOfAdults(int numOfAdult) {
		numOfAdults = numOfAdult;
		TotalNumberOfGuest();
	}


	public void setNumOfChildren(int numOfChildrens) {
		numOfChildren = numOfChildrens;
		TotalNumberOfGuest();
	}

	public void setRoom(Room room) {
		this.room = room;
	}



	public void setBookingConfirmationCode(String bookingConfirmationCode) {
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
}
