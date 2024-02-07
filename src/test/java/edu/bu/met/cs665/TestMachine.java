package edu.bu.met.cs665;

import static org.junit.Assert.*;
import edu.bu.met.cs665.example1.VendingMachine;
import org.junit.Test;

/**
 * This class contains test cases for different beverages in a vending machine.
 */
public class TestMachine {

    VendingMachine machine = new VendingMachine(); // Creating an instance of VendingMachine

    /**
     * Test case to check the cost of an Americano.
     */
    @Test
    public void testAmericanoCost() {
        double cost = machine.getBeverage("americano", 0, 0).cost();
        assertEquals(2.50, cost, 0.01); // Base cost only
    }

    /**
     * Test case to check the cost of an Espresso.
     */
    @Test
    public void testEspressoCost() {
        double cost = machine.getBeverage("espresso", 0, 0).cost();
        assertEquals(3.00, cost, 0.01); // Base cost only
    }

    /**
     * Test case to check the cost of Black Tea with Milk and Sugar.
     */
    @Test
    public void testBlackTeaCostWithMilkAndSugar() {
        double cost = machine.getBeverage("blacktea", 1, 1).cost();
        assertEquals(2.50, cost, 0.01);
    }

    /**
     * Test case to check the cost of Green Tea with Milk.
     */
    @Test
    public void testGreenTeaCostWithMilk() {
        double cost = machine.getBeverage("greentea", 2, 0).cost();
        assertEquals(3.50, cost, 0.01);
    }

    /**
     * Test case to check the cost of Yellow Tea with Sugar.
     */
    @Test
    public void testYellowTeaCostWithSugar() {
        double cost = machine.getBeverage("yellowtea", 0, 3).cost();
        assertEquals(4.50, cost, 0.01); // Base cost (3.00) + 3 * sugar (1.50)
    }
}
