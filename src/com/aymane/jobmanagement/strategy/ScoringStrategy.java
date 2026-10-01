package com.aymane.jobmanagement.strategy;

import com.aymane.jobmanagement.model.Candidate;
import com.aymane.jobmanagement.model.JobOffer;

public interface ScoringStrategy {

    double calculate(Candidate candidate, JobOffer jobOffer);
}
