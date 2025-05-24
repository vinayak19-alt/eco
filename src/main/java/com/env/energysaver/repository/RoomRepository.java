package com.env.energysaver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
