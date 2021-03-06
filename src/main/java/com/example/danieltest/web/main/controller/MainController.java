package com.example.danieltest.web.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "/")
    public ModelAndView getMainPage() throws Exception {

        logger.info("getMainPage");

        ModelAndView mv = new ModelAndView();
        mv.setViewName("main");

        return mv;

    }
}
