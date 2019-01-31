package com.stanciuandrei.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index.html"}) //they all gonna match
    public String index(){
        return  "index";
    }

}
