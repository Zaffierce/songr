package com.Zaffierce.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RandomController {

    @GetMapping("/hello/{username}")
    //the username is coming from a path this time.
    public String getHelloRoute(@PathVariable String username, Model m) {
        m.addAttribute("username", username);
        return "home";
    }

    @GetMapping("/capitalize/{keyword}")
    public String getCapitalizeRoute(@PathVariable String keyword, Model m) {
        m.addAttribute("keyword", keyword.toUpperCase());
        return "home";
    }
}
