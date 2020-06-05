package com.company.lab_6;

/** Class Leaves creates object of Leaves.
 * Class Leaves extends class Vegetables.
 * Class has constructor and overriden method getInformation.
 *
 */
public class Leaves extends Vegetables {

    /**
     * @param type
     * type of vegetable - Leaves
     */
    private String type = "Leaves";

    /**
     * Constructor of Bulbs
     */
    public Leaves(String inName, double inWeight, double inCaloricity) {
        super(inName, inWeight, inCaloricity);
    }

    /**
     * @return information
     */
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}
