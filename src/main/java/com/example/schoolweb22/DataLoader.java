package com.example.schoolweb22;



import com.example.schoolweb22.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    @Value("${spring.sql.init.mode}")
    private String initialMode;


    final AdminRepository adminRepository;

    @Override
    public void run(String... args) throws Exception {
//        if (initialMode.equals("always")) {
//            Admin admin=new Admin();
//            BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
//            admin.setFirstName("Marco");
//            admin.setLastName("Forever");
//            admin.setPassword("passwordEncoder.encode("musicvkmbot")");
//            admin.setPhoneNumber("+998977677976");
//            adminRepository.save(admin);
////
//
//    }
//hozircha security ishlamidi
        // vaqt yetmi qoldi
}}
