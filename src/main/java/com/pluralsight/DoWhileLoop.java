package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 1;

        // This will initially print out the line
        do {
            System.out.println("I love Java");
            counter ++;
        } while (counter <=5); { // after, this will re-evaluate the variable and print if the condition is still true.
            System.out.println("I love Java");
            counter ++;
        }
    }
}
