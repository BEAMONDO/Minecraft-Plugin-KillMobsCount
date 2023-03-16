package davigamer161.killmobscount.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
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
           if(args.length > 0){
                if(args[0].equalsIgnoreCase("version")){
                    jugador.sendMessage(plugin.nombre+ChatColor.WHITE+" Version: "+ChatColor.YELLOW+plugin.version);
                    return true;
                }
                else if(args[0].equalsIgnoreCase("ver")){
                    jugador.sendMessage(plugin.nombre+ChatColor.WHITE+" Version: "+ChatColor.YELLOW+plugin.version);
                    return true;
                }

                else if(args[0].equalsIgnoreCase("help")){
                    jugador.sendMessage(plugin.nombre+ChatColor.YELLOW+" /kmc version "+ChatColor.WHITE+"o"+ChatColor.YELLOW+" /kmc ver "+ChatColor.WHITE+"Version");
                    jugador.sendMessage(plugin.nombre+ChatColor.YELLOW+" /kmc reload "+ChatColor.WHITE+"Recargar plugin");
                    jugador.sendMessage(plugin.nombre+ChatColor.YELLOW+" /kills "+ChatColor.WHITE+"Ver total de Mob Kills");
                    jugador.sendMessage(plugin.nombre+ChatColor.YELLOW+" /kills zombie "+ChatColor.WHITE+"Mob Kills de zombies");
                    jugador.sendMessage(plugin.nombre+ChatColor.YELLOW+" /kills skeleton "+ChatColor.WHITE+"Mob Kills de esqueletos");
                    jugador.sendMessage(plugin.nombre+ChatColor.YELLOW+" /kills spider "+ChatColor.WHITE+"Mob Kills de arañas");
                    jugador.sendMessage(plugin.nombre+ChatColor.YELLOW+" /kills creeper "+ChatColor.WHITE+"Mob Kills de creepers");
                    return true;
                }

                else if(args[0].equalsIgnoreCase("reload")){
                    plugin.reloadConfig();
                    jugador.sendMessage(plugin.nombre+ChatColor.WHITE+"El plugin ha sido recargado correctamente");
                    return true;
                }

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
