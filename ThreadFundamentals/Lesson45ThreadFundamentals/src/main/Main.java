package main;

public class Main {
    //starting point of the main thread
    public static void main(String[] args) {
        EvenNumbersThread t1 = new EvenNumbersThread();

        t1.start();
        System.out.println("END! " + Thread.currentThread().getName());



    }
}