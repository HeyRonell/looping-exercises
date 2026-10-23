package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException { // we add throws interruptedexception to initialize thread.sleep

        for (int counter = 10; counter > 0; counter--) {
            System.out.println(counter);
            Thread.sleep(1000); // this is to have the system slow down the process by one second * dramatic effect *
            }
        System.out.println("LAUNCH!");

        }
    }

