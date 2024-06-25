package com.example.shoppro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.shoppro.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
	@Query(value = "select * from admin where admin_email = :email and admin_password = :password", nativeQuery = true)
	public Admin adminLogin(@Param("email") String email, @Param("password") String password);
	
	public Boolean existsByAdminEmail(String adminEmail);

}
