package lab10.observer.numberdemo;

public class HexaObserver extends Observer {
    public Subject subject;

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toHexString(subject.getState()));
    }
}
