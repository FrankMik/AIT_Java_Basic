package hw.bus;

public class Bus {
//    Create class Bus (bus) - with fields number of the route, capacity, speed on the route, length of the route.
//    Implement go, stop, speedUp, speedDown methods

    //fields of class Bus
    private String numberOfRoute;
    private int capacity;
    private double speed;
    private double route_length;

    // Methods

    // constructor

    public Bus(String route, int capacity, double speed, double route_length) {
        this.numberOfRoute = numberOfRoute;
        this.capacity = capacity;
        this.speed = speed;
        this.route_length = route_length;
    }

    // constructor capacity
    public Bus(int capacity) {
        this.capacity = capacity;
    }

    // constructor empty
    public Bus() {
    }
//   getter and setter

    public String getNumberOfRoute() {
        return numberOfRoute;
    }

    public void setNumberOfRoute(String numberOfRoute) {
        this.numberOfRoute = numberOfRoute;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getRoute_length() {
        return route_length;
    }

    public void setRoute_length(double route_length) {
        this.route_length = route_length;
    }

    //  to String

    @Override
    public String toString() {
        return "Bus: numberOfRoute " + numberOfRoute  + ", capacity=" + capacity;
    }

    public void go(double speed){
        this.speed = speed;
        System.out.println("The bus is going on the route " + numberOfRoute + ", speed = " + speed);
    }

    public void stop(){
        speed = 0;
        System.out.println("The bus stops, speed = " + speed);
    }

    public double speedUp(double inc) {
        return speed += inc;
    }

    public double speedDown(double dec) {
        return speed -= dec;
    }

    // Display
    public void displaySpeed() {
        speed = getSpeed();
        System.out.println("The speed of bus = " + speed);
    }

    public void displayBus() {
        speed = getSpeed();
        System.out.println("Route " + numberOfRoute + ", capacity " + capacity + ", current speed " + speed);
    }

}
