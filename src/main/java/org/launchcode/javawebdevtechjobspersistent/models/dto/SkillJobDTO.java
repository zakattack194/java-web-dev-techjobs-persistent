package org.launchcode.javawebdevtechjobspersistent.models.dto;

import org.launchcode.javawebdevtechjobspersistent.models.AbstractEntity;
import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.launchcode.javawebdevtechjobspersistent.models.Skill;

import javax.validation.constraints.NotNull;

public class SkillJobDTO extends AbstractEntity {

    @NotNull
    private Skill skill;

    @NotNull
    private Job job;

    public SkillJobDTO() {}

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
