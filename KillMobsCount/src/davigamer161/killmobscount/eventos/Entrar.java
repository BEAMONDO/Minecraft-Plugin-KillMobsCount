package davigamer161.killmobscount.eventos;

import java.util.List;

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
                FileConfiguration messages = plugin.getMessages();
                List<String> mensaje = messages.getStringList("Messages.mensaje-bienvenida-texto");
                for(int i=0;i<mensaje.size();i++){
                    String texto = mensaje.get(i);
                    jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("%player%", jugador.getName())));
                }
            }
            return;
        }
    @EventHandler
    public void spawnAlEntrar(PlayerJoinEvent event){
        Player jugador = event.getPlayer();
        FileConfiguration config = plugin.getConfig();
            String path = "Config.tp-spawn-al-entrar";
            if(config.getString(path).equals("true")){
                jugador.performCommand("kmc spawn");
            }
            return;
        }
}
