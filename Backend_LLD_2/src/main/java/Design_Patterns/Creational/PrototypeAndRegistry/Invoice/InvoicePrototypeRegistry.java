package Design_Patterns.Creational.PrototypeAndRegistry.Invoice;

public interface InvoicePrototypeRegistry {
    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}
