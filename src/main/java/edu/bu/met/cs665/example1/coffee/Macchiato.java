package edu.bu.met.cs665.example1.coffee;

import edu.bu.met.cs665.example1.Beverage;

/**
 * Represents a Macchiato coffee.
 */
public class Macchiato implements Beverage {
  private double additionalCost = 0;

  @Override
  public String getDescription() {
    return "Macchiato";
  }

  @Override
  public double cost() {
    return 4.00 + additionalCost;
  }

  @Override
  public void addAdditionalCost(double additionalCost) {
    this.additionalCost += additionalCost;
  }
}
