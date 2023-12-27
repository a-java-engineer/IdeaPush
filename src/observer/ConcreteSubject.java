package observer;

public class ConcreteSubject implements Subject {
    private String lang;

    public ConcreteSubject() {
        this.lang = lang;
    }
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
        //修改具体主题的内部状态时,给所有注册过的观察者发送通知
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        System.out.println("观察者添加了");
        observers.add(observer);
    }

    @Override
    public void deleObserver(Observer observer) {
        System.out.println("观察者删除了");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            //通知更新
            observer.update();
        }
    }


}
