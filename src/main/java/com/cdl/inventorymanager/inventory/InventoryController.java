package com.cdl.inventorymanager.inventory;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping
    public ResponseEntity<Object> getInventory() {
        // TODO: Don't use hardcoded id. Use a query parameter instead.
        Long id = 1l;

        Optional<Inventory> inventory = inventoryService.getInventory(id);
        if (inventory.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(inventory.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(String.format("Inventory with id '%d' not found!", id));
        }
    }
}
