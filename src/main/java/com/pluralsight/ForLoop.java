package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int count = 10; count > 0; count--) {
            System.out.println("Countdown: " + count);
            Thread.sleep(1000);
            if (count == 1) System.out.println("Launch!");
        }

    }
}
