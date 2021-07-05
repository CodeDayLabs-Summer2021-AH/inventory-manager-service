package com.cdl.inventorymanager.inventory;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    public List<Inventory> getInventories() {

        return List.of(new Inventory(1l, "Inventory1", 100l, "Section1", new Date()),
                new Inventory(2l, "Inventory2", 200l, "Section2", new Date()));
    }
}
