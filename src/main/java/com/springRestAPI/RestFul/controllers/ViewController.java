package com.springRestAPI.RestFul.controllers;

import jakarta.servlet.http.HttpSession;
import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("User")
@Log
public class ViewController {
    @GetMapping("/homePage")
    public ModelAndView homepage(ModelAndView mv , HttpSession session)
    {
        String Name=(String)session.getAttribute("Name");
        log.info("controller is activated" + Name);
        mv.addObject("Name",Name);
        mv.setViewName("home");
        return mv;
    }
}
