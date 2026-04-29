/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package supplychaintrackingsystem;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author M-ABEER
 */
public class OrderTest {
    
@Test
    public void testSetProductsSuccessfully() {
        System.out.println("Testing Order.setProducts(): Set valid product list");

        Order order = new Order();

        Product product1 = new Product();
        product1.setProductName("Milk");
        product1.setUnitPrice(50.0);
        product1.setStatus("Available");

        Product product2 = new Product();
        product2.setProductName("Cheese");
        product2.setUnitPrice(80.0);
        product2.setStatus("Available");

        List<Product> products = Arrays.asList(product1, product2);

        order.setProducts(products);

        System.out.println("Product 1: " + product1.getProductName() + ", Price: " + product1.getUnitPrice());
        System.out.println("Product 2: " + product2.getProductName() + ", Price: " + product2.getUnitPrice());
        System.out.println("Expected Number of Products: 2");
        System.out.println("Actual Number of Products: " + order.getProducts().size());
        System.out.println("Expected Total Amount: 130.0");
        System.out.println("Actual Total Amount: " + order.getTotalAmount());

        assertEquals(2, order.getProducts().size());
        assertTrue(order.getProducts().contains(product1));
        assertTrue(order.getProducts().contains(product2));
        assertEquals(130.0, order.getTotalAmount(), 0.001);

        System.out.println("Result: Test passed successfully.");
        System.out.println("----------------------------------------");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProductsWithNullListThrowsException() {
        System.out.println("Testing Order.setProducts(): Null product list should throw exception");

        Order order = new Order();

        System.out.println("Input Product List: null");
        System.out.println("Expected Result: IllegalArgumentException should be thrown");

        order.setProducts(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProductsWithEmptyListThrowsException() {
        System.out.println("Testing Order.setProducts(): Empty product list should throw exception");

        Order order = new Order();

        System.out.println("Input Product List Size: 0");
        System.out.println("Expected Result: IllegalArgumentException should be thrown");

        order.setProducts(new ArrayList<Product>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProductsWithNullProductThrowsException() {
        System.out.println("Testing Order.setProducts(): Product list containing null should throw exception");

        Order order = new Order();

        Product product1 = new Product();
        product1.setProductName("Milk");
        product1.setUnitPrice(50.0);
        product1.setStatus("Available");

        List<Product> products = Arrays.asList(product1, null);

        System.out.println("Product List Contains: Product object + null");
        System.out.println("Expected Result: IllegalArgumentException should be thrown");

        order.setProducts(products);
    }

    @Test(expected = IllegalStateException.class)
    public void testSetProductsWithUnavailableProductThrowsException() {
        System.out.println("Testing Order.setProducts(): Unavailable product should throw exception");

        Order order = new Order();

        Product product1 = new Product();
        product1.setProductName("Milk");
        product1.setUnitPrice(50.0);
        product1.setStatus("Available");

        Product product2 = new Product();
        product2.setProductName("Cheese");
        product2.setUnitPrice(80.0);
        product2.setStatus("OUT_OF_STOCK");

        List<Product> products = Arrays.asList(product1, product2);

        System.out.println("Product 1 Status: " + product1.getStatus());
        System.out.println("Product 2 Status: " + product2.getStatus());
        System.out.println("Expected Result: IllegalStateException should be thrown");

        order.setProducts(products);
    }

    @Test(expected = IllegalStateException.class)
    public void testSetProductsWhenOrderStatusCannotBeModifiedThrowsException() {
        System.out.println("Testing Order.setProducts(): Products cannot be modified when status is Processing");

        Order order = new Order();

        Product product1 = new Product();
        product1.setProductName("Milk");
        product1.setUnitPrice(50.0);
        product1.setStatus("Available");

        order.setStatus("Processing");

        List<Product> products = Arrays.asList(product1);

        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Expected Modifiable Status: Pending or Confirmed");
        System.out.println("Expected Result: IllegalStateException should be thrown");

        order.setProducts(products);
    }
}