package ro.ase.cts.factorymethod;

public class OpenOfficeFactory implements DocumentFactory{

	@Override
	public Document getDocument(DocumentType documentType, String name) throws NoSuchDocumentException {
		if(documentType==DocumentType.TEXT_EDITOR) {
			return new OpenOfficeWord(name);
		} else if(documentType==DocumentType.SPREADSHEET) {
			return new OpenOfficeSpreadSheet(name);
		}
		throw new NoSuchDocumentException();
	}

}
