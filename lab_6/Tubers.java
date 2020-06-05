package com.company.lab_6;

/** Class Tubers creates object of Tubers.
 * Class Tubers extends class Vegetables.
 * Class has constructor and overriden method getInformation.
 *
 */
public class Tubers extends Vegetables {

    /**
     * @param type
     * type of vegetable - Tubers
     */
    private String type = "Tubers";

    /**
     * Constructor of Seeds
     */
    public Tubers(String inName, double inWeight, double inCaloricity) {
        super(inName, inWeight, inCaloricity);
    }

    /**
     * @return information
     */
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}

