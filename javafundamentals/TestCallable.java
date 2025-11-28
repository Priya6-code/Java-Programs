package javafundamentals;

import java.util.concurrent.Callable;

public class TestCallable {
    public static void main(String[] args) {
        Callable<String> task = () -> "Hello";

        // ❌ This line will NOT compile because Thread expects Runnable, not Callable
        Thread t = new Thread(); 
        t.start();
    }
}
