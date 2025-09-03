package com.myste.sbb.question;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class questionController {


    @GetMapping("/question/list")
    @ResponseBody
    public String list(){
         return "question list";
    }
}
