package davigamer161.killmobscount.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import davigamer161.killmobscount.KillMobsCount;

public class ComandoKills implements CommandExecutor{

    private KillMobsCount plugin;

    public ComandoKills(KillMobsCount plugin){
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
        if(!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage(plugin.nombre+ChatColor.WHITE+" No puedes ejecutar este comando desde la consola");
            return false;
        }
        else{
            Player jugador = (Player) sender;
            FileConfiguration config = plugin.getConfig();
            if(!config.contains("Players")){
                jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun mob");
                return true;
            }if(args.length > 0){
                if(args[0].equalsIgnoreCase("player")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun jugador");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".player_kills")){
                            int cantidadPlayers = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".player_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPlayers+ChatColor.WHITE+" jugadores");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun jugador");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("zombie")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun zombi");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".zombie_kills")){
                            int cantidadZombies = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombie_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZombies+ChatColor.WHITE+" zombis");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun zombi");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("skeleton")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun esqueleto");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".skeleton_kills")){
                            int cantidadSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".skeleton_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSkeleton+ChatColor.WHITE+" esqueletos");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun esqueleto");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("spider")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna araña");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".spider_kills")){
                            int cantidadSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".spider_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSpider+ChatColor.WHITE+" arañas");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna araña");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("cavespider")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna araña de cueva");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".cave_spider_kills")){
                            int cantidadCaveSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".cave_spider_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCaveSpider+ChatColor.WHITE+" arañas de cueva");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna araña de cueva");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("creeper")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun creeper");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".creeper_kills")){
                            int cantidadCreeper = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".creeper_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCreeper+ChatColor.WHITE+" creepers");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun creeper");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("witch")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna bruja");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".witch_kills")){
                            int cantidadCreeper = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".witch_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCreeper+ChatColor.WHITE+" brujas");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna bruja");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("blaze")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun blaze");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".blaze_kills")){
                            int cantidadBlaze = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".blaze_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadBlaze+ChatColor.WHITE+" blazes");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun blaze");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("drowned")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun blaze");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".drowned_kills")){
                            int cantidadDrowned = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".drowned_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadDrowned+ChatColor.WHITE+" ahogados");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun ahogado");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("elder_guardian")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun guardian anciano");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".elder_guardian_kills")){
                            int cantidadElderGuardian = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".elder_guardian_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadElderGuardian+ChatColor.WHITE+" guardianes ancianos");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun guardian anciano");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("enderman")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun enderman");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".enderman_kills")){
                            int cantidadEnderman = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".enderman_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEnderman+ChatColor.WHITE+" endermans");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun enderman");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("endermite")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun endermite");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".endermite_kills")){
                            int cantidadEndermite = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".endermite_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEndermite+ChatColor.WHITE+" endermites");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun endermite");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("evoker")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun evoker");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".evoker_kills")){
                            int cantidadEvoker = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".evoker_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEvoker+ChatColor.WHITE+" evokers");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun evoker");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("ghast")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun ghast");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".ghast_kills")){
                            int cantidadGhast = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".ghast_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadGhast+ChatColor.WHITE+" ghasts");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun ghast");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("guardian")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun guardian");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".guardian_kills")){
                            int cantidadGuardian = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".guardian_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadGuardian+ChatColor.WHITE+" guardianes");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun guardian");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("hoglin")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun hoglin");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".hoglin_kills")){
                            int cantidadHoglin = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".hoglin_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadHoglin+ChatColor.WHITE+" hoglins");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun hoglin");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("husk")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun husk");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".husk_kills")){
                            int cantidadHusk = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".husk_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadHusk+ChatColor.WHITE+" husks");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun husk");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("iron_golem")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun golem de hierro");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".iron_golem_kills")){
                            int cantidadIronGolem = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".iron_golem_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadIronGolem+ChatColor.WHITE+" golems de hierro");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun golem de hierro");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("magma_cube")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun cubo de magma");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".magma_cube_kills")){
                            int cantidadMagmaCube = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".magma_cube_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadMagmaCube+ChatColor.WHITE+" cubos de magma");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun cubo de magma");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("phantom")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun fantasma");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".phantom_kills")){
                            int cantidadPhantom = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".phantom_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPhantom+ChatColor.WHITE+" fantasmas");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun fantasma");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("piglin_brute")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun piglin bruto");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".piglin_brute_kills")){
                            int cantidadPiglinBrute = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".piglin_brute_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPiglinBrute+ChatColor.WHITE+" piglins brutos");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun piglin bruto");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("piglin")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun piglin");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".piglin_kills")){
                            int cantidadPiglin = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".piglin_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPiglin+ChatColor.WHITE+" piglins");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun piglin");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("pillager")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun saqueador");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".pillager_kills")){
                            int cantidadPillager = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".pillager_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPillager+ChatColor.WHITE+" saqueadores");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun saqueador");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("ravager")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun devastador");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".ravager_kills")){
                            int cantidadRavager = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".ravager_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadRavager+ChatColor.WHITE+" devastadores");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun devastador");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("shulker")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun shulker");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".shulker_kills")){
                            int cantidadShulker = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".shulker_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadShulker+ChatColor.WHITE+" shulkers");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun shulker");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("silverfish")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun lepisma");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".silverfish_kills")){
                            int cantidadSilverfish = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".silverfish_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSilverfish+ChatColor.WHITE+" lepismas");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun lepisma");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("slime")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun slime");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".slime_kills")){
                            int cantidadSlime = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".slime_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSlime+ChatColor.WHITE+" slimes");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun slime");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("stray")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun esqueleto glacial");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".stray_kills")){
                            int cantidadStray = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".stray_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadStray+ChatColor.WHITE+" esqueletos glacial");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun esqueleto glacial");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("vex")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun vex");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".vex_kills")){
                            int cantidadVex = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".vex_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadVex+ChatColor.WHITE+" vexes");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun vex");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("vindicator")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun vindicador");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".vindicator_kills")){
                            int cantidadVindicator = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".vindicator_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadVindicator+ChatColor.WHITE+" vindicadores");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun vindicador");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("wither")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun wither");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".wither_kills")){
                            int cantidadWither = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".wither_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadWither+ChatColor.WHITE+" withers");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun wither");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("wither_skeleton")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun esqueleto wither");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".wither_skeleton_kills")){
                            int cantidadWitherSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".wither_skeleton_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadWitherSkeleton+ChatColor.WHITE+" esqueletos wither");                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun esqueleto wither");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("zoglin")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun zoglin");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".zoglin_kills")){
                            int cantidadZoglin = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zoglin_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZoglin+ChatColor.WHITE+" zoglins");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun zoglin");
                            return true;
                        }
                    }
                }else if(args[0].equalsIgnoreCase("zombified_piglin")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun piglin zombificado");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".zombified_piglin_kills")){
                            int cantidadZombifiedPiglins = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombified_piglin_kills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZombifiedPiglins+ChatColor.WHITE+" piglins zombificados");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun piglin zombificado");
                            return true;
                        }
                    }
                }

                }else{
                    jugador.sendMessage(ChatColor.BLUE+"<-----------------"+ChatColor.GREEN+"KILLS"+ChatColor.BLUE+"----------------->");
                if(config.contains("Players."+jugador.getUniqueId()+".zombie_kills")){
                    int cantidadZombies = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombie_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZombies+ChatColor.WHITE+" zombie");
                }if(config.contains("Players."+jugador.getUniqueId()+".skeleton_kills")){
                    int cantidadSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".skeleton_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSkeleton+ChatColor.WHITE+" esqueletos");
                }if(config.contains("Players."+jugador.getUniqueId()+".spider_kills")){
                    int cantidadSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".spider_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSpider+ChatColor.WHITE+" arañas");
                }if(config.contains("Players."+jugador.getUniqueId()+".cave_spider_kills")){
                    int cantidadCaveSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".cave_spider_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCaveSpider+ChatColor.WHITE+" arañas de cueva");
                }if(config.contains("Players."+jugador.getUniqueId()+".creeper_kills")){
                    int cantidadCreeper = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".creeper_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCreeper+ChatColor.WHITE+" creepers");
                }if(config.contains("Players."+jugador.getUniqueId()+".witch_kills")){
                    int cantidadWitch = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".witch_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadWitch+ChatColor.WHITE+" brujas");
                }if(config.contains("Players."+jugador.getUniqueId()+".bee_kills")){
                    int cantidadBee = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".bee_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadBee+ChatColor.WHITE+" abejas");
                }if(config.contains("Players."+jugador.getUniqueId()+".drowned_kills")){
                    int cantidadDrowned = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".drowned_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadDrowned+ChatColor.WHITE+" ahogados");
                }if(config.contains("Players."+jugador.getUniqueId()+".elder_guardian_kills")){
                    int cantidadElderGuardian = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".elder_guardian_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadElderGuardian+ChatColor.WHITE+" guardianes ancianos");
                }if(config.contains("Players."+jugador.getUniqueId()+".enderman_kills")){
                    int cantidadEnderman = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".enderman_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEnderman+ChatColor.WHITE+" endermans");
                }if(config.contains("Players."+jugador.getUniqueId()+".endermite_kills")){
                    int cantidadEndermite = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".endermite_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEndermite+ChatColor.WHITE+" endermites");
                }if(config.contains("Players."+jugador.getUniqueId()+".evoker_kills")){
                    int cantidadEvoker = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".evoker_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadEvoker+ChatColor.WHITE+" evokers");
                }if(config.contains("Players."+jugador.getUniqueId()+".ghast_kills")){
                    int cantidadGhast = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".ghast_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadGhast+ChatColor.WHITE+" ghasts");
                }if(config.contains("Players."+jugador.getUniqueId()+".guardian_kills")){
                    int cantidadGuardian = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".guardian_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadGuardian+ChatColor.WHITE+" guardianes");
                }if(config.contains("Players."+jugador.getUniqueId()+".hoglin_kills")){
                    int cantidadHoglin = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".hoglin_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadHoglin+ChatColor.WHITE+" hoglins");
                }if(config.contains("Players."+jugador.getUniqueId()+".husk_kills")){
                    int cantidadHusk = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".husk_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadHusk+ChatColor.WHITE+" husks");
                }if(config.contains("Players."+jugador.getUniqueId()+".iron_golem_kills")){
                    int cantidadIronGolem = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".iron_golem_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadIronGolem+ChatColor.WHITE+" golems de hierro");
                }if(config.contains("Players."+jugador.getUniqueId()+".magma_cube_kills")){
                    int cantidadMagmaCube = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".magma_cube_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadMagmaCube+ChatColor.WHITE+" cubos de magma");
                }if(config.contains("Players."+jugador.getUniqueId()+".phantom_kills")){
                    int cantidadPhantom = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".phantom_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPhantom+ChatColor.WHITE+" fantasmas");
                }if(config.contains("Players."+jugador.getUniqueId()+".piglin_brute_kills")){
                    int cantidadPiglinBrute = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".piglin_brute_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPiglinBrute+ChatColor.WHITE+" piglins brutos");
                }if(config.contains("Players."+jugador.getUniqueId()+".piglin_kills")){
                    int cantidadPiglin = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".piglin_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPiglin+ChatColor.WHITE+" piglins");
                }if(config.contains("Players."+jugador.getUniqueId()+".pillager_kills")){
                    int cantidadPillager = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".pillager_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadPillager+ChatColor.WHITE+" saqueadores");
                }if(config.contains("Players."+jugador.getUniqueId()+".ravager_kills")){
                    int cantidadRavager = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".ravager_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadRavager+ChatColor.WHITE+" devastadores");
                }if(config.contains("Players."+jugador.getUniqueId()+".shulker_kills")){
                    int cantidadShulker = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".shulker_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadShulker+ChatColor.WHITE+" shulkers");
                }if(config.contains("Players."+jugador.getUniqueId()+".silverfish_kills")){
                    int cantidadSilverfish = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".silverfish_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSilverfish+ChatColor.WHITE+" lepismas");
                }if(config.contains("Players."+jugador.getUniqueId()+".slime_kills")){
                    int cantidadSlime = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".slime_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSlime+ChatColor.WHITE+" slimes");
                }if(config.contains("Players."+jugador.getUniqueId()+".stray_kills")){
                    int cantidadStray = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".stray_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadStray+ChatColor.WHITE+" esqueletos glacial");
                }if(config.contains("Players."+jugador.getUniqueId()+".vex_kills")){
                    int cantidadVex = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".vex_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadVex+ChatColor.WHITE+" vexes");
                }if(config.contains("Players."+jugador.getUniqueId()+".vindicator_kills")){
                    int cantidadVindicator = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".vindicator_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadVindicator+ChatColor.WHITE+" vindicadores");
                }if(config.contains("Players."+jugador.getUniqueId()+".wither_kills")){
                    int cantidadWither = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".wither_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadWither+ChatColor.WHITE+" withers");
                }if(config.contains("Players."+jugador.getUniqueId()+".wither_skeleton_kills")){
                    int cantidadWitherSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".wither_skeleton_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadWitherSkeleton+ChatColor.WHITE+" esqueletos wither");
                }if(config.contains("Players."+jugador.getUniqueId()+".zoglin_kills")){
                    int cantidadZoglin = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zoglin_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZoglin+ChatColor.WHITE+" zoglins");
                }if(config.contains("Players."+jugador.getUniqueId()+".zombified_piglin_kills")){
                    int cantidadZombifiedPiglins = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombified_piglin_kills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZombifiedPiglins+ChatColor.WHITE+" piglins zombificados");
                }
                return true;
            }
        }
        return false;
    }
}
