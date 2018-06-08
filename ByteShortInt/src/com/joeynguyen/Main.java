package com.joeynguyen;

public class Main {

    public static void main(String[] args) {
        // int has width of 32
        int myMinVal = -2_147_483_648;
        int myMaxVal = 2_147_483_647;

        // byte and short takes up less memory than int so are more efficient
        // byte has width of 8
        byte myByteVal = 127;
        // by default, Java uses int when using an expression to assign a number
        // so we have to "cast" the value
        byte myNewByteVal = (byte) (myByteVal/2);

        // short has width of 16

        short myShortVal = -32768;

        // long requires an L or l at the end
        // long has width of 64
        long myLongVal = 9_223_372_036_854_775_807L;
    }
}
