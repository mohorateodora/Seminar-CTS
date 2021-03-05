package ro.ase.acs.main;

import ro.ase.acs.readers.ConsoleReader;
import ro.ase.acs.services.Orchestrator;
import ro.ase.acs.writers.ConsoleWriter;
import ro.ase.acs.writers.Writeable;
import ro.ase.acs.readers.Readable;

public class Main {
	
    public static void main(String[] args){
    	IoC ioC=new IoC();
    	ioC.register(Writeable.class, ConsoleReader.class);
    	ioC.register(Readable.class, ConsoleReader.class);
    	
    	Orchestrator orchestrator=new Orchestrator(new ConsoleReader(),
    			new ConsoleWriter());
    	orchestrator.execute();
    }
}