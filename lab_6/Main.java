package com.company.lab_6;

/** Class Main was created to do 6 lab on Programming.
 * The task consists in determing hierarchy of vegetables,
 * making salad, counting caloricity of salad, sorting salad
 * for its parameter and search clear
 * vegetables in salad,
 * that have caloricity in specified  range.
 *N = 9311
 *C13 = N/13 = 3
 *Роботу зробив студент групи ІО-93, Євтушок Олег
 */
public class Main {
    public static void main(String[] args) {
        /* Input data about  vegetables	 */
        final int listLength = 7;
        Vegetables[] listVeg = new Vegetables [listLength];
        listVeg[0] = new Bulbs("onion", 10, 41.2);
        listVeg[1] = new Seeds("bean", 31.2, 73.4);
        listVeg[2] = new Tubers("potato", 51, 80.6);
        listVeg[3] = new Leaves("lettuce", 30, 17.8);
        listVeg[4] = new Leaves("cabbage", 71, 27.778);
        listVeg[5] = new Roots("carrot", 50.12, 37.5);
        listVeg[6] = new Roots("radish", 48.23, 21.38);

        /* Checking input */
        boolean flag = true;
        for (int i = 0; (i < listVeg.length)&&(flag); i++)
            for (int j = i+1; j < listVeg.length; j++)
                if ((listVeg[i] == null)||(listVeg[j] == null)
                        ||(listVeg[i].getName() == listVeg[j].getName()))
                    flag = false;

        /* Doing task if input data is true */
        if (flag == true) {
            Salad salad = new Salad(listVeg);
            salad.setSalad(listVeg);
            System.out.println(salad.getSalad());

            /* Calculation caloricity of salad*/
            double saladCaloricity = salad.getCaloricitySalad();
            System.out.println("\nCaloricity of salad:" + saladCaloricity);

            /* Sorting salad by weight of vegetables by increase*/
            System.out.println("\nResults of sorting" );
            salad.sortSaladWeight();
            System.out.println(salad.getSalad());

            /*Input range of caloricity and searching elements*/
            int minCaloricity = 10;
            int maxCaloricity = 71;
            System.out.println("\nVegetables from diapason " +
                    minCaloricity + " : " + maxCaloricity);
            String[] foundVeg =
                    salad.searchElement(minCaloricity,maxCaloricity);
            for (int i = 0; i < foundVeg.length; i++)
                if (foundVeg[i] != null)
                    System.out.println(foundVeg[i]);
        }
        else
            System.out.println("Error in input of data");
    }
}
