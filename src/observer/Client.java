package observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);
        ConcreteObserver concreteObserver1 = new ConcreteObserver(concreteSubject);
        ConcreteObserver concreteObserver2 = new ConcreteObserver(concreteSubject);
        concreteSubject.setLang("c++");

        concreteSubject.deleObserver(concreteObserver1);
        concreteSubject.setLang("java");
        ConcreteObserver concreteObserver3 = new ConcreteObserver(concreteSubject);


    }

}
