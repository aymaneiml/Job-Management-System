package com.aymane.jobmanagement.model;

public class Candidate extends User implements Authenticatable{


    public Candidate(Long id, String firstName, String lastName, String email) {
        super(id, firstName, lastName, email);
    }

    @Override
    public String getRole() {
        return "CANDIDATE";
    }

    @Override
    public boolean canLogin(){
        return true;
    }
}
