package com.hanhan.springboothtmltest.BController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin
@Controller
public class TestController {
    @RequestMapping(value="testhtml",method = RequestMethod.GET)
    public String f(){
        return "reporting.html";
    }

}
