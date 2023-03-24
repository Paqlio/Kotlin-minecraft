package me.paqlio.Events

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

/**
 * @author Paqlio
 * @since 03.24.2023 - 13:37
 **/
class Join : Listener {
    @EventHandler
    fun onJoin(e: PlayerJoinEvent) {
        e.player.sendMessage(color("&cHello " + e.player.name + ""))
    }
    private fun color(s: String): String {
        return ChatColor.translateAlternateColorCodes('&', s)
    }
}
