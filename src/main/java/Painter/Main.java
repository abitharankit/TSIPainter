package Painter;

import java.util.Scanner;

public class Main {
    public static float areaCalculator(float height, float width) {
        //Calculates rectangular area
        float area = height * width;
        return area;
    }

    public static void canCalculator(float area, String paintType) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much area can 1L of " + paintType + " cover in m^2?");
        float coverage = scan.nextFloat();
        float[] canSizes = {5f, 2.5f, 1f};
        for (float size : canSizes) {
            if (size != canSizes[canSizes.length - 1]) {
                float canCoverage = size * coverage;
                int canNumber = (int) Math.floor(area / canCoverage);
                System.out.println("You will need " + canNumber + " " + size + "L cams of " + paintType);
                area -= (canNumber * canCoverage);
            } else {
                float canCoverage = size * coverage;
                int canNumber = (int) Math.ceil(area / canCoverage);
                System.out.println("You will need " + canNumber + " " + size + "L cams of " + paintType);
            }

        }
    }
/*
    public static void userInput(String prompt, String type) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
    }
*/

    public static void main(String[] args) {
        float totalArea = 0f;
        float height = 0f;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many walls in the room?");
        int walls = scan.nextInt();
        // If walls are same height only asks for height once
        System.out.println("Are all the walls the same height? (Y/N)");
        String flat = scan.next();
        if (flat.toUpperCase().equals("Y")) {
            System.out.println("How tall is the room in m?");
            height = scan.nextFloat();

        }

        for (int i = 1; i <= walls; i++) {
            System.out.println("How wide is wall number " + i + " in m?");
            float width = scan.nextFloat();
            //Only asks if height hasn't been given before
            if (flat.toUpperCase().equals("N")) {
                System.out.println("How tall is wall number " + i + " in m?");
                height = scan.nextFloat();
            }
            totalArea += areaCalculator(height, width);
            System.out.println(height);
            System.out.println(width);
            System.out.println(areaCalculator(height, width));
        }

// Removes windows from the total area which needs to be painted

        System.out.println("Does the room have any windows? (Y/N)");
        String windows = scan.next();
        if (windows.toUpperCase().equals("Y")) {
            System.out.println("How many windows does the room have?");
            int numberWindows = scan.nextInt();
            for (int j = 1; j <= numberWindows; j++) {
                System.out.println("How tall is window number " + j + " in m?");
                float doorHeight = scan.nextFloat();
                System.out.println("How wide is window number " + j + " in m?");
                float doorWidth = scan.nextFloat();
                totalArea -= areaCalculator(doorHeight, doorWidth);
            }

        }
// Removes doors from the total area which need to be painted
        System.out.println("Does the room have any doors? (Y/N)");
        String doors = scan.next();
        if (doors.toUpperCase().equals("Y")) {
            System.out.println("How many doors does the room have?");
            int numberDoors = scan.nextInt();
            for (int j = 1; j <= numberDoors; j++) {
                System.out.println("How tall is door number " + j + " in m?");
                float doorHeight = scan.nextFloat();
                System.out.println("How wide is door number " + j + " in m?");
                float doorWidth = scan.nextFloat();
                totalArea -= areaCalculator(doorHeight, doorWidth);
            }
        }
        System.out.println(totalArea);
        System.out.println("Does the room need a coat of primer? (Y/N)");
        String primer = scan.next();
        if (primer.toUpperCase().equals("Y")) {
            canCalculator(totalArea, "primer");
        }
        System.out.println("How many coats of paint does the room need?");
        int coats = scan.nextInt();
        totalArea *= coats;
        canCalculator(totalArea, "paint");

    }
}
