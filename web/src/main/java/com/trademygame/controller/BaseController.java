package com.trademygame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by manjtsingh on 8/24/2016.
 */
@Controller
public class BaseController {

    @RequestMapping("/")
    public String getIndexPage(Model model)
    {
        return "index";
    }

    @RequestMapping("/trade")
    public String getTradePage(Model model)
    {
        return "trade";
    }

    @RequestMapping("/dashboard")
    public String getDashboard(Model model)
    {
        return "dashboard";
    }

    @RequestMapping("/login")
    public String authenticateUser(Model model)
    {
        return "dashboard";
    }

    @RequestMapping("/logout")
    public String logoutUser(Model model)
    {
        return "index";
    }

}
