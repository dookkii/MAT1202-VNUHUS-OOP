package lab9_designpatterns.adapter.peg;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0);
        this.peg = peg;
    }

    public int getRadius() {
        return (int) Math.round(peg.getWidth() * Math.sqrt(2) / 2);
    }
}
