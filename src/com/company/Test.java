package com.company;

public class Test {

    public static void main(String[] args) {

	Hobby playComputerGames = new PlayComputerGames("PlayComputerGames", 9, false, "fantasy");
	Hobby reading = new Reading("Reading", 3, false, 40);

	Hobby [] hobbies = new Hobby[] { playComputerGames, reading};
        for (Hobby hobby:hobbies
             ) {
            hobby.tellAboutHobby();
        }
    }
}
