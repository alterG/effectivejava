package weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        Map<String, Object> weakMap = new WeakHashMap<>();
        String key1 = "key";
        System.out.println("--before add--");
        System.out.println(weakMap);
        System.out.println("--after add--");
        Object valueEx = new Object();
        weakMap.put(key1, valueEx);
        System.out.println(weakMap);
        System.out.println("--after remove key--");
        key1 = null;
        int j = 0;
        for (int i = 0; i < 10_000; i++) {
            j++;
        }
        System.out.println(weakMap);
    }
}
