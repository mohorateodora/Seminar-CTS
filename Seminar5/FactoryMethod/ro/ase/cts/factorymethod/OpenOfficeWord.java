package ro.ase.cts.factorymethod;

public class OpenOfficeWord implements Document {
   private String name;
	
	public OpenOfficeWord(String name) {
		this.name=name;
	}
	@Override
	public void open() {
       System.out.println(String.format("The document %s.odt is opening...",name));
		
	}
}
