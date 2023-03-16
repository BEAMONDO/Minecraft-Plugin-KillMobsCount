package davigamer161.killmobscount.eventos;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import davigamer161.killmobscount.KillMobsCount;

public class CreeperKills implements Listener{
	private KillMobsCount plugin;

    public CreeperKills(KillMobsCount plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void matarCreepers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.CREEPER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".creeperkills")){
                int cantidadZombies = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".creeperkills"));
                config.set("Players."+killer.getUniqueId()+".creeperkills", cantidadZombies+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".creeperkills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
}
