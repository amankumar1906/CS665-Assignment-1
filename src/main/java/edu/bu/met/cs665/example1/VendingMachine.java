package edu.bu.met.cs665.example1;

import edu.bu.met.cs665.example1.coffee.Americano;
import edu.bu.met.cs665.example1.coffee.Espresso;
import edu.bu.met.cs665.example1.coffee.Latte;
import edu.bu.met.cs665.example1.coffee.Macchiato;
import edu.bu.met.cs665.example1.condiments.Milk;
import edu.bu.met.cs665.example1.condiments.Sugar;
import edu.bu.met.cs665.example1.tea.GreenTea;
import edu.bu.met.cs665.example1.tea.BlackTea;
import edu.bu.met.cs665.example1.tea.YellowTea;

/**
 * Represents a vending machine for various beverages.
 */
public class VendingMachine {

    /**
     * Prepares a beverage with optional milk and sugar.
     *
     * @param type       Type of beverage.
     * @param milkUnits  Units of milk to add.
     * @param sugarUnits Units of sugar to add.
     */
    public Beverage getBeverage(String type, int milkUnits, int sugarUnits) {
        Beverage beverage;

        switch (type.toLowerCase()) {
            case "americano":
                beverage = new Americano();
                break;
            case "espresso":
                beverage = new Espresso();
                break;
            case "latte":
                beverage = new Latte();
                break;
            case "macchiato":
                beverage = new Macchiato();
                break;
            case "blacktea":
                beverage = new BlackTea();
                break;
            case "greentea":
                beverage = new GreenTea();
                break;
            case "yellowtea":
                beverage = new YellowTea();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Beverage type");
        }

        double additionalCost = new Milk(milkUnits).cost() + new Sugar(sugarUnits).cost();
        beverage.addAdditionalCost(additionalCost); // Add the additional cost to the beverage
        return beverage;
    }
}
