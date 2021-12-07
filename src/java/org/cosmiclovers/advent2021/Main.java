package org.cosmiclovers.advent2021;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        String className = args[0];

        try {
            Assignment a = (Assignment) Class.forName(className).getDeclaredConstructor().newInstance();
            System.out.format("%s instantiated, executing.%n", className);
            a.go(args);
        } catch (Exception e) {
            System.out.format("Could not load class %s, exiting.%n", className);
            e.printStackTrace();
        }

    }
}
