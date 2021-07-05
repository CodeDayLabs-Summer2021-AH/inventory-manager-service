package com.cdl.inventorymanager.inventory;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private final Inventory mockInventory = new Inventory(List.of(new Slot(1l, "Slot_1", 100l, "Section_1", new Date()),
            new Slot(2l, "Slot_2", 200l, "Section_2", new Date())));

    public Inventory getInventory() {
        return mockInventory;
    }
}
