package com.springboot.web.controller;

import com.springboot.web.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServices services;
    @GetMapping("loadAllByName/{name}")
    public String loadAllByName(@PathVariable String name)
    {
        return services.loadAll(name);
    }
    @GetMapping("loadAllShuttleByName/{name}")
    public String loadAllShuttleByName(@PathVariable String name)
    {
        return services.loadAllShuttle(name);
    }
}
