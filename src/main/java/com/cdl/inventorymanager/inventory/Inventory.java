package com.cdl.inventorymanager.inventory;

import java.util.List;

public class Inventory {
    private Long id;
    private List<Slot> slots;

    public Inventory() {
    }

    public Inventory(List<Slot> slots) {
        this.slots = slots;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }
}
