package com.aymane.jobmanagement.service;

import com.aymane.jobmanagement.model.Application;

public class PdfService {

    public void generate(Application application) {

        System.out.println(
                "Generating PDF for application "
                        + application.getId()
        );
    }
}
