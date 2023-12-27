package observer;

public class ConcreteObserver implements Observer{
    //具体主题的状态纳入到具体的观察者对象中,就是引用具体主题的对象
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("State updated:" + subject.getLang());
    }
}
