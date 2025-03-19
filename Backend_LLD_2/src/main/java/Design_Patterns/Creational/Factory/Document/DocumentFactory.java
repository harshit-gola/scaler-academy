package Design_Patterns.Creational.Factory.Document;

import Design_Patterns.Creational.Factory.Document.parser.DocumentParser;
import Design_Patterns.Creational.Factory.Document.printer.DocumentPrinter;
import Design_Patterns.Creational.Factory.Document.processor.DocumentProcessor;

public abstract class DocumentFactory {
    public abstract DocumentParser createDocumentParser(String path);
    public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor processor);
    public abstract DocumentProcessor createDocumentProcessor(String documentName);
    public abstract DocumentType supportsType();
}
