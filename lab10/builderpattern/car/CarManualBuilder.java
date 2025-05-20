package lab10.builderpattern.car;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        this.manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(int number) {
        manual.addSection("Seats: " + number);
        return this;
    }

    @Override
    public Builder setEngine(String type) {
        manual.addSection("Engine: " + type);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean enabled) {
        manual.addSection("Trip Computer: " + enabled);
        return this;
    }

    @Override
    public Builder setGPS(boolean enabled) {
        manual.addSection("GPS: " + enabled);
        return this;
    }

    public Manual getProduct() {
        Manual result = this.manual;
        this.reset();
        return result;
    }
}
