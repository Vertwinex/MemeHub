package de.vertwinex.memehub;

import de.vertwinex.memehub.commands.Hub_CMD;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

public class MemeHub extends Plugin {

    @Override
    public void onEnable() {
        System.out.println("Я включился!");

        PluginManager pm = ProxyServer.getInstance().getPluginManager();


        pm.registerCommand(this, new Hub_CMD("hub"));
        pm.registerCommand(this, new Hub_CMD("lobby"));
    }

}



