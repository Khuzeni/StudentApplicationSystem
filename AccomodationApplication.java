package domain;

public class AccomodationApplication {
    private String optionId;
    private String name;
    private String location;
    private double monthlyCost;
    private boolean availability;
    private int capacity;

    //CONSTRUCTOR WITH ARGUMENT//
private AccomodationApplication(Builder builder) {
    this.optionId = builder.optionId;
    this.name = builder.name;
    this.location = builder.location;
    this.monthlyCost = builder.monthlyCost;
    this.availability = builder.availability;
    this.capacity = builder.capacity;

}
    //GET ALL THE GETTERS//
    public String getOptionId() {return optionId;}
    public String getName() {return name;}
    public String getLocation() {return location;}
    public double getMonthlyCost() {return monthlyCost;}
    public boolean isAvailability() {return availability;}
    public int getCapacity() {return capacity;}

    //LET'S GET BUILDING//
    public static class Builder {
    private String optionId;
    private String name;
    private String location;
    private double monthlyCost;
    private boolean availability;
    private int capacity;

    //SET ALL THE SETTERS//
    public Builder setOptionId(String optionId) {this.optionId = optionId;return this;}
        public Builder setName(String name) {this.name=name;return this;}
        public Builder setLocation(String location) {this.location=location;return this;}
        public Builder setMonthlyCost(double monthlyCost) {this.monthlyCost = monthlyCost;return this;}
        public Builder setAvailability(boolean availability) {this.availability = availability;return this;}
        public Builder setCapacity(int capacity) {this.capacity = capacity;return this;}

    //EXECUTE THE BUILD
        public AccomodationApplication build() {return new AccomodationApplication(this);}
    }
}
