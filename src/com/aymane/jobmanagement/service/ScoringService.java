package com.aymane.jobmanagement.service;

import com.aymane.jobmanagement.model.Candidate;
import com.aymane.jobmanagement.model.JobOffer;
import com.aymane.jobmanagement.strategy.ScoringStrategy;

public class ScoringService {

    private ScoringStrategy strategy;

    public ScoringService(ScoringStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateScore(Candidate candidate, JobOffer jobOffer) {
        return strategy.calculate(
                candidate,
                jobOffer
        );
    }
}
