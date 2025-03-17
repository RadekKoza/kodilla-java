package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Transactional
    @Test
    void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("apple pie");
        Product product2 = new Product("ballistic missile");
        Product product3 = new Product("washing machine");
        Product product4 = new Product("chair");
        Item item1 = new Item(product1, new BigDecimal("23.50"),2);
        Item item2 = new Item(product2, new BigDecimal("2.70"),34);
        Item item3 = new Item(product3, new BigDecimal("213.99"),4);
        Item item4 = new Item(product4, new BigDecimal("21.80"),3);
        Invoice invoice1 = new Invoice("12/2025");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);
        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);
        invoiceDao.save(invoice1);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        int invoiceId = invoice1.getId();

        //Then
        assertNotEquals(0, invoiceId);
    }
}