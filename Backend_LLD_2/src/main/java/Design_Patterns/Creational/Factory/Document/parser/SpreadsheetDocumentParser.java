package Design_Patterns.Creational.Factory.Document.parser;

import Design_Patterns.Creational.Factory.Document.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    @Override
    public void parseDocument() {
        // parse
    }

    @Override
    public DocumentType getDocumentType() {
        return DocumentType.SPREADSHEET;
    }
}
