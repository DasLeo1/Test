package de.crafterslife.test;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class Test extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        new HealCommand().heal();
        System.out.println("All System`s loaded");

        getLogger().info("All System`s loaded");
        try {
            //TODO load system

            new Hausaufgabe().hausaufgabe(1);
            new Hausaufgabe().hausaufgabe(2);

            getLogger().log(Level.INFO, "All System`s loaded");   //Alles super
        } catch (Exception e) {
            getLogger().log(Level.WARNING, "System failed to load", e);  //Nix gut
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("see you soon");
    }
}
