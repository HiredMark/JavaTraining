package com.thesoftwareinstitute;

import java.util.Date;

public class Main { // Classes are named using Pascal naming convention SoLikeThis

    public static void main(String[] args) { // methods are named using camel case soLikeThis
        // primitive types - all use unique memory locations automatically
        byte myAge = 30; // small number up to 128
        long viewsCount = 3_123_456_789L; // L denotes that this variable is a long otherwise it will default to int
        float price = 10.99F; // fractional items default to double F makes it a float.
        char letter = 'A';
        boolean isEligible = false;
        byte herAge = myAge;// populate one memory location with the value of another. The two aren't bound.

        //reference types - need to allocate memory

        Date now = new Date();
        System.out.println(now);
    }
}
