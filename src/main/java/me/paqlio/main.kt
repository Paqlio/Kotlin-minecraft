package me.paqlio


import me.paqlio.Events.Join
import org.bukkit.Bukkit
import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin

class main : JavaPlugin() {
    override fun onEnable() {
        server.consoleSender.sendMessage("Hello world")
        val pm : PluginManager = Bukkit.getPluginManager()
        pm.registerEvents(Join(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
