package com.cdl.inventorymanager.inventory;

import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

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

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI().info(new Info().title("Inventory Manager API")
                .description("Inventory Manager Documentation").version("v0.0.1")
                .license(new License().name("GPL v3.0").url(
                        "https://github.com/CodeDayLabs-Summer2021-AH/inventory-manager-service/blob/main/LICENSE")));
    }
}
