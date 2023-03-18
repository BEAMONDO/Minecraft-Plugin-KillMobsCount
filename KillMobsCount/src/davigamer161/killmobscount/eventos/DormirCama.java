package davigamer161.killmobscount.eventos;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import davigamer161.killmobscount.KillMobsCount;

public class DormirCama implements Listener{

    private KillMobsCount plugin;

    public DormirCama(KillMobsCount plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void alDormir(PlayerBedEnterEvent event){
        Player jugador = event.getPlayer();
        FileConfiguration config = plugin.getConfig();
            String path = "Config.mensaje-dormir";
            if(config.getString(path).equals("true")){
                FileConfiguration messages = plugin.getMessages();
                String texto = "Messages.mensaje-dormir-texto";
                jugador.sendMessage(ChatColor.translateAlternateColorCodes('&',messages.getString(texto)).replaceAll("%player%", jugador.getName()));
            }
            return;
        }
}
