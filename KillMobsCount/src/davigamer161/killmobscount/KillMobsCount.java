package davigamer161.killmobscount;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import davigamer161.killmobscount.comandos.ComandoKills;
import davigamer161.killmobscount.comandos.ComandoPrincipal;
import davigamer161.killmobscount.eventos.CreeperKills;
import davigamer161.killmobscount.eventos.Entrar;
import davigamer161.killmobscount.eventos.SkeletonKills;
import davigamer161.killmobscount.eventos.SpiderKills;
import davigamer161.killmobscount.eventos.ZombieKills;

public class KillMobsCount extends JavaPlugin{
    public String rutaConfig;
    PluginDescriptionFile pdffile = getDescription();
    public String version = pdffile.getVersion();
    public String nombre = ChatColor.RED+"["+ChatColor.YELLOW+pdffile.getName()+ChatColor.RED+"] ";

    public void onEnable(){
      Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"<------------------------------>");
	    Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.WHITE+"Ha sido activado ("+ChatColor.GREEN+"version: "+ChatColor.YELLOW+version+ChatColor.WHITE+")");
	    Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"Gracias por utilizar mi plugin :)");
      Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"<------------------------------>");
      registrarComandos();
      registrarEventos();
      registrarConfig();
    }

    public void onDisable(){
	    Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.WHITE+"Ha sido desactivado ("+ChatColor.GREEN+"version: "+ChatColor.YELLOW+version+ChatColor.WHITE+")");
    }

    public void registrarComandos(){
      this.getCommand("kmc").setExecutor(new ComandoPrincipal(this));
      this.getCommand("kills").setExecutor(new ComandoKills(this));
    }

    public void registrarEventos(){
      PluginManager pm = getServer().getPluginManager();
      pm.registerEvents(new Entrar(this), this);
      pm.registerEvents(new ZombieKills(this), this);
      pm.registerEvents(new SkeletonKills(this), this);
      pm.registerEvents(new SpiderKills(this), this);
      pm.registerEvents(new CreeperKills(this), this);
    }

    public void registrarConfig(){
      File config = new File(this.getDataFolder(),"config.yml");
      rutaConfig = config.getPath();
      if(!config.exists()){
        this.getConfig().options().copyDefaults(true);
        saveConfig();
      }
    }
}