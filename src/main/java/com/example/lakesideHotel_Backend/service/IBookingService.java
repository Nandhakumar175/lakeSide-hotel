package com.example.lakesideHotel_Backend.service;

import com.example.lakesideHotel_Backend.model.BookedRoom;
import com.example.lakesideHotel_Backend.response.BookingResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


public interface IBookingService {


    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBooking();

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    void cancelBooking(Long bookingId);

    List<BookedRoom> getBookingsByUserEmail(String email);
}


