package com.company;

public class PlayComputerGames extends Hobby {
    private String genre;

    public PlayComputerGames(String name, int experience, boolean isActive, String genre) {
        super(name, experience, isActive);
        this.genre = genre;
    }

    public PlayComputerGames(String genre) {
        this.genre = genre;
    }

    public PlayComputerGames() {
    }

    @Override
    public void tellAboutHobby() {
        System.out.println("Name is: " + name + ", experience: " + experience + ", activity is: " + isActive + ", and genre is: " + genre);
    }

}
