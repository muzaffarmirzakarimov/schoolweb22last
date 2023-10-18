package com.example.schoolweb22.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class CourcesController {

    @GetMapping("/cources")
    public String CourcesPage(){
        return "";
        //cources page html
    }
}
