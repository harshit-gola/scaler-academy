package concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value value;

    Subtractor(Value value) {
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        synchronized (value) {
            for (int i = 0; i < 10000; i++) {
                value.setValue(value.getValue() - i);
            }
        }
        return null;
    }
}
