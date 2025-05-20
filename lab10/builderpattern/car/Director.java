package lab10.builderpattern.car;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine("A Engine")
                .setTripComputer(true)
                .setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset()
                .setSeats(5)
                .setEngine("B Engine")
                .setTripComputer(true)
                .setGPS(false);
    }
}
