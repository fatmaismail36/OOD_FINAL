/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package supplychaintrackingsystem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author M-ABEER
 */
public class InventoryTest {
    
    @Test
    public void testInitialStateIsOutOfStock() {
        System.out.println("Testing Inventory State Pattern: Initial state is OutOfStockState");

        Inventory inventory = new Inventory();

        System.out.println("Expected State: OutOfStockState");
        System.out.println("Actual State: " + inventory.getCurrentState().getClass().getSimpleName());
        System.out.println("Expected Stock Level: 0");
        System.out.println("Actual Stock Level: " + inventory.getStockLevel());
        System.out.println("Expected Availability: false");
        System.out.println("Actual Availability: " + inventory.checkAvailability());

        assertTrue(inventory.getCurrentState() instanceof OutOfStockState);
        assertEquals(0, inventory.getStockLevel());
        assertFalse(inventory.checkAvailability());

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }

    @Test
    public void testStateChangesToLowStockWhenStockIsBelowThreshold() {
        System.out.println("Testing Inventory State Pattern: Stock changes to LowStockState");

        Inventory inventory = new Inventory();
        inventory.setStockLevel(5);

        System.out.println("Stock Level Set To: 5");
        System.out.println("Reorder Threshold: " + inventory.getReorderThreshold());
        System.out.println("Expected State: LowStockState");
        System.out.println("Actual State: " + inventory.getCurrentState().getClass().getSimpleName());
        System.out.println("Expected Stock Condition: Low Stock");
        System.out.println("Actual Stock Condition: " + inventory.getStockCondition());

        assertTrue(inventory.getCurrentState() instanceof LowStockState);
        assertEquals(5, inventory.getStockLevel());
        assertTrue(inventory.checkAvailability());
        assertEquals("Low Stock", inventory.getStockCondition());

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }

    @Test
    public void testStateChangesToInStockWhenStockIsAboveThreshold() {
        System.out.println("Testing Inventory State Pattern: Stock changes to InStockState");

        Inventory inventory = new Inventory();
        inventory.setStockLevel(20);

        System.out.println("Stock Level Set To: 20");
        System.out.println("Reorder Threshold: " + inventory.getReorderThreshold());
        System.out.println("Expected State: InStockState");
        System.out.println("Actual State: " + inventory.getCurrentState().getClass().getSimpleName());
        System.out.println("Expected Stock Condition: In Stock");
        System.out.println("Actual Stock Condition: " + inventory.getStockCondition());

        assertTrue(inventory.getCurrentState() instanceof InStockState);
        assertEquals(20, inventory.getStockLevel());
        assertTrue(inventory.checkAvailability());
        assertEquals("In Stock", inventory.getStockCondition());

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }

    @Test
    public void testStateChangesBackToOutOfStockAfterRemovingAllStock() {
        System.out.println("Testing Inventory State Pattern: State changes back to OutOfStockState");

        Inventory inventory = new Inventory();
        inventory.setStockLevel(20);
        inventory.removeStock(20);

        System.out.println("Initial Stock Level: 20");
        System.out.println("Removed Stock Quantity: 20");
        System.out.println("Expected Final Stock Level: 0");
        System.out.println("Actual Final Stock Level: " + inventory.getStockLevel());
        System.out.println("Expected State: OutOfStockState");
        System.out.println("Actual State: " + inventory.getCurrentState().getClass().getSimpleName());
        System.out.println("Expected Stock Condition: Out of Stock");
        System.out.println("Actual Stock Condition: " + inventory.getStockCondition());

        assertTrue(inventory.getCurrentState() instanceof OutOfStockState);
        assertEquals(0, inventory.getStockLevel());
        assertFalse(inventory.checkAvailability());
        assertEquals("Out of Stock", inventory.getStockCondition());

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }

    @Test
    public void testAddStockFromOutOfStockChangesStateToLowStock() {
        System.out.println("Testing Inventory State Pattern: Adding stock from OutOfStockState");

        Inventory inventory = new Inventory();
        inventory.addStock(5);

        System.out.println("Added Stock Quantity: 5");
        System.out.println("Expected Stock Level: 5");
        System.out.println("Actual Stock Level: " + inventory.getStockLevel());
        System.out.println("Expected State: LowStockState");
        System.out.println("Actual State: " + inventory.getCurrentState().getClass().getSimpleName());
        System.out.println("Expected Availability: true");
        System.out.println("Actual Availability: " + inventory.checkAvailability());

        assertTrue(inventory.getCurrentState() instanceof LowStockState);
        assertEquals(5, inventory.getStockLevel());
        assertTrue(inventory.checkAvailability());

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeStockLevelThrowsException() {
        System.out.println("Testing Inventory validation: Negative stock level should throw exception");

        Inventory inventory = new Inventory();

        System.out.println("Input Stock Level: -1");
        System.out.println("Expected Result: IllegalArgumentException should be thrown");

        inventory.setStockLevel(-1);
    }
}

