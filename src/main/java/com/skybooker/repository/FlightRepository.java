package com.skybooker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skybooker.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}