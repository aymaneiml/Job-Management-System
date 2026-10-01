package com.aymane.jobmanagement.strategy;
import com.aymane.jobmanagement.model.Candidate;
import com.aymane.jobmanagement.model.JobOffer;

public class SkillScoringStrategy implements ScoringStrategy {

    @Override
    public double calculate(Candidate candidate, JobOffer jobOffer) {
        System.out.println("Calculating score based on skills...");

        return 90.0;
    }
}
