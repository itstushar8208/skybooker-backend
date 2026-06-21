package com.skybooker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skybooker.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}