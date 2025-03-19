package Design_Patterns.Creational.Factory.Document.parser;

import Design_Patterns.Creational.Factory.Document.DocumentType;

public abstract class DocumentParser {
    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public abstract void parseDocument();

    public abstract DocumentType getDocumentType();
}
