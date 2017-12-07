package atomic;

public class MyAtomInt {

    int value;

    private final boolean compareAndSet(int expected, int value) {
        if (value == expected) {
            this.value = value;
            return true;
        }
        return false;
    }

    private final int incAndGet() {
        while (true) {
            int current = value;
            int next = current + 1;
            if (compareAndSet(current, next)) {
                return value;
            }
        }
    }

    private final int getAndInc() {
        while (true) {
            int current = value;
            int next = current + 1;
            if (compareAndSet(current, next)) {
                return current;
            }
        }
    }
}
