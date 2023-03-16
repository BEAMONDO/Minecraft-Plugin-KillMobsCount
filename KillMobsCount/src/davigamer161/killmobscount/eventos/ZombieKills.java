package davigamer161.killmobscount.eventos;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import davigamer161.killmobscount.KillMobsCount;

public class ZombieKills implements Listener{
	private KillMobsCount plugin;

    public ZombieKills(KillMobsCount plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void matarZombies(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ZOMBIE)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".zombiekills")){
                int cantidadZombies = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".zombiekills"));
                config.set("Players."+killer.getUniqueId()+".zombiekills", cantidadZombies+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".zombiekills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
}
