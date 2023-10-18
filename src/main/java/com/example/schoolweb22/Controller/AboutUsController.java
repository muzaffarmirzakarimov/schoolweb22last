package com.example.schoolweb22.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class AboutUsController {

    @GetMapping("/aboutschool")
    public String AboutSchoolPage(){
        return "";
        //about us page html
    }
    @GetMapping("/ourclasses")
    public String OurClassesPage(){
        return "";
        //our classes page html
    }

}
