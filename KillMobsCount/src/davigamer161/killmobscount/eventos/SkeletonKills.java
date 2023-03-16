package davigamer161.killmobscount.eventos;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import davigamer161.killmobscount.KillMobsCount;

public class SkeletonKills implements Listener{
	private KillMobsCount plugin;

    public SkeletonKills(KillMobsCount plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void matarSkeleton(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SKELETON)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".skeletonkills")){
                int cantidadSkeleton = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".skeletonkills"));
                config.set("Players."+killer.getUniqueId()+".skeletonkills", cantidadSkeleton+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".skeletonkills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
}