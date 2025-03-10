package com.example.lakesideHotel_Backend.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookingResponse {

    private Long bookingId;


    private LocalDate checkinDate;


    private LocalDate checlOutDate;


    private String gusetFullName;


    private String guestEmail;


    private int NumOfAdults;


    private int NumOfChildren;


    private int totalNumOfGuest;


    private String BookingConfirmationCode;


    private RoomResponse room;

    public BookingResponse(Long bookingId, LocalDate checkinDate, LocalDate checlOutDate , String BookingConfirmationCode ) {
        this.bookingId = bookingId;
        this.checkinDate = checkinDate;
        this.checlOutDate = checlOutDate;
        this.BookingConfirmationCode = BookingConfirmationCode;
    }

}
