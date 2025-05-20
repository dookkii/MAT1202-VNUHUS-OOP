package lab10.observer.numberdemo;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("State changed into: 15");
        subject.setState(15);

        System.out.println();
        System.out.println("State changed into: 10");
        subject.setState(10);

        System.out.println();
        System.out.println("State changed into: 10");
        subject.setState(1234);
    }
}
