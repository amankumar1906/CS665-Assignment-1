package edu.bu.met.cs665.example1.condiments;

/**
 * Represents milk as a condiment.
 **/
public class Milk {
  private final int units;

  /**
     * Constructs Milk with a specified number of units.
     * Maximum of 3 units is allowed.
     *
     * @param units Number of units of milk
   */
  public Milk(int units) {
    this.units = Math.min(units, 3); // ensures not more than 3 units
  }

  /**
     * Returns the number of milk units.
     *
     * @return Number of units
   */
  public int getUnits() {
    return units;
  }

  /**
     * Calculates the cost of the milk.
     *
     * @return Cost of milk
   */
  public double cost() {
    return 0.50 * units;
  }

  /**
     * Provides a description of the milk.
     *
     * @return Description string
   */
  public String getDescription() {
    return units + " unit(s) of milk";
  }
}
