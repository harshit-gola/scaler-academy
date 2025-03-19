package Design_Patterns.Creational.Factory.Document.printer;

import Design_Patterns.Creational.Factory.Document.DocumentType;
import Design_Patterns.Creational.Factory.Document.processor.DocumentProcessor;

public abstract class DocumentPrinter {
    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();
}
