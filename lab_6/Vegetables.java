package com.company.lab_6;

/** Class Vegetables creates object vegetable.
 * Class has getter, setter, constructor and
 * method getCaloricitySalad that finds caloricity of salad,
 * method sortSaladWeight that sorts salad by weight of parts,
 * method searchElement that finds vegetables in salad,
 * that have caloricity in specified  range.
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
