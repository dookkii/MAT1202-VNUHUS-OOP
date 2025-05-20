package lab10.builderpattern.car;

public interface Builder {
    Builder reset();
    Builder setSeats(int number);
    Builder setEngine(String type);
    Builder setTripComputer(boolean enabled);
    Builder setGPS(boolean enabled);
}
