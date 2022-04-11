package Classes;

import Interfaces.*;

/**
 * @author Nestor Quiroga
 * Abstarct Class AbstSpacecraft, that contains the methods and main attributes
 */
public abstract class AbstSpacecraft implements ISpaceCraftPassenger{

    /**
     * Spacecraft's name
     */
    private String name;

    /**
     * Spacecraft's origin
     */
    private String from;

    /**
     * Spacecraft's weight
     */
    private float weight;

    /**
     * Constructor of the abstract class
     * @param name Spacecraft's name
     * @param from Spacecraft's origin
     * @param weight Spacecraft's weight
     */
    public AbstSpacecraft(String name, String from, float weight) {
        this.setName(name);
        this.setFrom(from);
        this.setWeight(weight);
    }

    /**
     * Signature of the method that get the current Spacecraft's information
     */
    public abstract void getInformation();

    /**
     * Signature of the method that get the current Spacecraft's type
     * @return returns the Spacecraft's type, type string
     */
    public abstract String spacecraftType();

    /**
     * Method that turn on the Spacecraft's engine
     */
    public void turnOnEngine(){
        System.out.println("The system has been turn-on!!");
    };


    //Methods Get and Set

    /**
     * Get the current Spacecraft's name
     * @return returns the Spacecraft's name, type string
     */
    public String getName() {
        return name;
    }

    /**
     * Set the new Spacecraft's name
     * @param name Contains the new Spacecraft's name, type string
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the current Spacecraft's origin
     * @return returns the Spacecraft's origin, type string
     */
    public String getFrom() {
        return from;
    }

    /**
     * Set the new Spacecraft's origin
     * @param from Contains the new Spacecraft's origin, type string
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Get the current Spacecraft's weight
     * @return returns the Spacecraft's weight, type float
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Set the new Spacecraft's weight
     * @param weight Contains the new Spacecraft's weight, type float
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

}
