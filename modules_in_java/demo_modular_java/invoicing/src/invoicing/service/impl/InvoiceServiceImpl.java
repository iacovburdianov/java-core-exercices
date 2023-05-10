package invoicing.service.impl;

import invoicing.model.Invoice;
import invoicing.service.InvoiceService;

import java.util.List;

/**
 * Created by Admin on 5/10/2023
 *
 * @author : Admin
 * @date : 5/10/2023
 * @project : demo_modular_java
 */
public class InvoiceServiceImpl implements InvoiceService {
    @Override
    public List<Invoice> generateInvoices() {
        var i = new Invoice();
        i.setAmount(10);
        return List.of(i);
    }
}
