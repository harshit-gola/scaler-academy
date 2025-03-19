package Design_Patterns.Creational.Factory.Document;

import Design_Patterns.Creational.Factory.Document.parser.DocumentParser;
import Design_Patterns.Creational.Factory.Document.parser.TextDocumentParser;
import Design_Patterns.Creational.Factory.Document.printer.DocumentPrinter;
import Design_Patterns.Creational.Factory.Document.printer.TextDocumentPrinter;
import Design_Patterns.Creational.Factory.Document.processor.DocumentProcessor;
import Design_Patterns.Creational.Factory.Document.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public DocumentParser createDocumentParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
