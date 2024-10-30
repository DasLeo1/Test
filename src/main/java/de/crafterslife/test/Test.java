package de.crafterslife.test;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Test extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().log(Level.INFO, "-------" + getName() + "-------");

        try {
            //TODO load system

            var hausaufgabe = new Hausaufgabe();
            for (int i = 1; i <= 3; i++) {
                hausaufgabe.hausaufgabe(getLogger(), i);
            }

            getLogger().log(Level.INFO, "All System`s loaded");   //Alles in bester ordnung

        } catch (Exception e) {
            getLogger().log(Level.WARNING, "System failed to load", e);  //Plugin kann nicht geladen werden , gibt fehler aus
        }

        getLogger().log(Level.INFO, "-------" + getName() + "-------");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().log(Level.INFO, "All System`s unloaded");
    }
}
