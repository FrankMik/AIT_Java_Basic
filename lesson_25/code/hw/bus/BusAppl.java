package hw.bus;

public class BusAppl {
    public static void main(String[] args) {

        Bus bus = new Bus( 56);
        System.out.println(bus);

        bus.setNumberOfRoute("137");

        bus.displayBus();

        bus.go(50.0);
        bus.displayBus();
        bus.displaySpeed();

        bus.speedUp(10.0);
        bus.displaySpeed();
        bus.speedDown(20.0);
        bus.displaySpeed();

        bus.displayBus();
        bus.stop();
        bus.displaySpeed();

    }
}
