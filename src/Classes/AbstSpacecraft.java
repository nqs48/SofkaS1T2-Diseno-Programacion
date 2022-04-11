package Classes;

import Interfaces.*;

public abstract class AbstSpacecraft implements ISpaceCraftPassenger{

    private String name;
    private String from;
    private float weight;


    public AbstSpacecraft(String name, String from, float weight) {
        this.setName(name);
        this.setFrom(from);
        this.setWeight(weight);
    }


    public abstract void getInformation();

    public abstract String spacecraftType();

    public void turnOnEngine(){
        System.out.println("The system has been turn-on!!");
    };


    //SETTERS AND GETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
