package Design_Patterns.Creational.Factory.Document;

import Design_Patterns.Creational.Factory.Document.parser.DocumentParser;
import Design_Patterns.Creational.Factory.Document.parser.SpreadsheetDocumentParser;
import Design_Patterns.Creational.Factory.Document.printer.DocumentPrinter;
import Design_Patterns.Creational.Factory.Document.printer.SpreadsheetDocumentPrinter;
import Design_Patterns.Creational.Factory.Document.processor.DocumentProcessor;
import Design_Patterns.Creational.Factory.Document.processor.SpreadsheetDocumentProcessor;

public class SpeadsheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREADSHEET;
    }
}
