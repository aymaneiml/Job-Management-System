package com.aymane.jobmanagement;

import com.aymane.jobmanagement.model.*;
import com.aymane.jobmanagement.service.ApplicationManager;

public class Main {

    public static void main(String[] args) {

        Candidate candidate = new Candidate(
                1L,
                "Aymane",
                "Imlihi",
                "aymane@gmail.com"
        );


        JobOffer jobOffer = new JobOffer(
                1L,
                "Java Developer",
                "Develop Java applications",
                "Tech Company",
                15000
        );

        ApplicationManager manager =
                new ApplicationManager();

        Application application =
                manager.createApplication(
                        1L,
                        candidate,
                        jobOffer
                );

        manager.saveApplication(application);

        double score =
                manager.calculateScore(
                        candidate,
                        jobOffer
                );

        System.out.println(
                "Score: " + score
        );

        manager.sendEmail(
                candidate,
                "Your application has been received."
        );

        manager.sendSMS(
                candidate,
                "Your application has been received."
        );

        manager.generatePdf(application);

        manager.notifyRecruiter(
                jobOffer,
                "A new candidate has applied."
        );
    }
}