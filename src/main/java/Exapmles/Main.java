package Exapmles;

public class Main {
    public static void main(String[] args) {
        for (int i =1 ; i <=31; i++) {
            String weekday = "";
            switch (i % 7) {
                case 1:
                    weekday = "Monday";
                    break;
                case 2:
                    weekday = "Tuesday";
                    break;
                case 3:
                    weekday = "Wednesday";
                    break;
                case 4:
                    weekday = "Thursday";
                    break;
                case 5:
                    weekday = "Friday";
                    break;
                case 6:
                    weekday = "Saturday";
                    break;
                case 0:
                    weekday = "Sunday";
                    break;
            }
            System.out.println("Day " + i + ", " + weekday);
        }

        }
}