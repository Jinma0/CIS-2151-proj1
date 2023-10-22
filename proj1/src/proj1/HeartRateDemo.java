package proj1;

import java.util.ArrayList;
import java.util.Scanner;

public class HeartRateDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Patient's first name: ");
        String firstName = keyboard.nextLine();

        System.out.println("Patient's last name: ");
        String lastName = keyboard.nextLine();

        System.out.println("Patient's birth month (MM): ");
        int birthMonth = Integer.parseInt(keyboard.nextLine());

        System.out.println("Patient's birth day (DD): ");
        int birthDay = Integer.parseInt(keyboard.nextLine());

        System.out.println("Patient's birth year (YYYY): ");
        int birthYear = Integer.parseInt(keyboard.nextLine());

        DateOfBirth dateOfBirth = new DateOfBirth(birthYear, birthMonth, birthDay);

        PersonHeartRate personHeartRate = new PersonHeartRate(firstName, lastName, dateOfBirth);

        System.out.println(personHeartRate.maxHeartRate());

        ArrayList<PersonHeartRate> heartRateList = new ArrayList<>();
    }
}