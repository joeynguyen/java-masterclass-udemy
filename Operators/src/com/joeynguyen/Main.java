package com.joeynguyen;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 95;
        if (topScore > 90)
            System.out.println("You got the top score!");

        int secondTopScore = 80;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score but less than 100");

        double myFirstValue = 20d;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal: " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("theRemainder " + theRemainder);

        if (theRemainder <= 20)
            System.out.println("The total is over the limit");

    }
}
