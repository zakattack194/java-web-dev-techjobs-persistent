package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.Optional;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;
    private String skills;

    public Job() {
    }

    public Job(Employer anEmployer, String someSkills) {
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.



    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
