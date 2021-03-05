package ro.ase.acs.services;

import ro.ase.acs.writers.Writeable;
import ro.ase.acs.readers.Readable;
import ro.ase.acs.main.IoC;

public class Orchestrator {
     private Readable reader;
     private Writeable writer;
     private IoC ioC;
     
     public Orchestrator(Readable reader, Writeable writer) {
    	 this.reader=reader;
    	 this.writer=writer;
     }
     
     public Orchestrator(IoC ioC) {
         this.ioC = ioC;
         this.writer = this.ioC.resolve(Writeable.class);
         this.reader = this.ioC.resolve(Readable.class);
     }
     
	public void execute() {
       writer.write(reader.read());
	}
}
