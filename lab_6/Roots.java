package com.company.lab_6;

/** Class Roots creates object of Roots.
 * Class Roots extends class Vegetables.
 * Class has constructor and overriden method getInformation.
 *
 */
public class Roots extends Vegetables {

    /**
     * @param type
     * type of vegetable - Roots
     */
    private String type = "Roots";

    /**
     * Constructor of Roots
     */
    public Roots(String inName, double inWeight, double inCaloricity) {
        super(inName, inWeight, inCaloricity);
    }

    /**
     * @return information
     */
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}
