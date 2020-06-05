package com.company.lab_6;

/** Class Seeds creates object of Seeds.
 * Class Seeds extends class Vegetables.
 * Class has constructor and overriden method getInformation.
 *
 */
public class Seeds extends Vegetables {

    /**
     * @param type
     * type of vegetable - Seeds
     */
    private String type = "Seeds";

    /**
     * Constructor of Seeds
     */
    public Seeds(String inName, double inWeight, double inCaloricity) {
        super(inName, inWeight, inCaloricity);
    }

    /**
     * @return information
     */
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}
