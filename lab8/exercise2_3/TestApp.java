package lab8.exercise2_3;

public class TestApp {
    public static void main(String[] args) {
        Poly ap = new ArrayPoly(new double[] {1, 3, 4, 8});
        Poly lp = new ListPoly(new double[] {1, 3, 4, 8});

        System.out.println("ap = " + ap);
        System.out.println("lp = " + lp);
        
        if (ap.equals(lp) && lp.equals(ap)) {
            System.out.println("ap == lp");
        } else {
            System.out.println("ap != lp");
        }

        ap = ap.derivative();
        System.out.println("ap' = " + ap);
        ap = ap.derivative();
        System.out.println("ap'' = " + ap);
        lp = lp.derivative();
        System.out.println("lp' = " + lp);
        lp = lp.derivative();
        System.out.println("lp'' = " + lp);
    }
}
