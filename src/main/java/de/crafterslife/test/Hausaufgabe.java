package de.crafterslife.test;

import java.util.logging.Logger;

public class Hausaufgabe {

    public void hausaufgabe(Logger logger, int a) {
        var prefix = "Hausaufgabe ";

        if (a == 1) { //Wenn a == 1 gebe "ich bin erster 1" aus
            logger.info(prefix + "ich bin erster 1");
        } else if (a == 2) { //Falls a nicht == 1 ist prüfe ob a == 2 ist , wenn a == 2 gebe "ich bin zweiter 2" aus
            logger.info(prefix + "ich bin zweiter 2");
        } else { //Falls a nicht == 1 oder == 2 , gebe "Huch kenne ich nicht" aus
            logger.info(prefix + "Huch kenn ich nicht");
        }


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