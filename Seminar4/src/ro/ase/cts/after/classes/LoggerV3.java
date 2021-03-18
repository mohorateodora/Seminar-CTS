package ro.ase.cts.after.classes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class LoggerV3 {
    public static LoggerV3 instance=null;
    static {
    	instance=new LoggerV3();
    }
    
    public synchronized void log(String mesaj) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("log.txt", true);
			OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
			BufferedWriter bufferWriter=new BufferedWriter(outputStreamWriter);
			bufferWriter.write(String.valueOf(new Date()));
			bufferWriter.write(" ");
			bufferWriter.write(mesaj);
			bufferWriter.write(System.lineSeparator());
			bufferWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
