package com.cdl.inventorymanager.inventory;

import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InventoryConfig {
    @Bean
    CommandLineRunner commandLineRunner(InventoryRepository inventoryRepository) {
        return args -> {
            Slot a = new Slot("Slot_1", 100l, "Section_1", new Date());
            Slot b = new Slot("Slot_2", 200l, "Section_2", new Date());
            Slot c = new Slot("Slot_3", 300l, "Section_3", new Date());

            Inventory inventory = new Inventory(List.of(a, b, c));

            inventoryRepository.save(inventory);
        };
    }
}
