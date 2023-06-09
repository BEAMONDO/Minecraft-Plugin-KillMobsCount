package davigamer161.killmobscount;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import davigamer161.killmobscount.comandos.ComandoKills;
import davigamer161.killmobscount.comandos.ComandoPrincipal;
import davigamer161.killmobscount.eventos.Kills;
import davigamer161.killmobscount.eventos.DespertarCama;
import davigamer161.killmobscount.eventos.DormirCama;
import davigamer161.killmobscount.eventos.Entrar;

public class KillMobsCount extends JavaPlugin{
    private FileConfiguration messages = null;
    private File messagesFile = null;
    public String rutaConfig;
    PluginDescriptionFile pdffile = getDescription();
    public String version = pdffile.getVersion();
    public String nombre = ChatColor.RED+"["+ChatColor.YELLOW+pdffile.getName()+ChatColor.RED+"] ";


  //---------------------Para cuando se activa el plugin----------------------------------//
    //------------------------------Desde aqui-----------------------------//
    public void onEnable(){
      Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"<------------------------------------>");
	    Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.WHITE+"Ha sido activado ("+ChatColor.GREEN+"version: "+ChatColor.YELLOW+version+ChatColor.WHITE+")");
	    Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.GREEN+"Gracias por utilizar mi plugin :)");
      Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE+"<------------------------------------>");
      registrarComandos();
      registrarEventos();
      registrarConfig();
      registerMessages();
    }
    //------------------------------Hasta aqui-----------------------------//



    //------------------Para cuando se desactiva el plugin----------------------------------//
    //------------------------------Desde aqui-----------------------------//
    public void onDisable(){
	    Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.WHITE+"Ha sido desactivado ("+ChatColor.GREEN+"version: "+ChatColor.YELLOW+version+ChatColor.WHITE+")");
    }
    //------------------------------Hasta aqui-----------------------------//



    //-----------------------Para registrar comandos----------------------------------------//
    //------------------------------Desde aqui-----------------------------//
    public void registrarComandos(){
      this.getCommand("kmc").setExecutor(new ComandoPrincipal(this));
      this.getCommand("kills").setExecutor(new ComandoKills(this));
    }
    //------------------------------Hasta aqui-----------------------------//



    //-------------------------Para registrar eventos---------------------------------------//
    //------------------------------Desde aqui-----------------------------//
    public void registrarEventos(){
      PluginManager pm = getServer().getPluginManager();
      pm.registerEvents(new Entrar(this), this);
      pm.registerEvents(new DormirCama(this), this);
      pm.registerEvents(new DespertarCama(this), this);
      pm.registerEvents(new Kills(this), this);

      
    }
    //------------------------------Hasta aqui-----------------------------//



    //--------------------------Para crear config.yml--------------------------------------//
    //------------------------------Desde aqui-----------------------------//
    public void registrarConfig(){
      File config = new File(this.getDataFolder(),"config.yml");
      rutaConfig = config.getPath();
      if(!config.exists()){
        this.getConfig().options().copyDefaults(true);
        saveConfig();
      }
    }
    //------------------------------Hasta aqui-----------------------------//



    //-------------------------Para crear messages.yml---------------------------------------//
    //------------------------------Desde aqui-----------------------------//
    public FileConfiguration getMessages(){
      if(messages == null){
        reloadMessages();
      }
      return messages;
    }
    public void reloadMessages(){
      if(messages == null){
        messagesFile = new File(getDataFolder(),"messages.yml");
      }
      messages = YamlConfiguration.loadConfiguration(messagesFile);
      Reader defConfigStream;
      try{
        defConfigStream = new InputStreamReader(this.getResource("messages.yml"),"UTF8");
        if(defConfigStream != null){
          YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
          messages.setDefaults(defConfig);
        }
      }catch(UnsupportedEncodingException e){
        e.printStackTrace();
      }
    }
    public void saveMessages(){
      try{
        messages.save(messagesFile);
      }catch(IOException e){
          e.printStackTrace();
        }
      }
      public void registerMessages(){
        messagesFile = new File(this.getDataFolder(),"messages.yml");
        if(!messagesFile.exists()){
          this.getMessages().options().copyDefaults(true);
          saveMessages();
        }
      }
      //------------------------------Hasta aqui-----------------------------//
}

