package lab10.builderpattern.smarthome;

public class SmartHome {
    private String name;
    private int serialNumber;
    private String addressName;
    private String addressNumber;
    private String city;
    private String country;
    private String postalCode;
    private int light1PortNum;
    private int light2PortNum;
    private int door1PortNum;
    private int door2PortNum;
    private int microwavePortNum;
    private int tvPortNum;
    private int waterHeaterPortNum;

    private SmartHome() {

    }

    public static class SmartHomeBuilder {
        private String name;
        private int serialNumber;
        private String addressName;
        private String addressNumber;
        private String city;
        private String country;
        private String postalCode;
        private int light1PortNum;
        private int light2PortNum;
        private int door1PortNum;
        private int door2PortNum;
        private int microwavePortNum;
        private int tvPortNum;
        private int waterHeaterPortNum;

        public SmartHomeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public SmartHomeBuilder withSerialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public SmartHomeBuilder withAddressName(String addressName) {
            this.addressName = addressName;
            return this;
        }

        public SmartHomeBuilder withAddressNumber(String addressNumber) {
            this.addressNumber = addressNumber;
            return this;
        }

        public SmartHomeBuilder inCity(String city) {
            this.city = city;
            return this;
        }

        public SmartHomeBuilder inCountry(String country) {
            this.country = country;
            return this;
        }

        public SmartHomeBuilder withPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public SmartHomeBuilder withLight1PortNum(int light1PortNum) {
            this.light1PortNum = light1PortNum;
            return this;
        }

        public SmartHomeBuilder withLight2PortNum(int light2PortNum) {
            this.light2PortNum = light2PortNum;
            return this;
        }

        public SmartHomeBuilder withDoor1PortNum(int door1PortNum) {
            this.door1PortNum = door1PortNum;
            return this;
        }

        public SmartHomeBuilder withDoor2PortNum(int door2PortNum) {
            this.door2PortNum = door2PortNum;
            return this;
        }

        public SmartHomeBuilder withMicrowavePortNum(int microwavePortNum) {
            this.microwavePortNum = microwavePortNum;
            return this;
        }

        public SmartHomeBuilder withTVPortNum(int tvPortNum) {
            this.tvPortNum = tvPortNum;
            return this;
        }

        public SmartHomeBuilder withWaterHeaterPortNum(int waterHeaterPortNum) {
            this.waterHeaterPortNum = waterHeaterPortNum;
            return this;
        }

        public SmartHome build() {
            SmartHome smartHome = new SmartHome();

            smartHome.name = this.name;
            smartHome.serialNumber = this.serialNumber;
            smartHome.addressName = this.addressName;
            smartHome.addressNumber = this.addressNumber;
            smartHome.city = this.city;
            smartHome.country = this.country;
            smartHome.postalCode = this.postalCode;
            smartHome.light1PortNum = this.light1PortNum;
            smartHome.light2PortNum = this.light2PortNum;
            smartHome.door1PortNum = this.door1PortNum;
            smartHome.door2PortNum = this.door2PortNum;
            smartHome.microwavePortNum = this.microwavePortNum;
            smartHome.tvPortNum = this.tvPortNum;
            smartHome.waterHeaterPortNum = this.waterHeaterPortNum;

            return smartHome;
        }
    }

    @Override
    public String toString() {
        return "Smart Home System Info:\n"
                + name + "\n"
                + serialNumber + "\n"
                + addressName + "\n"
                + addressNumber + "\n"
                + city + "\n"
                + country + "\n"
                + postalCode + "\n"
                + light1PortNum + "\n"
                + light2PortNum + "\n"
                + door1PortNum + "\n"
                + door2PortNum + "\n"
                + microwavePortNum + "\n"
                + tvPortNum + "\n"
                + waterHeaterPortNum + "\n";
    }
}
