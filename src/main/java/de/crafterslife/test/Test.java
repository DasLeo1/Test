package de.crafterslife.test;

import de.crafterslife.test.display.Display;
import de.crafterslife.test.packag.one;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        String prefix = "Task = ";//Haupt Prefix



        //kann ignoriert werden
        Display hologram = new Display(getLogger());
        hologram.show();
        hologram.show2();

        getLogger().log(Level.INFO, "-------" + getName() + "-------");

        //Aufgabe 1
        TaskA homeworkA = new TaskA();
        for (int i = 0; i < 3; i++) {
        homeworkA.homeworkA(getLogger() , prefix , i);
        }

        getLogger().info(" ");//Platzhalter

        //Aufgabe 2
        TaskB homeworkB = new TaskB();
        homeworkB.homeworkB(getLogger() , prefix);

        getLogger().info(" ");//Platzhalter

        //Aufgabe 3
        TaskC homeworkC = new TaskC();
        homeworkC.homeworkC(getLogger() , prefix);

        getLogger().info(" ");//Platzhalter

        //Aufgabe4
        TaskD homeworkD = new TaskD();
        homeworkD.homeworkD(getLogger() , prefix);

        getLogger().info(" ");//Platzhalter

        //Aufgabe5
        TaskE homeworkE = new TaskE();
        homeworkE.homeworkE(getLogger() , prefix);

        getLogger().info(" ");

        one one1 = new one();
        one1.foo(getLogger() , prefix);


        try {
            getLogger().log(Level.INFO, "All System`s loaded");   //Alles in bester ordnung
        } catch (Exception exception) {
            getLogger().log(Level.WARNING, "loading onEnable has failed", exception);  //Plugin kann nicht geladen werden , gibt fehler aus
        }
        getLogger().log(Level.INFO, "-------" + getName() + "-------");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().log(Level.INFO, "All System`s unloaded");
    }
}
