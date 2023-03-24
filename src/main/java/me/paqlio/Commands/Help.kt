package me.paqlio.Commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

/**
 * @author Paqlio
 * @since 03.24.2023 - 14:25
 **/
class Help : CommandExecutor {
    override fun onCommand(sender: CommandSender, cmd: Command, s: String, args: Array<out String>): Boolean {
        val player = sender as Player
        player.sendMessage("Hello world")
        return true
    }
}