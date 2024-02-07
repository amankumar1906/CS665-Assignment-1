/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: Latte.java
 * Description: This class defines the behavior of an Latte coffee,
 * implementing the Beverage interface.
 */

package edu.bu.met.cs665.example1.coffee;

import edu.bu.met.cs665.example1.Beverage;

/**
 * Represents a Latte coffee.
 */
public class Latte implements Beverage {
  private double additionalCost = 0;

  @Override
  public String getDescription() {
    return "Latte";
  }

  @Override
  public double cost() {
    return 3.50 + additionalCost;
  }

  @Override
  public void addAdditionalCost(double additionalCost) {
    this.additionalCost += additionalCost;
  }
}
