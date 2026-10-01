package com.aymane.jobmanagement.service;

import com.aymane.jobmanagement.model.Application;

public class DatabaseApplicationRepository implements ApplicationRepository{

    @Override
    public void save(Application application) {

        System.out.println(
                "Saving application into database..."
        );
    }
}
