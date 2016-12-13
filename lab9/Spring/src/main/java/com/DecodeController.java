package com;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class DecodeController {


    @RequestMapping("/decoder")
    public ModelAndView showMessage(){

        ModelAndView mv = new ModelAndView("decoder");

        return mv;
    }
}