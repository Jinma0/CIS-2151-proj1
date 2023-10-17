package proj1;

import java.util.Scanner;

public class HeartRateDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Patient's first name: ");
        String firstName = keyboard.nextLine();

        System.out.println("Patient's last name: ");
        String lastName = keyboard.nextLine();

        System.out.println("Patient's birth month: ");
        int birthMonth = Integer.parseInt(keyboard.nextLine());

        System.out.println("Patient's birth day: ");
        int birthDay = Integer.parseInt(keyboard.nextLine());

        System.out.println("Patient's birth year: ");
        int birthYear = Integer.parseInt(keyboard.nextLine());

        PersonHeartRate personHeartRate = new PersonHeartRate(firstName, lastName, birthMonth, birthDay, birthYear);
    }
}