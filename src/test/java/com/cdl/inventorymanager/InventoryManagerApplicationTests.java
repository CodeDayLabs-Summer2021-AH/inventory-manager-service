package com.cdl.inventorymanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InventoryManagerApplicationTests {

	@Autowired
	private InventoryManagerApplication inventoryManagerApplication;

	@Test
	void contextLoads() {
	}

	@Test
	void health() {
		assertEquals("HEALTH CHECK OK!", inventoryManagerApplication.healthCheck());
	}
}
