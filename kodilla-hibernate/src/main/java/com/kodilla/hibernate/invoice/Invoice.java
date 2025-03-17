package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    private int Id;
    private String number;
    private List<Item> items = new ArrayList<>();

    @OneToMany(targetEntity = Item.class,
            mappedBy = "invoice",
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID", unique = true)
    public int getId() {
        return Id;
    }

    @NotNull
    @Column(name = "INVOICE_NO", unique = true)
    public String getNumber() {
        return number;
    }

    private void setId(int id) {
        Id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private void setItems(List<Item> items) {
        this.items = items;
    }
}