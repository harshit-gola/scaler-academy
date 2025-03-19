package Design_Patterns.Creational.Factory.Document.printer;

import Design_Patterns.Creational.Factory.Document.DocumentType;
import Design_Patterns.Creational.Factory.Document.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    @Override
    public void printDocument() {

    }

    @Override
    public DocumentType supportsType() {
        return null;
    }
}
