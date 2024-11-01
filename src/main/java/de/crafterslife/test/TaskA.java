package de.crafterslife.test;

import java.util.logging.Logger;

public class TaskA {

    public void homeworka(Logger logger, String string, int a) {
        logger.info(string + "A");
        if (a != 7) {
            logger.info("Trigger = " + a);
        } else {
            logger.info("Huch kenn ich nicht");
        }

        logger.info(" ");
/*
        if(a == 1) {
            logger.info("Trigger = 1");
        } else if (a == 2){
            logger.info("Trigger = 2" +
                    "");
        } else if (a == 3){
            logger.info("Trigger = 3");
        } else if (a == 4){
            logger.info("Trigger = 4");
        } else {
            logger.info("Huch kenn ich nicht");
        }*/

        /*
        switch (a) { //Schön
            case 1 -> logger.info(prefix + "ich bin erster 1");
            case 2 -> logger.info(prefix + "ich bin zweiter 2");
            default -> logger.info(prefix + "Huch kenn ich nicht");
        }*/
    }
}




//if, else (Wenn , Oder)
//Am ende soll ein String ausgegeben werden, wenn ein int 1 ist dann soll der String: "ich bin erster" und wenn int 2 ist, dann soll der String: "ich bin zweiter" in die Console ausgegeben werden