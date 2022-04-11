package Classes;

import Interfaces.ISpaceCraftPassNames;

import java.util.ArrayList;

public class MannedShip extends AbstSpacecraft implements ISpaceCraftPassNames {
    private String type;
    private int passangers;
    private ArrayList<String> passangersNames;

    public MannedShip(String name, String from, float weight, String type, int passengers) {
        super(name, from, weight);
        this.setType(type);
        this.setPassanggers(passengers);
        this.passangersNames= new ArrayList<>();
    }

    @Override
    public void getInformation() {
        String description= "its purpose is to send human beings into space for repair, maintenance or research tasks, in missions that require the skill and decision-making of people, to the detriment of machines.";
        System.out.println("\nName: "+super.getName()+"\nFrom: "+super.getFrom()+"\nWeight: "+super.getWeight()+" kgs"+"\nType: "+this.spacecraftType()+"\nNo. Passengers: "+this.getPassengersNumber()+"\nName Passengers: "+this.getNamesPassengers()+"\nDescription: "+description);
    }

    @Override
    public String spacecraftType() {
        return this.getType();
    }

    @Override
    public int getPassengersNumber() {
        return getPassanggers();
    }

    @Override
    public void setNamesPassengers(String name) {
        this.passangersNames.add(name);

    }

    @Override
    public ArrayList getNamesPassengers() {
        return this.passangersNames;
    }

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
