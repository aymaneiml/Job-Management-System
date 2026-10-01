package com.aymane.jobmanagement.model;

public class Recruiter extends User{

    public Recruiter(Long id, String firstName, String lastName, String email) {
        //super() permet d'appeler le constructeur de la classe parent afin d'initialiser la partie héritée de l'objet
        super(id, firstName, lastName, email);
    }

    @Override
    public String getRole() {
        return "RECRUITER";
    }
}
