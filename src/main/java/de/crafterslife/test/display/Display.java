package de.crafterslife.test.display;

import java.util.logging.Logger;

public class Display {
    private final Logger logger;

    public Display(Logger logger) {
        this.logger = logger;
    }

    public void display() {
        logger.info("\uD83D\uDE02");
        logger.info("\uD83D\uDE02");
        logger.info("\uD83D\uDE02");

    }
}


//Nicht wichtig , Nicht teil einer aufgabe !!!!!