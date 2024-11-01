package de.crafterslife.test;

import de.crafterslife.test.display.Display;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        String prefix = "Task = ";//Haupt Prefix



        new Display(getLogger())
                .display();

        getLogger().log(Level.INFO, "-------" + getName() + "-------");

        //Aufgabe 1
        TaskA homeworka = new TaskA();
        for (int i = 0; i < 10; i++) {
        homeworka.homeworka(getLogger() , prefix , i);
        }

        getLogger().info(" ");//Platzhalter

        //Aufgabe 2
        TaskB homeworkb = new TaskB();
        homeworkb.homeworkb(getLogger() , prefix);

        getLogger().info(" ");//Platzhalter

        //Aufgabe 3


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
