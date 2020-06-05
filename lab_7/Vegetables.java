package com.company.lab_7;

/** Class Vegetables creates object vegetable.
 * Class has getters, setters and constructor
 * and method that return information about vegetable.
 *
 */
public class Vegetables {

    /**
     * @param name
     * name of vegetable
     * @param weight
     * weight of vegetables
     * @param caloricity
     * caloricity of vegetables
     */
    private String name;
    private double weight;
    private double caloricity;

    /**
     * Constructor of Vegetable
     */
    public Vegetables (String inName, double inWeight, double inCaloricity) {
        setName(inName);
        setWeight(inWeight);
        setCaloricity(inCaloricity);
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return caloricity
     */
    public double getCaloricity() {
        return caloricity;
    }

    /**
     * @param name
     */
    public void  setName (String inName) {
        name = inName;
    }

    /**
     * @param weight
     */
    public void  setWeight (double inWeight) {
        weight = inWeight;
    }

    /**
     * @param caloricity
     */
    public void  setCaloricity (double inCaloricity) {
        caloricity = inCaloricity;
    }

    /**
     * @return information about vegetable in salad
     */
    public String getInformation() {
        return "Name:" + name + " Weight:" + String.valueOf(weight) +
                " Caloricity:" + String.valueOf(caloricity);
    }
}
