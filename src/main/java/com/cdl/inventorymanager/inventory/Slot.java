package com.cdl.inventorymanager.inventory;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Slot {
    @Id
    @SequenceGenerator(name = "slot_sequence", sequenceName = "slot_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "slot_sequence")
    private Long id;
    private String name;
    private Long quantity;
    private String section;
    private Date verificationDate;

    public Slot() {
    }

    public Slot(String name, Long quantity, String section, Date verificationDate) {
        this.name = name;
        this.quantity = quantity;
        this.section = section;
        this.verificationDate = verificationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Date getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
    }
}
