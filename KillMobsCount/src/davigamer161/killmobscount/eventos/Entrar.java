package davigamer161.killmobscount.eventos;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import davigamer161.killmobscount.KillMobsCount;



public class Entrar implements Listener{

    private KillMobsCount plugin;

    public Entrar(KillMobsCount plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void alEntrar(PlayerJoinEvent event){
        Player jugador = event.getPlayer();
        FileConfiguration config = plugin.getConfig();
            String path = "Config.mensaje-bienvenida";
            if(config.getString(path).equals("true")){
                String texto = "Config.mensaje-bienvenida-texto";
                jugador.sendMessage(ChatColor.translateAlternateColorCodes('&',config.getString(texto)).replaceAll("%player%", jugador.getName()));
            }
            return;
    }
}
