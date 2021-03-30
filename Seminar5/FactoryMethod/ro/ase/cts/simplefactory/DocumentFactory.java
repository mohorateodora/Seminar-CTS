package ro.ase.cts.simplefactory;

public class DocumentFactory {

	 public Document getDocument(DocumentType documentType, String fileName) throws NoSuchDocumentException{
	        if(documentType == DocumentType.WORD){
	            return new WordDocument(fileName);
	        }else if(documentType == DocumentType.EXCEL){
	            return new ExcelDocument(fileName);
	        }else if(documentType == DocumentType.OPENOFFICE_WORD){
	            return new OpenOfficeWord(fileName);
	        }else if(documentType == DocumentType.OPENOFFICE_SPREADSHEET){
	            return new OpenOfficeSpreadSheet(fileName);
	        }
	        throw new NoSuchDocumentException();
	    }
}
