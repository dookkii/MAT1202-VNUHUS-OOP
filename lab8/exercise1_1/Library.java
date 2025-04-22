package lab8.exercise1_1;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        int maxIndex = 0;
        long maxTimeDifference = 0;

        for (int index = 0; index < rents.length; index++) {
            Rent rent = rents[index];
            long timeDifference = rent.getEnd().getTime() - rent.getBegin().getTime();

            if (timeDifference > maxTimeDifference) {
                maxIndex = index;
                maxTimeDifference = timeDifference;
            }
        }

        return rents[maxIndex];
    }
}
