package com.skybooker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skybooker.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}