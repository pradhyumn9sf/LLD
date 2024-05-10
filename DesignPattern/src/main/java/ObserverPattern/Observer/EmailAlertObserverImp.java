package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImp implements NotificationAlertObserver {
    String emailId;
    StockObservable observable;
    public EmailAlertObserverImp(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up!");
    }

    public void sendEmail(String emailId, String msg) {
        System.out.println("mail sent to : " + emailId);
    }
}
