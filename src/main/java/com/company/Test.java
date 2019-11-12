package com.company;


import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;

public class Test {
    private static final Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args){

	Hobby playComputerGames = new PlayComputerGames("PlayComputerGames", -9, false, "fantasy");
	Hobby reading = new Reading("Reading", 3, false, 40);

	Hobby [] hobbies = new Hobby[] { playComputerGames, reading};
        for (Hobby hobby : hobbies) {
            try {
                hobby.tellAboutHobby();
            }
            catch (HobbyException experience){
                logger.warn("Experience has a negative sign");
            }
        }
    }
}
