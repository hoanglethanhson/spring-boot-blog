package com.tm.sonhlt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/hello")
    public String helloSpring() {
        return "hello Spring";
    }
}
