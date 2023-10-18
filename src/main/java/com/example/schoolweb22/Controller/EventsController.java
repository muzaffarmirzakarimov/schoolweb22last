package com.example.schoolweb22.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class EventsController {

    @GetMapping("/events")
    public String EventsPage(){
        return "";
        //events page html
    }
    @GetMapping("/onlinemeetings")
    public String OnlineMeetingsPage(){
        return "";
        //online meetings page html
    }

}
