package invoicing.service;

import invoicing.model.Invoice;
import invoicing.service.impl.InvoiceServiceImpl;

import java.util.List;

public interface InvoiceService {
    List<Invoice> generateInvoices();

    static InvoiceService build() {
        return new InvoiceServiceImpl();
    }
}
