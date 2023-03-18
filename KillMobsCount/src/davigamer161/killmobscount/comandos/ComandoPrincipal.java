package davigamer161.killmobscount.comandos;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import davigamer161.killmobscount.KillMobsCount;


public class ComandoPrincipal implements CommandExecutor{

    private KillMobsCount plugin;

    public ComandoPrincipal(KillMobsCount plugin){
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
        if(!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage(plugin.nombre+ChatColor.WHITE+" No puedes ejecutar este comando desde la consola");
            return false;
        }
        else{
            Player jugador = (Player) sender;
//-------------------------------------Comando version----------------------------------------------------------//
//----------------------------------------Desde aqui---------------------------------------//
           if(args.length > 0){
                if(args[0].equalsIgnoreCase("version")){
                    jugador.sendMessage(plugin.nombre+ChatColor.WHITE+"Version: "+ChatColor.YELLOW+plugin.version);
                    return true;
                }
                else if(args[0].equalsIgnoreCase("ver")){
                    jugador.sendMessage(plugin.nombre+ChatColor.WHITE+"Version: "+ChatColor.YELLOW+plugin.version);
                    return true;
                }
//----------------------------------------Hasta aqui---------------------------------------//

                

//---------------------------------------Comando help--------------------------------------------------------//
//----------------------------------------Desde aqui---------------------------------------//
                else if(args[0].equalsIgnoreCase("help")){
                    jugador.sendMessage(ChatColor.BLUE+"<-----------------"+ChatColor.GREEN+"COMANDOS"+ChatColor.BLUE+"----------------->");
                    jugador.sendMessage(ChatColor.YELLOW+" /kmc version "+ChatColor.WHITE+"o"+ChatColor.YELLOW+" /kmc ver "+ChatColor.WHITE+"Version");
                    jugador.sendMessage(ChatColor.YELLOW+" /kmc reload "+ChatColor.WHITE+"Recargar plugin");
                    jugador.sendMessage(ChatColor.YELLOW+" /kmc setspawn "+ChatColor.WHITE+"Crear spawn");
                    jugador.sendMessage(ChatColor.YELLOW+" /kmc spawn "+ChatColor.WHITE+"Ir al spawn");
                    jugador.sendMessage(ChatColor.YELLOW+" /kmc report <nombre> "+ChatColor.WHITE+"Reportar jugador"); 
                    jugador.sendMessage(ChatColor.YELLOW+" /kmc youtube "+ChatColor.WHITE+"Ver mi canal de youtube");
                    jugador.sendMessage(ChatColor.YELLOW+" /kmc discord "+ChatColor.WHITE+"Ver mi canal de discord");
                    jugador.sendMessage(ChatColor.YELLOW+" /kills "+ChatColor.WHITE+"Ver todas las Mobs Kills");
                    jugador.sendMessage(ChatColor.YELLOW+" /kills player "+ChatColor.WHITE+"Ver total de Player Kills");
                    jugador.sendMessage(ChatColor.YELLOW+" /kills <nombre mob en ingles> "+ChatColor.WHITE+"Mob Kills del mob elejido");                                       
                    return true;
                }
 //----------------------------------------Hasta aqui---------------------------------------//

                

 //--------------------------------------Comando reload---------------------------------------------------------//
 //----------------------------------------Desde aqui---------------------------------------//
                else if(args[0].equalsIgnoreCase("reload")){
                    plugin.reloadConfig();
                    plugin.reloadMessages();
                    jugador.sendMessage(plugin.nombre+ChatColor.WHITE+"El plugin ha sido recargado correctamente");
                    return true;
                }
 //----------------------------------------Hasta aqui---------------------------------------//

                

 //--------------------------------------Comando youtube---------------------------------------------------------//
 //----------------------------------------Desde aqui---------------------------------------//
                else if(args[0].equalsIgnoreCase("youtube")){
                    jugador.sendMessage(ChatColor.YELLOW+"<-------------------------------------------------->");
                    jugador.sendMessage(ChatColor.YELLOW+"Visita mi canal de youtube: "+ChatColor.GREEN+"www.youtube.com/@davigamer1614");
                    jugador.sendMessage(ChatColor.YELLOW+"<-------------------------------------------------->");
                    return true;
                }
 //----------------------------------------Hasta aqui---------------------------------------//

                

 //--------------------------------------Comando discord---------------------------------------------------------//
 //----------------------------------------Desde aqui---------------------------------------//
                else if(args[0].equalsIgnoreCase("discord")){
                    jugador.sendMessage(ChatColor.YELLOW+"<-------------------------------------------------->");
                    jugador.sendMessage(ChatColor.YELLOW+"Entra al discord del servidor: "+ChatColor.GREEN+"https://discord.gg/Myc2vfc4");
                    jugador.sendMessage(ChatColor.YELLOW+"<-------------------------------------------------->");
                    return true;
                }
 //----------------------------------------Hasta aqui---------------------------------------//



 //---------------------------------------Comando spawn--------------------------------------------------------//
 //----------------------------------------Desde aqui---------------------------------------//
                else if(args[0].equalsIgnoreCase("spawn")){
                    FileConfiguration config = plugin.getConfig();
                    if(config.contains("Config.Spawn.x")){
                    double x = Double.valueOf(config.getString("Config.Spawn.x"));
                    double y = Double.valueOf(config.getString("Config.Spawn.y"));
                    double z = Double.valueOf(config.getString("Config.Spawn.z"));
                    float yaw = Float.valueOf(config.getString("Config.Spawn.yaw"));
                    float pitch = Float.valueOf(config.getString("Config.Spawn.pitch"));
                    World world = plugin.getServer().getWorld(config.getString("Config.Spawn.world"));
                    
                    Location l = new Location(world, x, y, z, yaw, pitch);
                    jugador.teleport(l);
                    return true;
                    }else{
                        jugador.sendMessage(plugin.nombre+ChatColor.WHITE+"El spawn del servidor no existe");
                        return true;
                    }
                }
 //----------------------------------------Hasta aqui---------------------------------------//



 //-------------------------------------Comando setspawn-------------------------------------------------------//
 //----------------------------------------Desde aqui---------------------------------------//
                else if(args[0].equalsIgnoreCase("setspawn")){
                    Location l = jugador.getLocation();
                    double x = l.getX();
                    double y = l.getY();
                    double z = l.getZ();
                    String world = l.getWorld().getName();
                    float yaw = l.getYaw();
                    float pitch = l.getPitch();
                    FileConfiguration config = plugin.getConfig();
                    config.set("Config.Spawn.x", x);
                    config.set("Config.Spawn.y", y);
                    config.set("Config.Spawn.z", z);
                    config.set("Config.Spawn.world", world);
                    config.set("Config.Spawn.yaw", yaw);
                    config.set("Config.Spawn.pitch", pitch);
                    plugin.saveConfig();
                    jugador.sendMessage(plugin.nombre+ChatColor.WHITE+"El spawn del servidor ha sido puesto correctamente");
                    return true;
                }
 //----------------------------------------Hasta aqui-------------------------------------------------//



 //--------------------------------------Comando report----------------------------------------------------------------//
 //----------------------------------------Desde aqui-------------------------------------------------//
                else if(args[0].equalsIgnoreCase("report")){
                    if(args.length == 1){
                        jugador.sendMessage(plugin.nombre+ChatColor.RED+"Para reportar a un jugador utiliza: "+ChatColor.GRAY+"/kmc report <usuario>");
                        return true;
                    }else{
                        String usuario = args[1];
                        if(Bukkit.getPlayer(usuario) != null){
                            FileConfiguration config = plugin.getConfig();
                            if(config.contains("Config.usuarios-reportados")){
                                List<String> reportados = config.getStringList("Config.usuarios-reportados");
                                if(reportados.contains(usuario)){
                                    jugador.sendMessage(plugin.nombre+ChatColor.RED+"Ese jugador ya esta reportado");
                                    return true;
                                }else{
                                    reportados.add(usuario);
                                    config.set("Config.usuarios-reportados", reportados);
                                    plugin.saveConfig();
                                    jugador.sendMessage(plugin.nombre+ChatColor.GREEN+"El usuario ha sido reportado correctamente");
                                    return true;
                                }
                            }else{
                                List<String> reportados = new ArrayList<String>();
                                reportados.add(usuario);
                                config.set("Config.usuarios-reportados", reportados);
                                plugin.saveConfig();
                                jugador.sendMessage(plugin.nombre+ChatColor.GREEN+"El usuario ha sido reportado correctamente");
                                return true;
                            }
                        }else{
                           jugador.sendMessage(plugin.nombre+ChatColor.RED+"Ese jugador no esta conectado");
                        return true;
                        }
                    }
                }
 //----------------------------------------Hasta aqui-------------------------------------------------//

                else{
                    jugador.sendMessage(plugin.nombre+ChatColor.RED+"Ese comando no existe");
                    return true;
                }
           }else{
                jugador.sendMessage(plugin.nombre+ChatColor.WHITE+" Usa /kmc help para ver la lista de comandos");
                return true;
           }
        }
    }
}
