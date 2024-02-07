/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: Beverage.java
 * Description: This class defines the interface of Beverage
 */
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
     * Adds the additional cost of the condiments.
     *
     * @param additionalCost Cost of the condiments
   */

  void addAdditionalCost(double additionalCost);
}
