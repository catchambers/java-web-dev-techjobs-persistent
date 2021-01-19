package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    public Skill(String someSkill) {
        this.skill = someSkill;
    }

    public Skill() {}

    @Size(max = 500, message = "Skill description is too long!")
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}