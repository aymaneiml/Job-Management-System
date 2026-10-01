package com.aymane.jobmanagement.service;

import com.aymane.jobmanagement.model.Application;

import java.util.ArrayList;
import java.util.List;

public class InMemoryApplicationRepository implements ApplicationRepository{

    private final List<Application> applications = new ArrayList<>();


    @Override
    public void save(Application application) {

        applications.add(application);
        System.out.println(
                "Application "
                        + application.getId()
                        + " saved in memory."
        );
    }
}
