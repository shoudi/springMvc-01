package com.didi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/6/12.
 */

@Controller
public class MainController {


        @RequestMapping(value = "/", method = RequestMethod.GET)
        public String index() {
            return "index";
        }

}
