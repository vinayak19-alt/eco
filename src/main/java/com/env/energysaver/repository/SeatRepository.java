package com.env.energysaver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>{

}
