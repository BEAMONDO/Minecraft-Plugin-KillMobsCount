package davigamer161.killmobscount.eventos;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

import davigamer161.killmobscount.KillMobsCount;

public class DespertarCama implements Listener{

    private KillMobsCount plugin;

    public DespertarCama(KillMobsCount plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void alDormir(PlayerBedLeaveEvent event){
        Player jugador = event.getPlayer();
        FileConfiguration config = plugin.getConfig();
            String poth = "Config.mensaje-despertar";
            if(config.getString(poth).equals("true")){
                FileConfiguration messages = plugin.getMessages();
                String texto = "Messages.mensaje-despertar-texto";
                jugador.sendMessage(ChatColor.translateAlternateColorCodes('&',messages.getString(texto)).replaceAll("%player%", jugador.getName()));
            }
            String path = "Config.comando-despertar";
            if(config.getString(path).equals("true")){
                String comando = "Config.comando-despertar-usar";
                jugador.performCommand(config.getString(comando).replaceAll("%player%", jugador.getName()));
            }
            return;
        }
}
