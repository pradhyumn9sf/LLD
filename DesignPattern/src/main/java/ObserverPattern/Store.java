package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImp;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImp;
import ObserverPattern.Observer.MobileAlertObserverImp;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImp();

        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserverImp("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserverImp("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver notificationAlertObserver3 = new MobileAlertObserverImp("abc_user", iphoneStockObservable);

        iphoneStockObservable.add(notificationAlertObserver1);
        iphoneStockObservable.add(notificationAlertObserver2);
        iphoneStockObservable.add(notificationAlertObserver3);

        iphoneStockObservable.setStockCount(10);

    }
}
