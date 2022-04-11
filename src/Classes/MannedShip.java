package Classes;

import Interfaces.ISpaceCraftPassNames;

import java.util.ArrayList;

/**
 * @author Nestor Quiroga
 * Class MannedShip for create a new type of spacecraft that extends of abstract class AbstSpacecraft and implemets interface ISpaceCraftPassNames
 */
public class MannedShip extends AbstSpacecraft implements ISpaceCraftPassNames {
    /**
     * MannedShip's type
     */
    private String type;

    /**
     * MannedShip's passengers
     */
    private int passangers;

    /**
     * MannedShip's list name passengers
     */
    private ArrayList<String> passangersNames;

    /**
     * Constructor of the class
     * @param name MannedShip's name
     * @param from MannedShip's origin
     * @param weight MannedShip's weight
     * @param type MannedShip's type
     * @param passengers MannedShip's passengers
     */
    public MannedShip(String name, String from, float weight, String type, int passengers) {
        super(name, from, weight);
        this.setType(type);
        this.setPassanggers(passengers);
        this.passangersNames= new ArrayList<>();
    }

    /**
     * Get the current MannedShip's information
     */
    @Override
    public void getInformation() {
        String description= "its purpose is to send human beings into space for repair, maintenance or research tasks, in missions that require the skill and decision-making of people, to the detriment of machines.";
        System.out.println("\nName: "+super.getName()+"\nFrom: "+super.getFrom()+"\nWeight: "+super.getWeight()+" kgs"+"\nType: "+this.spacecraftType()+"\nNo. Passengers: "+this.getPassengersNumber()+"\nName Passengers: "+this.getNamesPassengers()+"\nDescription: "+description);
    }

    /**
     * Get the current MannedShip's type
     * @return returns the MannedShip's type, type string
     */
    @Override
    public String spacecraftType() {
        return this.getType();
    }

    /**
     * Get the current MannedShip's PassengersNumber
     * @return returns the MannedShip's PassengersNumber, type int
     */
    @Override
    public int getPassengersNumber() {
        return getPassanggers();
    }

    /**
     * Set MannedShip's PassengersNumber
     * @param name new value for set in to the arraylist of NamesPassengers
     */
    @Override
    public void setNamesPassengers(String name) {
        this.passangersNames.add(name);

    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList getNamesPassengers() {
        return this.passangersNames;
    }

    /**
     *
     * @param value
     */
    public void activateSpeakers(boolean value){
        System.out.println("\nSpeakers-On: "+ value);
    }


    //SETTERS AND GETTERS
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getPassanggers() {
        return passangers;
    }

    public void setPassanggers(int passangers) {
        this.passangers = passangers;
    }



}
