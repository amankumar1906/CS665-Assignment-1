package edu.bu.met.cs665.example1;

/**
 * Interface for beverages in the vending machine.
 */
public interface Beverage {

    /**
     * Returns a description of the beverage.
     *
     * @return Description string.
     */
    String getDescription();

    /**
     * Calculates the cost of the beverage.
     *
     * @return Cost as a double.
     */
    double cost();

    /**
     * Adds the additional cost of the condiments
     * @param additionalCost Cost of the condiments
     */

    void addAdditionalCost(double additionalCost);
}
