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
public class CustomerTest {
    

    @Test
    public void testAddShipmentSuccessfully() {
        System.out.println("Testing Customer.addShipment(): Add valid shipment");

        Customer customer = new Customer(
                1,
                "Rawan",
                "rawan@gmail.com",
                "password123",
                "Customer",
                "Cairo, Egypt"
        );

        Shipment shipment = new Shipment();

        customer.addShipment(shipment);

        System.out.println("Expected Shipment List Size: 1");
        System.out.println("Actual Shipment List Size: " + customer.getShipments().size());
        System.out.println("Expected Shipment Customer: Rawan");
        System.out.println("Actual Shipment Customer: " + shipment.getCustomer().getName());

        assertTrue(customer.getShipments().contains(shipment));
        assertEquals(customer, shipment.getCustomer());

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }

    @Test
    public void testAddNullShipmentDoesNothing() {
        System.out.println("Testing Customer.addShipment(): Null shipment should not be added");

        Customer customer = new Customer(
                1,
                "Rawan",
                "rawan@gmail.com",
                "password123",
                "Customer",
                "Cairo, Egypt"
        );

        customer.addShipment(null);

        System.out.println("Input Shipment: null");
        System.out.println("Expected Shipment List Size: 0");
        System.out.println("Actual Shipment List Size: " + customer.getShipments().size());

        assertEquals(0, customer.getShipments().size());

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }

    @Test
    public void testDuplicateShipmentIsNotAddedTwice() {
        System.out.println("Testing Customer.addShipment(): Duplicate shipment should not be added twice");

        Customer customer = new Customer(
                1,
                "Rawan",
                "rawan@gmail.com",
                "password123",
                "Customer",
                "Cairo, Egypt"
        );

        Shipment shipment = new Shipment();

        customer.addShipment(shipment);
        customer.addShipment(shipment);

        System.out.println("Same shipment added twice.");
        System.out.println("Expected Shipment List Size: 1");
        System.out.println("Actual Shipment List Size: " + customer.getShipments().size());

        assertEquals(1, customer.getShipments().size());

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }

    @Test
    public void testShipmentCustomerIsChangedToThisCustomer() {
        System.out.println("Testing Customer.addShipment(): Shipment customer reference is updated");

        Customer oldCustomer = new Customer(
                1,
                "Old Customer",
                "old@gmail.com",
                "password123",
                "Customer",
                "Old Address"
        );

        Customer newCustomer = new Customer(
                2,
                "New Customer",
                "new@gmail.com",
                "password123",
                "Customer",
                "New Address"
        );

        Shipment shipment = new Shipment();
        shipment.setCustomer(oldCustomer);

        System.out.println("Initial Shipment Customer: " + shipment.getCustomer().getName());

        newCustomer.addShipment(shipment);

        System.out.println("Expected Shipment Customer After Adding: New Customer");
        System.out.println("Actual Shipment Customer After Adding: " + shipment.getCustomer().getName());
        System.out.println("Expected New Customer Shipment List Size: 1");
        System.out.println("Actual New Customer Shipment List Size: " + newCustomer.getShipments().size());

        assertEquals(newCustomer, shipment.getCustomer());
        assertTrue(newCustomer.getShipments().contains(shipment));

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }
}
