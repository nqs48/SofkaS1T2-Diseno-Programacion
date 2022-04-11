package Classes;

public class ShuttleShip extends AbstSpacecraft {

    private String type;

    public ShuttleShip(String name, String from, float weight, String type) {
        super(name, from, weight);
        this.setType(type);
    }

    @Override
    public void getInformation() {
        String description= "As its name suggests, it is a self-propelled rocket that is used to launch a payload into space.";
        System.out.println("\nName: "+super.getName()+"\nFrom: "+super.getFrom()+"\nWeight: "+super.getWeight()+" kgs"+"\nType: "+this.spacecraftType()+"\nDescription: "+description);
    }

    @Override
    public String spacecraftType() {
        return this.getType();
    }

    @Override
    public int getPassengersNumber() {
        return 0;
    }

    public String throwLoad(){
        return "The load has been dropped!!";
    }


    //SETTERS AND GETTERS
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
