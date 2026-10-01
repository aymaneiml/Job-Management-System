package com.aymane.jobmanagement.service;

import com.aymane.jobmanagement.model.Application;
import com.aymane.jobmanagement.model.Candidate;
import com.aymane.jobmanagement.model.JobOffer;

public class ApplicationManager {

    // ==========================================
    // 1. CREATE APPLICATION
    // ==========================================

    public Application createApplication(
            Long id,
            Candidate candidate,
            JobOffer jobOffer
    ) {

        System.out.println("Creating application...");

        return new Application(
                id,
                candidate,
                jobOffer
        );
    }


    // ==========================================
    // 2. SAVE APPLICATION
    // ==========================================

    public void saveApplication(Application application) {

        System.out.println(
                "Saving application "
                        + application.getId()
        );
    }


    // ==========================================
    // 3. SEND EMAIL
    // ==========================================

    public void sendEmail(
            Candidate candidate,
            String message
    ) {

        System.out.println("Sending EMAIL to " + candidate.getEmail());

        System.out.println("Message: " + message);
    }


    // ==========================================
    // 4. SEND SMS
    // ==========================================

    public void sendSMS(
            Candidate candidate,
            String message
    ) {

        System.out.println("Sending SMS to " + candidate.getEmail());

        System.out.println("Message: " + message);
    }


    // ==========================================
    // 5. GENERATE PDF
    // ==========================================

    public void generatePdf(Application application) {

        System.out.println("Generating PDF for application " + application.getId());
    }


    // ==========================================
    // 6. CALCULATE SCORE
    // ==========================================

    public double calculateScore(
            Candidate candidate,
            JobOffer jobOffer
    ) {

        System.out.println("Calculating candidate score...");

        return 75.0;
    }


    // ==========================================
    // 7. NOTIFY RECRUITER
    // ==========================================

    public void notifyRecruiter(
            JobOffer jobOffer,
            String message
    ) {

        System.out.println("Notifying recruiter about job: " + jobOffer.getTitle());

        System.out.println("Message: " + message);
    }
}
