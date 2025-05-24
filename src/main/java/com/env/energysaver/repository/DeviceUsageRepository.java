package com.env.energysaver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.DeviceUsage;

@Repository
public interface DeviceUsageRepository extends JpaRepository<DeviceUsage, Long>{

}
