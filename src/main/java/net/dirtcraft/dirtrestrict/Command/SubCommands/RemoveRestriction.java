package net.dirtcraft.dirtrestrict.Command.SubCommands;

import net.dirtcraft.dirtrestrict.Command.SubCommand;
import net.dirtcraft.dirtrestrict.Configuration.Permission;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class RemoveRestriction implements SubCommand {
    @Override
    public String getName() {
        return "remove";
    }

    @Override
    public String getPermission() {
        return Permission.COMMAND_MODIFY_REMOVE;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
