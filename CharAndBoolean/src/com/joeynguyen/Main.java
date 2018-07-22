package com.joeynguyen;

public class Main {

    public static void main(String[] args) {
        // char has a width of 16 (2 bytes)
	    char myChar = '\u00A9';
	    System.out.println("Unicode output: " + myChar);

	    char registeredSymbol = '\u00AE';
	    System.out.println("registeredSymbol: " + registeredSymbol);

	    boolean myBool = true;
		System.out.println("myBool: " + myBool);
    }
}
