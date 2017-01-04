package com.boots.controller;

import com.boots.dao.ServerStatusDao;
import com.boots.service.ServerStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by U38070 on 20/12/2016.
 */
@Controller
public class HomeController {

    @Autowired
    private ServerStatusService serverStatusService;

    @RequestMapping(value = "/cmmonitor")
    public String home() {
        System.out.println("Hello");
        serverStatusService.serverStatusEntityList();
        return "testMonitor";
    }
}
