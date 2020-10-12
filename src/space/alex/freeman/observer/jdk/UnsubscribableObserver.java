package space.alex.freeman.observer.jdk;

import java.util.Observer;

public interface UnsubscribableObserver extends Observer {
    void unsubscribe();
}
