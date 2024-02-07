/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: GreenTea.java
 * Description: This class defines the behavior of a Green Tea,
 * implementing the Beverage interface.
 */

package edu.bu.met.cs665.example1.tea;

import edu.bu.met.cs665.example1.Beverage;

/**
 * Represents a Green Tea beverage.
 */
public class GreenTea implements Beverage {
  private double additionalCost = 0;

  @Override
  public String getDescription() {
    return "Green Tea";
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
