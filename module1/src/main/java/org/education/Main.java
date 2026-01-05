package org.education;

public class Main {
    public static void main(String[] args) {
        String result = getWishes();
        System.out.println(result);
    }

    public static String getWishes() {
        return Processor.addWishes();
    }
}