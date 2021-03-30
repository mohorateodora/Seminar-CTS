package ro.ase.cts.main;

import ro.ase.cts.factorymethod.Document;
import ro.ase.cts.factorymethod.DocumentFactory;
import ro.ase.cts.factorymethod.DocumentType;
import ro.ase.cts.factorymethod.MicrosoftOfficeFactory;
import ro.ase.cts.factorymethod.NoSuchDocumentException;
import ro.ase.cts.factorymethod.OpenOfficeFactory;

public class NewMain {
	public static void main(String[] args) {
        DocumentFactory documentFactory = new OpenOfficeFactory();
        try {
            Document document = documentFactory.getDocument(DocumentType.SPREADSHEET,"studenti");
            document.open();
            Document document2 = documentFactory.getDocument(DocumentType.TEXT_EDITOR,"proiect");
            document2.open();
        } catch (NoSuchDocumentException e) {
            e.printStackTrace();
        }

    }
}
