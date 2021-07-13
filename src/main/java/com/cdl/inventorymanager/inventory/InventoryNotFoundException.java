package com.cdl.inventorymanager.inventory;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InventoryNotFoundException extends RuntimeException {
    public InventoryNotFoundException(Long id) {
        super(String.format("Inventory with id '%d' not found!", id));
    }
}
