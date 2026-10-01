package com.aymane.jobmanagement;

import com.aymane.jobmanagement.model.Application;
import com.aymane.jobmanagement.model.Candidate;
import com.aymane.jobmanagement.model.JobOffer;
import com.aymane.jobmanagement.service.*;
import com.aymane.jobmanagement.strategy.ExperienceScoringStrategy;
import com.aymane.jobmanagement.strategy.ScoringStrategy;

public class Main {

    public static void main(String[] args) {

        // ==========================================
        // 1. CREATE DEPENDENCIES
        // ==========================================

        ApplicationRepository repository = new InMemoryApplicationRepository();

        Notification notification = new EmailNotification();

        NotificationService notificationService = new NotificationService(notification);

        PdfService pdfService = new PdfService();

        ScoringStrategy scoringStrategy = new ExperienceScoringStrategy();

        ScoringService scoringService = new ScoringService(scoringStrategy);


        // ==========================================
        // 2. CREATE APPLICATION SERVICE
        // ==========================================

        ApplicationService applicationService = new ApplicationService(
                        repository,
                        notificationService,
                        pdfService,
                        scoringService
                );


        // ==========================================
        // 3. CREATE DOMAIN OBJECTS
        // ==========================================

        Candidate candidate = new Candidate(
                1L,
                "Aymane",
                "ImlIhi",
                "aymane@gmail.com"
        );

        JobOffer jobOffer = new JobOffer(
                1L,
                "Java Developer",
                "Java / Spring Boot Developer",
                "ABC Company",
                12000
        );


        // ==========================================
        // 4. CREATE APPLICATION
        // ==========================================

        Application application =
                applicationService.createApplication(
                        1L,
                        candidate,
                        jobOffer
                );


        // ==========================================
        // 5. SAVE APPLICATION
        // ==========================================

        applicationService.saveApplication(
                application
        );


        // ==========================================
        // 6. CALCULATE SCORE
        // ==========================================

        double score =
                applicationService.calculateScore(
                        candidate,
                        jobOffer
                );

        System.out.println(
                "Candidate score: " + score
        );


        // ==========================================
        // 7. GENERATE PDF
        // ==========================================

        applicationService.generatePdf(
                application
        );


        // ==========================================
        // 8. NOTIFY CANDIDATE
        // ==========================================

        applicationService.notifyCandidate(
                "Your application has been received."
        );
    }
}