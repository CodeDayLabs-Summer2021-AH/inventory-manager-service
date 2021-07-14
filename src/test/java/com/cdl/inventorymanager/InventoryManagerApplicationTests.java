package com.cdl.inventorymanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.cdl.inventorymanager.inventory.InventoryController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InventoryManagerApplicationTests {

	@Autowired
	private InventoryController inventoryController;

	@Test
	void contextLoads() {
	}

	@Test
	void health() {
		assertEquals("HEALTH CHECK OK!", inventoryController.healthCheck());
	}
}
