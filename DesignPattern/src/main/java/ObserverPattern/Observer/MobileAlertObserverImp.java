package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImp implements NotificationAlertObserver {
    String userName;
    StockObservable observable;
    public MobileAlertObserverImp(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgToUser(userName, "product is in stock hurry up!");
    }

    public void sendMsgToUser(String userName, String msg) {
        System.out.println("msg sent to : " + userName);
    }
}
