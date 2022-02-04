package com.senina.maria.learnspringframework.sample.enterprise.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//Responsible for getting data
@Component
public class DataService {
    public List<Integer> retrieveData() {
        return Arrays.asList(12, 34, 56, 78, 90);
    }
}