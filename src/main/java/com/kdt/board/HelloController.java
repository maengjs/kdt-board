package com.kdt.board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/notice")
    public String hello(){
        return "closed";
    }
}
