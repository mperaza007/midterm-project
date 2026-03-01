/**
 * Class that creates a car with a specific make, model, and year,
 * and with miles set to 0 and isStarted set to false
 */
package myGroup;

public class Car{

    private String make;
    private String model;
    private int year;
    private int miles;
    private boolean isStarted;


    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = 0;
        this.isStarted = false;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMiles() {
        return miles;
    }

    public boolean getIsStarted(){
        return isStarted;
    }

    /**
     * Adds miles to the car
     *
     * @param milesDriven the miles that are going to be added
     */
    public void drive(int milesDriven){
        this.miles += milesDriven;
        System.out.println("The car has driven " + this.miles + " miles so far.");
    }

    /**
     * Changes the isStarted variable to true
     */
    public void start(){
        this.isStarted = true;
    }

}