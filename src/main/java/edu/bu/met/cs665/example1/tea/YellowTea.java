/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: YellowTea.java
 * Description: This class defines the behavior of a Yellow Tea,
 * implementing the Beverage interface.
 */

package edu.bu.met.cs665.example1.tea;

import edu.bu.met.cs665.example1.Beverage;

/**
 * Represents a Yellow Tea beverage.
 */
public class YellowTea implements Beverage {
  private double additionalCost = 0;

  @Override
  public String getDescription() {
    return "Yellow Tea";
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
