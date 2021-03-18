import ro.ase.cts.after.classes.LoggerV3;
import ro.ase.cts.after.logger.LoggerV2;
import ro.ase.cts.before.classes.CommandLine;
import ro.ase.cts.before.classes.Gui;

public class NewMain {
     public static void main(String[] args) {
    	 Runnable r=()->{
         	Gui gui=new Gui();
     	};
     	new Thread(r).start();
     	CommandLine commandLine=new CommandLine();
     	
     	LoggerV2.INSTANCE.log("Message from NewMain");
  
     	LoggerV3.instance.log("Another message from NewMain");
     }
}
