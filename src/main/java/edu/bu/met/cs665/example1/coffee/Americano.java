/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: Americano.java
 * Description: This class defines the behavior of an Americano coffee,
 * implementing the Beverage interface.
 */

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
