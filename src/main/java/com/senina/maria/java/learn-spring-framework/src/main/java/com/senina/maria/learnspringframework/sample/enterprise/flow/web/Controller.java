package com.senina.maria.learnspringframework.sample.enterprise.flow.web;

import com.senina.maria.learnspringframework.sample.enterprise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Responsible for sending the response to the user in the right format
@RestController
public class Controller {
    @Autowired
    private BusinessService businessService;

    // "/sum" => 100
    // when a user goes to this ^ URL, they get the response below
    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }
}
