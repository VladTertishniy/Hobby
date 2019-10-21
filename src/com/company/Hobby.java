package com.company;

public abstract class Hobby {
    public String name;
    public int experience;
    public boolean isActive;

    public abstract void tellAboutHobby();

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    Hobby(String name, int experience, boolean isActive) {
        this.name = name;
        this.experience = experience;
        this.isActive = isActive;
    }

    Hobby(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public Hobby(String name) {
        this.name = name;
    }

    Hobby() {
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", isActive=" + isActive +
                '}';
    }

}
