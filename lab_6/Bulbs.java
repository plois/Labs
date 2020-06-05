package com.company.lab_6;

/** Class Bulbs creates object of Bulbs.
 * Class Bulbs extends class Vegetables.
 * Class has constructor and overriden method getInformation.
 *
 */
public class Bulbs extends Vegetables {

    /**
     * @param type
     * type of vegetable - Bulbs
     */
    private String type = "Bulbs";



    /**
     * Constructor of Bulbs
     */
    public Bulbs(String inName, double inWeight, double inCaloricity) {
        super(inName, inWeight, inCaloricity);
    }

    /**
     * @return information
     */
    @Override
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}
