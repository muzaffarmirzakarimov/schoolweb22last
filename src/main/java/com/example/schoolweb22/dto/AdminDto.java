package com.example.schoolweb22.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdminDto {
    private String first_name;
    private String last_name;
    private String password, password_repeat;
    private String phone_number;
    private List<Long> warehouses=new ArrayList<>();
}
