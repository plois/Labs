package com.company.lab_7;

import com.company.lab_7.Vegetables;

/** Class ListElement creates object vegetable.
 * Class has getters, setters and constructor
 * and method that return information about vegetable.
 *
 */
public class ListElement {

    /**
     * @param previous
     * previous element
     * @param next
     * next element
     * @param data
     * field of object Vegetables
     */
    private ListElement previous;
    private ListElement next;
    private Vegetables data;

    /**
     * Constructor of ListElement
     */
    public ListElement(Vegetables inData){
        setData(inData);
        setNext(null);
        setPrevious(null);
    }

    /**
     * @return data
     */
    public Vegetables getData() {
        return data;
    }

    /**
     * @param data
     */
    public void setData(Vegetables inData) {
        data = inData;
    }

    /**
     * @return next element
     */
    public ListElement getNext() {
        return next;
    }

    /**
     * @param next
     */
    public void setNext(ListElement inNext) {
        next = inNext;
    }

    /**
     * @return previous element
     */
    public ListElement getPrevious() {
        return previous;
    }

    /**
     * @param previous
     */
    public void setPrevious(ListElement inPrevious) {
        previous = inPrevious;
    }
}
