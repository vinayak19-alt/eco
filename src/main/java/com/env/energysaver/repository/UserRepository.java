package com.env.energysaver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.env.energysaver.models.User;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByMail(String mail);

	public boolean existsByMail(String email);
	
}
