package edu.bu.met.cs665.example1.coffee;

import edu.bu.met.cs665.example1.Beverage;

/**
 * Represents an Americano coffee.
 */
public class Americano implements Beverage {
    private double additionalCost = 0;
    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public double cost() {
        return 2.50 + additionalCost;
    }

    @Override
    public void addAdditionalCost(double additionalCost) {
        this.additionalCost += additionalCost;
    }

}
