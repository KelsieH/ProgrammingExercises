import java.util.Scanner;

public class JetLag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your departure time:");
        double depart = scan.nextInt();
        System.out.println("Enter your arrival time:");
        double arrival = scan.nextInt();
        System.out.println("Enter the zones crossed:");
        double zones = scan.nextInt();
        System.out.println("Enter the number of hours traveled:");
        double hours = scan.nextInt();

        double departdays = 0;
        double arrivedays = 0;

        if (depart >= 8 && depart < 18) {
            departdays = 0;
        } else if (depart >= 12 && depart < 18) {
            departdays = 1;
        } else if (depart >= 18 && depart < 22) {
            departdays = 3;
        } else if (depart >= 22 && depart < 24) {
            departdays = 4;
        } else if (depart < 1) {
            departdays = 4;
        } else if (depart >= 1 && depart < 8) {
            departdays = 5;
        }

        if (arrival >= 8 && arrival < 12) {
            arrivedays = 4;
        } if (arrival >= 12 && arrival < 18) {
            arrivedays = 2;
        } else if (arrival >= 18 && arrival< 22) {
            arrivedays = 0;
        } else if (arrival >= 22 && arrival < 24) {
            arrivedays = 1;
        } else if (arrival < 1) {
            arrivedays = 1;
        } else if (arrival >= 1 && arrival < 8) {
            arrivedays = 3;
        }
        double days = (hours/2 + (zones-3) + departdays + arrivedays)/10;
        System.out.println("You need " + days + " days of rest.");
    }
}