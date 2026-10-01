package com.aymane.jobmanagement.model;

public class Application {

    private Long id;
    private Candidate candidate;
    private JobOffer jobOffer;

    public Application(
            Long id,
            Candidate candidate,
            JobOffer jobOffer
    ) {
        this.id = id;
        this.candidate = candidate;
        this.jobOffer = jobOffer;
    }

    public Long getId() {
        return id;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public JobOffer getJobOffer() {
        return jobOffer;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public void setJobOffer(JobOffer jobOffer) {
        this.jobOffer = jobOffer;
    }

    public void display() {
        System.out.println("----- Application -----");
        System.out.println("Application ID: " + id);
        System.out.println("Candidate: "
                + candidate.getFirstName()
                + " "
                + candidate.getLastName());
        System.out.println("Job: " + jobOffer.getTitle());
        System.out.println("Company: " + jobOffer.getCompany());
    }
}