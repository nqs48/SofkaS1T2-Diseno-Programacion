package Interfaces;

import java.util.ArrayList;

/**
 * @author Nestor Quiroga
 * Interface ISpaceCraftPassNames for create a new method to get and set the NamesPassengers
 */
public interface ISpaceCraftPassNames {

    /**
     * Signature of the method
     * @param name new value for set in to the arraylist of NamesPassengers
     */
    public void setNamesPassengers(String name);

    /**
     * Signature of the method
     * @return A list with all NamesPassengers
     */
    public ArrayList getNamesPassengers();
}
