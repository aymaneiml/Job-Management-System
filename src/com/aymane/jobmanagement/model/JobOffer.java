package com.aymane.jobmanagement.model;

public class JobOffer {

    private Long id;
    private String title;
    private String description;
    private String company;
    private double salary;

    public JobOffer(
            Long id,
            String title,
            String description,
            String company,
            double salary
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.company = company;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("----- Job Offer -----");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }
}
