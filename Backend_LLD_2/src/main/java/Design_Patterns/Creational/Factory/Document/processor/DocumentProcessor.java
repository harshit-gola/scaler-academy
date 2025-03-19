package Design_Patterns.Creational.Factory.Document.processor;

import Design_Patterns.Creational.Factory.Document.DocumentType;

public abstract class DocumentProcessor {
    private final String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();
}
