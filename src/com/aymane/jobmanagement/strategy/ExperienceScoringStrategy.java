package com.aymane.jobmanagement.strategy;
import com.aymane.jobmanagement.model.Candidate;
import com.aymane.jobmanagement.model.JobOffer;

public class ExperienceScoringStrategy implements ScoringStrategy {

    @Override
    public double calculate(Candidate candidate, JobOffer jobOffer) {

        System.out.println("Calculating score based on experience...");
        return 80.0;
    }
}
