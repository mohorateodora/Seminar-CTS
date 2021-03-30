package ro.ase.cts.main;

import ro.ase.cts.simplefactory.Document;
import ro.ase.cts.simplefactory.DocumentFactory;
import ro.ase.cts.simplefactory.DocumentType;
import ro.ase.cts.simplefactory.NoSuchDocumentException;

public class Main {
   public static void main(String[] args) {
	   DocumentFactory documentFactory=new DocumentFactory();
	   
	try {
	   Document document=documentFactory.getDocument(DocumentType.EXCEL, "studenti");
	   document.open();
	   Document document2=documentFactory.getDocument(DocumentType.OPENOFFICE_WORD, "proiect");
	   document2.open();
	} catch (NoSuchDocumentException e) {
		e.printStackTrace();
	}
   }
}
