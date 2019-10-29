package com.company;

public class Reading extends Hobby {
    private int pagePerDay;

    public Reading(String name, int experience, boolean isActive, int pagePerDay) {
        super(name, experience, isActive);
        this.pagePerDay = pagePerDay;
    }

    public Reading(int pagePerDay) {
        this.pagePerDay = pagePerDay;
    }

    public Reading() {
    }

    @Override
    public void tellAboutHobby() throws HobbyException {
        if (experience < 0) throw new HobbyException();
        else System.out.println("Name is: " + name + ", experience: " + experience + ", activity is: " + isActive + ", and page per day is: " + pagePerDay);
    }
}
