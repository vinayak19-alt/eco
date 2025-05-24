package com.env.energysaver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.LeaderBoard;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Long>{

}
