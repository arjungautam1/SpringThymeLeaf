package com.arjuncodes.ThymeLeafDemo.controller;

import com.arjuncodes.ThymeLeafDemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/save",method= RequestMethod.POST)
    public ModelAndView save(@ModelAttribute User user){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("user-data");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
