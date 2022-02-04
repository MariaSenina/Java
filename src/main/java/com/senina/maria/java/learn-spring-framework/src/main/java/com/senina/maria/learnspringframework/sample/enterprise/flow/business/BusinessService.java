package com.senina.maria.learnspringframework.sample.enterprise.flow.business;

import com.senina.maria.learnspringframework.sample.enterprise.flow.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//Responsible for business logic
@Component
public class BusinessService {
    @Autowired
    private DataService dataService;

    public long calculateSum() {
        List<Integer> data = dataService.retrieveData();

        return data.stream().reduce(Integer::sum).get();
    }
}
