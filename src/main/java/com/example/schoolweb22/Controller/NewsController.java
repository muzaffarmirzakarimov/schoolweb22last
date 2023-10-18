package com.example.schoolweb22.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class NewsController {

    @GetMapping("/news")
    public String NewsPage(){
        return "";
        //News page html
    }
}
