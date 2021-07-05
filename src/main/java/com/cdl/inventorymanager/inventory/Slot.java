package com.cdl.inventorymanager.inventory;

import java.util.Date;

public class Slot {
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

    public Slot(Long id, String name, Long quantity, String section, Date verificationDate) {
        this.id = id;
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
