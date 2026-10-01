package com.aymane.jobmanagement.service;

import com.aymane.jobmanagement.model.Application;
import com.aymane.jobmanagement.model.Candidate;
import com.aymane.jobmanagement.model.JobOffer;

public class ApplicationService {

    private final ApplicationRepository applicationRepository;
    private final NotificationService notificationService;
    private final PdfService pdfService;
    private final ScoringService scoringService;

    public ApplicationService(
            ApplicationRepository applicationRepository,
            NotificationService notificationService,
            PdfService pdfService,
            ScoringService scoringService
    ) {
        this.applicationRepository = applicationRepository;
        this.notificationService = notificationService;
        this.pdfService = pdfService;
        this.scoringService = scoringService;
    }

    public Application createApplication(Long id, Candidate candidate, JobOffer jobOffer) {
        return new Application(id, candidate, jobOffer);
    }

    public void saveApplication(Application application) {
        applicationRepository.save(application);
    }

    public void notifyCandidate(String message) {
        notificationService.notify(message);
    }

    public void generatePdf(Application application) {
        pdfService.generate(application);
    }

    public double calculateScore(Candidate candidate, JobOffer jobOffer) {
        return scoringService.calculateScore(candidate, jobOffer);
    }
}