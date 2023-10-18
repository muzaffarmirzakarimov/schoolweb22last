package com.example.schoolweb22.service;


import com.example.schoolweb22.dto.AdminDto;
import com.example.schoolweb22.dto.ApiResponse;
import com.example.schoolweb22.entity.Admin;
import com.example.schoolweb22.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {

    final
    AdminRepository adminRepository;


    final
    AuthService authService;


    public ApiResponse edit(Long id, AdminDto adminDto) {
        Optional<Admin> byId1 = adminRepository.findById(id);
        if(byId1.isEmpty())return null;
        Admin admin = byId1.get();
        admin.setFirstName(adminDto.getFirst_name());
        admin.setLastName(adminDto.getLast_name());
        admin.setPhoneNumber(adminDto.getPhone_number());
        Admin save = adminRepository.save(admin);
        return new ApiResponse("Saved", true, save);
    }

    public ApiResponse add(AdminDto adminDto) {
        Admin admin=new Admin();
        admin.setPassword(adminDto.getPassword());
        admin.setLastName(adminDto.getLast_name());
        admin.setFirstName(adminDto.getFirst_name());
        admin.setPhoneNumber(adminDto.getPhone_number());
        Admin user1 = adminRepository.findByPhoneNumberAndActiveTrue(adminDto.getPhone_number());
        if(user1==null){
           adminRepository.save(admin);
        }

        return new ApiResponse("saved",true);
    }



}
