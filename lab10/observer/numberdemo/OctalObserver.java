package lab10.observer.numberdemo;

public class OctalObserver extends Observer {
    public Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toOctalString(subject.getState()));
    }
}
