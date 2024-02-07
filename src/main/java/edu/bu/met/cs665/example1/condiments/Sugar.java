/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/07/2024
 * File Name: Sugar.java
 * Description: This class defines the behavior of Sugar
 */

package edu.bu.met.cs665.example1.condiments;

/**
   * Represents sugar as a condiment.
 **/
public class Sugar {
  private final int units;

  /**
     * Constructs Sugar with a specified number of units.
     * Maximum of 3 units is allowed.
     *
     * @param units Number of units of sugar
   */
  public Sugar(int units) {
    this.units = Math.min(units, 3);
  }

  /**
     * Returns the number of sugar units.
     *
     * @return Number of units
   */
  public int getUnits() {
    return units;
  }

  /**
     * Calculates the cost of the sugar.
     *
     * @return Cost of sugar
   */
  public double cost() {
    return 0.50 * units;
  }

  /**
     * Provides a description of the sugar.
     *
     * @return Description string
  */
  public String getDescription() {
    return units + " unit(s) of sugar";
  }
}
