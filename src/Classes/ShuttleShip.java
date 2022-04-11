package Classes;

/**
 * @author Nestor Quiroga
 * Class ShuttleShip for create a new type of spacecraft that extends of abstract class AbstSpacecraft
 */
public class ShuttleShip extends AbstSpacecraft {

    /**
     * UnMannedShip's type
     */
    private String type;

    /**
     *
     * @param name ShuttleShip's name
     * @param from ShuttleShip's origin
     * @param weight ShuttleShip's weight
     * @param type ShuttleShip's type
     */
    public ShuttleShip(String name, String from, float weight, String type) {
        super(name, from, weight);
        this.setType(type);
    }

    /**
     * Method overrided, Get the current ShuttleShip's information
     */
    @Override
    public void getInformation() {
        String description= "As its name suggests, it is a self-propelled rocket that is used to launch a payload into space.";
        System.out.println("\nName: "+super.getName()+"\nFrom: "+super.getFrom()+"\nWeight: "+super.getWeight()+" kgs"+"\nType: "+this.spacecraftType()+"\nDescription: "+description);
    }

    /**
     * Method overrided, Get the current spacecraft's type
     * @return returns the spacecraft's type, type string
     */
    @Override
    public String spacecraftType() {
        return this.getType();
    }

    /**
     * Method overrided, Get the current ShuttleShip PassengersNumber
     * @return returns the ShuttleShip PassengersNumber, type int
     */
    @Override
    public int getPassengersNumber() {
        return 0;
    }

    /**
     * Confirmation of throwLoad
     * @return returns the confirmation of throwLoad, type string
     */
    public String throwLoad(){
        return "The load has been dropped!!";
    }

//Methods Get and Set

    /**
     * Get the current Spacecraft's type
     * @return returns the Spacecraft's type, type string
     */
    public String getType() {
        return type;
    }

    /**
     * Set the new Spacecraft's type
     * @param type Contains the new Spacecraft's type, type string
     */
    public void setType(String type) {
        this.type = type;
    }
}
