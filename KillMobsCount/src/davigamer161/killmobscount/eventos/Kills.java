package davigamer161.killmobscount.eventos;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import davigamer161.killmobscount.KillMobsCount;

public class Kills implements Listener{
	private KillMobsCount plugin;

    public Kills(KillMobsCount plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void matarPlayers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.PLAYER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".player_kills")){
                int cantidadPlayer = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".player_kills"));
                config.set("Players."+killer.getUniqueId()+".player_kills", cantidadPlayer+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".player_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarBlazes(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.BLAZE)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".blaze_kills")){
                int cantidadBlaze = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".blaze_kills"));
                config.set("Players."+killer.getUniqueId()+".blaze_kills", cantidadBlaze+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".blaze_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarCaveSpider(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.CAVE_SPIDER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".cave_spider_kills")){
                int cantidadCaveSpider = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".cave_spider_kills"));
                config.set("Players."+killer.getUniqueId()+".cave_spider_kills", cantidadCaveSpider+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".cave_spider_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarCreepers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.CREEPER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".creeper_kills")){
                int cantidadCreeper = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".creeper_kills"));
                config.set("Players."+killer.getUniqueId()+".creeper_kills", cantidadCreeper+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".creeper_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarDrowneds(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.DROWNED)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".drowned_kills")){
                int cantidadDrowned = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".drowned_kills"));
                config.set("Players."+killer.getUniqueId()+".drowned_kills", cantidadDrowned+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".drowned_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarElderGuardians(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ELDER_GUARDIAN)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".elder_guardian_kills")){
                int cantidadElderGuardian = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".elder_guardian_kills"));
                config.set("Players."+killer.getUniqueId()+".elder_guardian_kills", cantidadElderGuardian+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".elder_guardian_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarEndermans(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ENDERMAN)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".enderman_kills")){
                int cantidadEnderman = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".enderman_kills"));
                config.set("Players."+killer.getUniqueId()+".enderman_kills", cantidadEnderman+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".enderman_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarEndermites(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ENDERMITE)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".endermite_kills")){
                int matarEndermite = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".endermite_kills"));
                config.set("Players."+killer.getUniqueId()+".endermite_kills", matarEndermite+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".endermite_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarEvokers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.EVOKER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".evoker_kills")){
                int cantidadEvoker = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".evoker_kills"));
                config.set("Players."+killer.getUniqueId()+".evoker_kills", cantidadEvoker+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".evoker_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarGhasts(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.GHAST)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".ghast_kills")){
                int cantidadGhast = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".ghast_kills"));
                config.set("Players."+killer.getUniqueId()+".ghast_kills", cantidadGhast+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".ghast_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarGuardians(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.GUARDIAN)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".guardian_kills")){
                int cantidadGuardian = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".guardian_kills"));
                config.set("Players."+killer.getUniqueId()+".guardian_kills", cantidadGuardian+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".guardian_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarHoglis(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.HOGLIN)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".hoglin_kills")){
                int cantidadHoglin = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".hoglin_kills"));
                config.set("Players."+killer.getUniqueId()+".hoglin_kills", cantidadHoglin+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".hoglin_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarHusk(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.HUSK)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".husk_kills")){
                int cantidadHusk = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".husk_kills"));
                config.set("Players."+killer.getUniqueId()+".husk_kills", cantidadHusk+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".husk_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarIronGolems(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.IRON_GOLEM)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".iron_golem_kills")){
                int cantidadIronGolem = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".iron_golem_kills"));
                config.set("Players."+killer.getUniqueId()+".iron_golem_kills", cantidadIronGolem+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".iron_golem_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarMagmaCubes(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.MAGMA_CUBE)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".magma_cube_kills")){
                int cantidadMagmaCube = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".magma_cube_kills"));
                config.set("Players."+killer.getUniqueId()+".magma_cube_kills", cantidadMagmaCube+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".magma_cube_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarPhantoms(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.PHANTOM)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".phantom_kills")){
                int cantidadPhantom = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".phantom_kills"));
                config.set("Players."+killer.getUniqueId()+".phantom_kills", cantidadPhantom+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".phantom_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarPiglinBrutes(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.PIGLIN_BRUTE)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".piglin_brute_kills")){
                int cantidadPiglinBrute = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".piglin_brute_kills"));
                config.set("Players."+killer.getUniqueId()+".piglin_brute_kills", cantidadPiglinBrute+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".piglin_brute_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarPiglins(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.PIGLIN)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".piglin_kills")){
                int cantidadPiglin = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".piglin_kills"));
                config.set("Players."+killer.getUniqueId()+".piglin_kills", cantidadPiglin+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".piglin_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarPillagers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.PILLAGER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".pillager_kills")){
                int cantidadPillager = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".pillager_kills"));
                config.set("Players."+killer.getUniqueId()+".pillager_kills", cantidadPillager+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".pillager_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarRavagers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.RAVAGER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".ravager_kills")){
                int cantidadRavager = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".ravager_kills"));
                config.set("Players."+killer.getUniqueId()+".ravager_kills", cantidadRavager+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".ravager_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }@EventHandler
    public void matarShulkers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SHULKER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".shulker_kills")){
                int cantidadShulker = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".shulker_kills"));
                config.set("Players."+killer.getUniqueId()+".shulker_kills", cantidadShulker+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".shulker_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarSilverfishs(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SILVERFISH)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".silverfish_kills")){
                int cantidadSilverfish = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".silverfish_kills"));
                config.set("Players."+killer.getUniqueId()+".silverfish_kills", cantidadSilverfish+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".silverfish_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarSkeleton(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SKELETON)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".skeleton_kills")){
                int cantidadSkeleton = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".skeleton_kills"));
                config.set("Players."+killer.getUniqueId()+".skeleton_kills", cantidadSkeleton+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".skeleton_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarSlimes(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SLIME)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".slime_kills")){
                int cantidadSlime = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".slime_kills"));
                config.set("Players."+killer.getUniqueId()+".slime_kills", cantidadSlime+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".slime_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarSpider(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.SPIDER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".spider_kills")){
                int cantidadSpider = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".spider_kills"));
                config.set("Players."+killer.getUniqueId()+".spider_kills", cantidadSpider+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".spider_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarStrays(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType. STRAY)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".stray_kills")){
                int cantidadStray = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+". stray_kills"));
                config.set("Players."+killer.getUniqueId()+".stray_kills", cantidadStray+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".stray_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarVexs(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.VEX)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".vex_kills")){
                int cantidadVex = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".vex_kills"));
                config.set("Players."+killer.getUniqueId()+".vex_kills", cantidadVex+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".vex_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarVindicators(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.VINDICATOR)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".vindicator_kills")){
                int cantidadVindicator = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".vindicator_kills"));
                config.set("Players."+killer.getUniqueId()+".vindicator_kills", cantidadVindicator+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".vindicator_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarWitch(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.WITCH)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".witch_kills")){
                int cantidadWitch = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".witch_kills"));
                config.set("Players."+killer.getUniqueId()+".witch_kills", cantidadWitch+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".witch_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarWithers(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.WITHER)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".wither_kills")){
                int cantidadWither = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".wither_kills"));
                config.set("Players."+killer.getUniqueId()+".wither_kills", cantidadWither+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".wither_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarWitherSkeletons(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.WITHER_SKELETON)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".wither_skeleton_kills")){
                int cantidadWitherSkeleton = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".wither_skeleton_kills"));
                config.set("Players."+killer.getUniqueId()+".wither_skeleton_kills", cantidadWitherSkeleton+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".wither_skeleton_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarZoglins(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ZOGLIN)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".zoglin_kills")){
                int cantidadZoglin = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".zoglin_kills"));
                config.set("Players."+killer.getUniqueId()+".zoglin_kills", cantidadZoglin+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".zoglin_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarZombies(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ZOMBIE)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".zombie_kills")){
                int cantidadZombie = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".zombie_kills"));
                config.set("Players."+killer.getUniqueId()+".zombie_kills", cantidadZombie+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".zombie_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
    @EventHandler
    public void matarZombifiedPiglins(EntityDeathEvent event){
        Player killer = event.getEntity().getKiller();
        EntityType entidad = event.getEntityType();
        if(killer !=null && killer.getType().equals(EntityType.PLAYER) && entidad.equals(EntityType.ZOMBIFIED_PIGLIN)){
            FileConfiguration config = plugin.getConfig();
            config.set("Players."+killer.getUniqueId()+".name", killer.getName());
            if(config.contains("Players."+killer.getUniqueId()+".zombified_piglin_kills")){
                int cantidadZombifiedPiglin = Integer.valueOf(config.getString("Players."+killer.getUniqueId()+".zombified_piglin_kills"));
                config.set("Players."+killer.getUniqueId()+".zombified_piglin_kills", cantidadZombifiedPiglin+1);
                plugin.saveConfig();
                return;
            }else{
                config.set("Players."+killer.getUniqueId()+".zombified_piglin_kills", 1);
                plugin.saveConfig();
                return;
            }
        }
    }
}
