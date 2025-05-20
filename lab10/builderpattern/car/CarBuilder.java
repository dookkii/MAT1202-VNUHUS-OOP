package lab10.builderpattern.car;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int number) {
        car.setSeats(number);
        return this;
    }

    @Override
    public Builder setEngine(String type) {
        car.setEngine(type);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean enabled) {
        car.setTripComputer(enabled);
        return this;
    }

    @Override
    public Builder setGPS(boolean enabled) {
        car.setGPS(enabled);
        return this;
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}