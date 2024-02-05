/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.example1.VendingMachine;

public class Main {
  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine();
    vendingMachine.getBeverage("Espresso", 2, 1);
  }
}


