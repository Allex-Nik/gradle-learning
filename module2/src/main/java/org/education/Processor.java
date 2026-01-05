package org.education;

public class Processor {
    public static String addWishes() {
        String congrats = DataProvider.data();
        return congrats + " Wishing you all the best!";
    }
}