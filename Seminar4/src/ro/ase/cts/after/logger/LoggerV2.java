package ro.ase.cts.after.logger;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public enum LoggerV2 {
    INSTANCE;
	
	public void log(String mesaj) {
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
