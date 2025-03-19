package Design_Patterns.Creational.Factory.Document.printer;

import Design_Patterns.Creational.Factory.Document.DocumentType;
import Design_Patterns.Creational.Factory.Document.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    @Override
    public void printDocument() {
        // print document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREADSHEET;
    }
}
