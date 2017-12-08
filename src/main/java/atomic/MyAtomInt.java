package atomic;

import lombok.Getter;

@Getter
public class MyAtomInt {

    int value;

    private final boolean compareAndSet(int expected, int value) {
        if (value == expected) {
            this.value = value;
            return true;
        }
        return false;
    }

    public final int incAndGet() {
        while (true) {
            int current = value;
            int next = current + 1;
            if (compareAndSet(current, next)) {
                return value;
            }
        }
    }

    public final int getAndInc() {
        while (true) {
            int current = value;
            int next = current + 1;
            if (compareAndSet(current, next)) {
                return current;
            }
        }
    }
}
