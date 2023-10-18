package com.example.schoolweb22.repository;



import com.example.schoolweb22.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    List<Admin> findAllByActiveTrue();
    Admin findByPhoneNumberAndActiveTrue(String phoneNumber);
}