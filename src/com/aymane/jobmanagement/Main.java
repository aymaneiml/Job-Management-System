package com.aymane.jobmanagement;

import com.aymane.jobmanagement.model.*;

public class Main {

    public static void main(String[] args) {

        Candidate candidate = new Candidate(
                1L,
                "Aymane",
                "Imlihi",
                "aymane@gmail.com"
        );

        Recruiter recruiter = new Recruiter(
                2L,
                "John",
                "Smith",
                "john@company.com"
        );

        JobOffer offer = new JobOffer(
                1L,
                "Java Developer",
                "Develop Java applications",
                "Tech Company",
                15000
        );

        Application application = new Application(
                1L,
                candidate,
                offer
        );

        application.display();

        System.out.println("is Pending : " + application.isPending());

        application.accept();

        application.display();

        System.out.println("is Pending : " + application.isPending());
    }
}