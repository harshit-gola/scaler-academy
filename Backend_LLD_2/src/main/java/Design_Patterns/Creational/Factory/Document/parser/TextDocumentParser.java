package Design_Patterns.Creational.Factory.Document.parser;

import Design_Patterns.Creational.Factory.Document.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    @Override
    public void parseDocument() {
        // parse doc
    }

    @Override
    public DocumentType getDocumentType() {
        return DocumentType.TEXT;
    }
}
