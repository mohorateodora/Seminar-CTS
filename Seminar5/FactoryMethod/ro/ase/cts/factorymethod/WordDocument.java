package ro.ase.cts.factorymethod;

public class WordDocument implements Document{

	private String name;
	
	public WordDocument(String name) {
		this.name=name;
	}
	@Override
	public void open() {
       System.out.println(String.format("The document %s.docx is opening...",name));
		
	}

}
