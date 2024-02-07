/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: BlackTea.java
 * Description: This class defines the behavior of a Black Tea,
 * implementing the Beverage interface.
 */

package edu.bu.met.cs665.example1.tea;

import edu.bu.met.cs665.example1.Beverage;

/**
 * Represents a Black Tea beverage.
 */
public class BlackTea implements Beverage {
  private double additionalCost = 0;


  @Override
  public String getDescription() {
    return "Black Tea";
  }

  @Override
  public double cost() {
    return 1.50 + additionalCost;
  }

  @Override
  public void addAdditionalCost(double additionalCost) {
    this.additionalCost += additionalCost;
  }
}
