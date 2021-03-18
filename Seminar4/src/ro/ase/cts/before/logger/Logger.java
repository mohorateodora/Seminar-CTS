package ro.ase.cts.before.logger;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Logger {

	private String fileName;
	
	public Logger() {
		this.fileName="log.txt";
	}
	
	public Logger(String fileName) {
		this();
		if(fileName != null) {
			this.fileName = fileName;
		} 
	}
	
	public void log(String mesaj) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(this.fileName, true);
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
