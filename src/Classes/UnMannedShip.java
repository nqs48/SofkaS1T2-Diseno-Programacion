package Classes;

public class UnMannedShip extends AbstSpacecraft{

    private String type;
    private float speed;

    public UnMannedShip(String name, String from, float weight, String type, float speed) {
        super(name, from, weight);
        this.setType(type);
        this.setSpeed(speed);
    }

    @Override
    public void getInformation() {
        String description= "This category is the largest, despite the fact that the numerous artificial satellites that orbit our planet geostationarily, or not, are not included here.";
        System.out.println("\nName: "+super.getName()+"\nFrom: "+super.getFrom()+"\nWeight: "+super.getWeight()+" kgs"+"\nType: "+this.spacecraftType()+"\nSpeed: "+this.getSpeed()+ " km/h"+"\nDescription: "+description);
    }

    @Override
    public String spacecraftType() {
        return this.getType();
    }

    @Override
    public int getPassengersNumber() {
        return 0;
    }

    public void turnOnCamera(boolean value){
        System.out.println("\nCamera-On: "+ value);
    }

    public void takePhotos(){
        System.out.println("\nThe photos has been taked and saved !!");
    }


    // GETTERS AND SETTERS
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
