package com.stanciuandrei.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","index"})
    public String getOwner(){
        return "owner/index.html";
    }
}
