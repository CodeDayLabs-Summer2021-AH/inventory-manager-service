package com.cdl.inventorymanager.inventory;

import java.util.List;

public class Inventory {
    private List<Slot> slots;

    public Inventory() {
    }

    public Inventory(List<Slot> slots) {
        this.slots = slots;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }
}
