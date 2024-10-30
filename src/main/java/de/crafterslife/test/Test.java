package de.crafterslife.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic
        new HealCommand().heal();
        System.out.print("All System`s loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("see you soon");
    }
}
