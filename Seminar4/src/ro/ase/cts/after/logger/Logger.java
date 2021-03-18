package ro.ase.cts.after.logger;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Logger {

	private String fileName;
	private static Logger instance=null;
	public static final String WARNING_MESSAGE="Instance already created! \n Present instance will be used instead";
	
	public Logger() {
		this.fileName="log.txt";
	}
	
	public Logger(String fileName) {
		this();
		if(fileName != null) {
			this.fileName = fileName;
		} 
	}
	
	public static synchronized Logger getInstance() {
		if(instance==null) {
			instance=new Logger();
		} else {
			System.out.println(WARNING_MESSAGE);
		}
		return instance;
	}
	
	public static Logger getInstance(String fileName) {
		if(instance==null) {
			instance=new Logger(fileName);
		} else {
			System.out.println(WARNING_MESSAGE);
		}
		return instance;
	}
	
	public void log(String mesaj) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(this.fileName, true);
			Thread.sleep(4000);
			OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
			BufferedWriter bufferWriter=new BufferedWriter(outputStreamWriter);
			bufferWriter.write(String.valueOf(new Date()));
			bufferWriter.write(" ");
			bufferWriter.write(mesaj);
			bufferWriter.write(System.lineSeparator());
			bufferWriter.close();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
