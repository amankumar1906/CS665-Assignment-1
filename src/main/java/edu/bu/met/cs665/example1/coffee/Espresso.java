/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: Espresso.java
 * Description: This class defines the behavior of an Espresso coffee,
 * implementing the Beverage interface.
 */

package edu.bu.met.cs665.example1.coffee;

import edu.bu.met.cs665.example1.Beverage;

/**
 * Represents an Espresso coffee.
 */
public class Espresso implements Beverage {
  private double additionalCost = 0;

  @Override
  public String getDescription() {
    return "Espresso";
  }

  @Override
  public double cost() {
    return 3.00 + additionalCost;
  }

  @Override
  public void addAdditionalCost(double additionalCost) {
    this.additionalCost += additionalCost;
  }
}
