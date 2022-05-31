package de.vertwinex.memehub.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Hub_CMD extends Command {

    public Hub_CMD(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void execute(CommandSender arg0, String[] arg1) {
        ProxiedPlayer p = (ProxiedPlayer)arg0;
        if(p.getServer().getInfo().getName().equals("lobby")) {
            p.sendMessage("§eMemeRush §8┃ §bВы уже находитесь в §aLobby§8.");
        } else {
            ServerInfo s1 = ProxyServer.getInstance().getServerInfo("lobby");
            p.connect(s1);
            p.sendMessage("§eMemeRush §8┃ §bВы были телепортированы в §aLobby§8.");
        }
    }
}