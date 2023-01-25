package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testItemDaoSaveWithProduct() {
//        Given
        Product milk = new Product("milk");
        Product butter = new Product("butter");

        Item item1 = new Item(milk, new BigDecimal(2.99), 3);
        Item item2 = new Item(butter, new BigDecimal(5.49), 1);

        Invoice invoice1 = new Invoice("098765432");

        milk.getItems().add(item1);
        butter.getItems().add(item2);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
//       When

        invoiceDao.save(invoice1);

        int invoiceId = invoice1.getId();
        String productName = invoice1.getItems().get(1).getProduct().getName();

//        Then
        assertNotEquals(0, invoiceId);
        assertEquals("butter", productName);

//        CleanUp
        invoiceDao.delete(invoice1);
    }


}