package com.company.lab_6;

/** Class Salad creates array of vegetables.
 * Class has getter, setter, constructor and
 * method getCaloricitySalad that finds caloricity of salad,
 * method sortSaladWeight that sorts salad by weight of parts,
 * method searchElement that finds vegetables in salad,
 * that have caloricity in specified  range.
 *
 */
public class Salad {

    /**
     * @param salad
     * array of vegetables
     */
    private Vegetables[] salad;

    /**
     * Constructor of Salad
     */
    public Salad(Vegetables[] veg) {
        salad = new Vegetables[veg.length];
        setSalad(veg);
    }

    /**
     * Setter
     */
    public Vegetables[] setSalad(Vegetables[] veg) {
        for (int i = 0; i < veg.length; i++)
            salad[i] = veg[i];
        return salad;
    }

    /**
     * @return caloricity of salad
     */
    public double getCaloricitySalad() {
        double caloricitySalad = 0;
        for (int i = 0; i < salad.length; i++)
            caloricitySalad += salad[i].getWeight() *
                    salad[i].getCaloricity();
        return caloricitySalad;
    }

    /**
     * methode sorts salad by weight of ingridient by increase
     */
    public void sortSaladWeight() {
        for(int i = salad.length - 1; i >= 0; i--)
            for(int j = 0 ; j < i ; j++)
                if( salad[i].getWeight() > salad[j].getWeight()) {
                    Vegetables veg = salad[j];
                    salad[j] = salad[i];
                    salad[i] = veg;
                }
    }

    /**
     * @return array of elements that has weight in required range
     */
    public String[] searchElement(double limit1, double limit2) {
        String list[] = new String[salad.length];
        int counter = 0;
        for(int i = 0 ; i < salad.length ; i++)
            if( (salad[i].getCaloricity() >= limit1)
                    &&(salad[i].getCaloricity() <= limit2))
                list[counter++] = salad[i].getName();
        return list;
    }

    /**
     * Getter
     */
    public String getSalad() {
        String result = "";
        for (int i = 0; i < salad.length; i++)
            result = result + '\n' + salad[i].getInformation();
        return result;
    }
}
