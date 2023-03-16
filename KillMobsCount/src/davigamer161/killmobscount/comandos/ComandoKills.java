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
                if(args[0].equalsIgnoreCase("zombie")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun zombie");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".zombiekills")){
                            int cantidadZombies = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombiekills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZombies+ChatColor.WHITE+" zombies");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun zombie");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("skeleton")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun esqueleto");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".skeletonkills")){
                            int cantidadSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".skeletonkills"));
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
                        if(config.contains("Players."+jugador.getUniqueId()+".spiderkills")){
                            int cantidadSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".spiderkills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSpider+ChatColor.WHITE+" arañas");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ninguna araña");
                            return true;
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("creeper")){
                    if(!config.contains("Players")){
                    jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun creeper");
                    return true;
                    }else{
                        if(config.contains("Players."+jugador.getUniqueId()+".creeperkills")){
                            int cantidadCreeper = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".creeperkills"));
                            jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCreeper+ChatColor.WHITE+" creepers");
                            return true;
                        }else{
                            jugador.sendMessage(ChatColor.WHITE+"Todavia no has matado ningun creeper");
                            return true;
                        }
                    }
                }
                }else{
                    jugador.sendMessage(ChatColor.WHITE+"<--------------KILLS-------------->");
                if(config.contains("Players."+jugador.getUniqueId()+".zombiekills")){
                    int cantidadZombies = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".zombiekills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadZombies+ChatColor.WHITE+" zombies");
                }else{
                }if(config.contains("Players."+jugador.getUniqueId()+".skeletonkills")){
                    int cantidadSkeleton = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".skeletonkills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSkeleton+ChatColor.WHITE+" esqueletos");
                }else{
                }if(config.contains("Players."+jugador.getUniqueId()+".spiderkills")){
                    int cantidadSpider = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".spiderkills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadSpider+ChatColor.WHITE+" arañas");
                }else{
                }if(config.contains("Players."+jugador.getUniqueId()+".creeperkills")){
                    int cantidadCreeper = Integer.valueOf(config.getString("Players."+jugador.getUniqueId()+".creeperkills"));
                    jugador.sendMessage(ChatColor.WHITE+"Has matado "+ChatColor.YELLOW+cantidadCreeper+ChatColor.WHITE+" creepers");
                }else{
                }
                return true;
            }
        }
        return false;
    }
}
