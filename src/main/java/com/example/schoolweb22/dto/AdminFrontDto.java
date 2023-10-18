package com.example.schoolweb22.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminFrontDto {
    private String first_name, last_name, phone_number;
    private Long id;
}
