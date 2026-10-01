package com.aymane.jobmanagement.model;

public class Application {

    private Long id;
    private Candidate candidate;
    private JobOffer jobOffer;
    private ApplicationStatus status;

    public Application(
            Long id,
            Candidate candidate,
            JobOffer jobOffer
    ) {
        this.id = id;
        this.candidate = candidate;
        this.jobOffer = jobOffer;
        //une nouvelle candidature est toujours PENDING
        this.status=ApplicationStatus.PENDING;
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


    public ApplicationStatus getStatus() {
        return status;
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

        System.out.println(("Status : " + status));
    }

    public void accept(){
        if(status != ApplicationStatus.PENDING){
            throw new IllegalStateException(
                    "Only pending applications can be accepted"
            );
        }

        status = ApplicationStatus.ACCEPTED;
    }

    public void reject() {

        if (status != ApplicationStatus.PENDING) {
            throw new IllegalStateException(
                    "Only pending applications can be rejected"
            );
        }

        status = ApplicationStatus.REJECTED;
    }

    public boolean isPending(){
        return status == ApplicationStatus.PENDING;
    }
}