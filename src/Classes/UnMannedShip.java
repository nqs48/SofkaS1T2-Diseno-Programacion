package Classes;


/**
 * @author Nestor Quiroga
 * Class UnMannedShip for create a new type of spacecraft that extends of abstract class AbstSpacecraft
 */
public class UnMannedShip extends AbstSpacecraft{
    /**
     * UnMannedShip's type
     */
    private String type;

    /**
     * UnMannedShip's speed
     */
    private float speed;

    /**
     * Constructor of the class
     * @param name UnMannedShip's name
     * @param from UnMannedShip's origin
     * @param weight UnMannedShip's weight
     * @param type UnMannedShip's type
     * @param speed UnMannedShip's speed
     */
    public UnMannedShip(String name, String from, float weight, String type, float speed) {
        super(name, from, weight);
        this.setType(type);
        this.setSpeed(speed);
    }

    /**
     * Get the current UnMannedShip's information
     */
    @Override
    public void getInformation() {
        String description= "This category is the largest, despite the fact that the numerous artificial satellites that orbit our planet geostationarily, or not, are not included here.";
        System.out.println("\nName: "+super.getName()+"\nFrom: "+super.getFrom()+"\nWeight: "+super.getWeight()+" kgs"+"\nType: "+this.spacecraftType()+"\nSpeed: "+this.getSpeed()+ " km/h"+"\nDescription: "+description);
    }

    /**
     * Get the current UnMannedShip's type
     * @return returns the UnMannedShip's type, type string
     */
    @Override
    public String spacecraftType() {
        return this.getType();
    }

    /**
     * Get the current UnMannedShip's PassengersNumber
     * @return returns the UnMannedShip's PassengersNumber, type int
     */
    @Override
    public int getPassengersNumber() {
        return 0;
    }

    /**
     *  Set the new state for the camera
     * @param value Contains the new UnMannedShip's camera, type boolean
     */
    public void turnOnCamera(boolean value){
        System.out.println("\nCamera-On: "+ value);
    }

    /**
     * Feature Take photos
     */
    public void takePhotos(){
        System.out.println("\nThe photos has been taked and saved !!");
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

    /**
     * Get the current Spacecraft's speed
     * @return returns the Spacecraft's speed, type float
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Set the new Spacecraft's speed
     * @param speed Contains the new Spacecraft's speed, type string
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
