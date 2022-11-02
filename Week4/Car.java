package Week4;

public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour
    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
    }

    /* Code for overloaded constructor goes here */

    public Car(String licensePlate1, double maxSpeed1, double speed1){
        this.licensePlate = licensePlate1;
        if (speed1<0.0){
            this.speed = 0;
        }
        if(speed1>maxSpeed1){
            speed = maxSpeed1;
        }
    }

    public void print(){
        System.out.printf("Current Speed: %s\nMaximum Speed: %s\nLicence Plate: %s", this.speed, this.maxSpeed,
                this.licensePlate);
    }

}
