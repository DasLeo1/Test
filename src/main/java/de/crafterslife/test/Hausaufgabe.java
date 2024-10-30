package de.crafterslife.test;

public class Hausaufgabe {

    public void hausaufgabe(int a) {
        var prefix = "Hausaufgabe ";



        System.out.println(prefix + a);
        if (a == 1) {
            System.out.println(prefix + "ich bin erster 1");
        } else if (a == 2) {
            System.out.println(prefix + "ich bin zweiter 2");
        } else {
            System.out.println(prefix + "Huch kenn ich nicht");
        }


        switch (a) {
            case 1 -> System.out.println(prefix + "ich bin erster 1");
            case 2 -> System.out.println(prefix + "ich bin zweiter 2");
            default -> System.out.println(prefix + "Huch kenn ich nicht");
        }
    }
}
