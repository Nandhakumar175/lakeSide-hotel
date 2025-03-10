package com.example.lakesideHotel_Backend.repository;

import com.example.lakesideHotel_Backend.model.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<BookedRoom, Long> {


    Optional<BookedRoom> findByBookingConfirmationCode(String confirmationCode);


    List<BookedRoom> findByroomId(Long roomId);

    List<BookedRoom> findByGuestEmail(String email);

}
