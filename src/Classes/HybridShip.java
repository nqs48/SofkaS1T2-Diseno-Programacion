package Classes;

import Interfaces.ISpaceCraftPassNames;

import java.util.ArrayList;

public class HybridShip extends AbstSpacecraft implements ISpaceCraftPassNames {

    private String type;
    private int passangers;
    private ArrayList<String> passangersNames;
    private int hypersleepChambers;

    public HybridShip(String name, String from, float weight, String type, int passengers, int hypersleepChambers) {
        super(name, from, weight);
        this.setType(type);
        this.setPassanggers(passengers);
        this.passangersNames= new ArrayList<>();
        this.setHypersleepChambers(hypersleepChambers);
    }

    @Override
    public void getInformation() {
        String description= "This category is the mixture of manned and unmanned ships, they are robust and efficient ships that can store food and also tools for repairs.";
        System.out.println("\nName: "+super.getName()+"\nFrom: "+super.getFrom()+"\nWeight: "+super.getWeight()+" kgs"+"\nType: "+this.spacecraftType()+"\nNo. Passengers: "+this.getPassengersNumber()+"\nName Passengers: "+this.getNamesPassengers()+"\nNo. HyperSleep Chambers: "+this.getHypersleepChambers()+"\nDescription: "+description);
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

    public void enableHypersleepChamber(boolean value){
        System.out.println("\nHypersleep-On: "+ value);
    }

    public void openFoodCompartment(){
        System.out.println("The system has open the food compartment!!");
    };


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

    public int getHypersleepChambers() {
        return hypersleepChambers;
    }

    public void setHypersleepChambers(int hypersleepChambers) {
        this.hypersleepChambers = hypersleepChambers;
    }
}
