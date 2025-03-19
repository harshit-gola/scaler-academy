package Design_Patterns.Creational.Factory.Document;

public class client {
    public static void main(String[] args) {
        DocumentFactory document = new SpeadsheetDocumentFactory();
        document.createDocumentProcessor("Abc").processDocument();
    }
}
