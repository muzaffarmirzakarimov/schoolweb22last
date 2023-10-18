package com.example.schoolweb22.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class BookController {

    @GetMapping("/books")
    public String BooksPage(){
        return "";
        //Books page html
    }
}
