package Design_Patterns.Creational.PrototypeAndRegistry.Invoice;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImpl implements InvoicePrototypeRegistry {
    Map<InvoiceType, Invoice> invoices;

    InvoicePrototypeRegistryImpl() {
        invoices = new HashMap<>();
    }

    @Override
    public void addPrototype(Invoice user) {
        invoices.put(user.getType(), user);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return invoices.get(type);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        return invoices.get(type).cloneObject();
    }
}
