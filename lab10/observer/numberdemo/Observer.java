package lab10.observer.numberdemo;

public abstract class Observer {
    public Subject subject;
    public abstract void update();
}
