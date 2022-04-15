package com.jpa.exam.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {
    @RequestMapping("/usr/home/main")
    @ResponseBody
    public String showMain() {
        return "메인페이지";
    }
}
