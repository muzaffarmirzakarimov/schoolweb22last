package com.example.schoolweb22.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventsDto {
    private String first_name;
    private String last_name;
    private String student_class;
    private String phone_number;

}
