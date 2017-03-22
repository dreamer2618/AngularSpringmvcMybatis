package com.yb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

	@RequestMapping("/index")
    public String getIndexPage() {
        return "index";
    }
    @RequestMapping("/login")
    public String login(Model model) {
        return "login/login";
    }
    @RequestMapping("/text")
    public String text(Model model) {
        return "login/text";
    }

}
