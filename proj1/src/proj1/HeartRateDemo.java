package proj1;

import java.util.ArrayList;
import java.util.Scanner;

public class HeartRateDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean programOver = false;

        while (programOver = false) {
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

            DateOfBirth dateOfBirth = new DateOfBirth(birthMonth, birthDay, birthYear);
            PersonHeartRate personHeartRate = new PersonHeartRate(firstName, lastName, dateOfBirth);
            ArrayList<PersonHeartRate> heartRateList = new ArrayList<>();
            heartRateList.add(personHeartRate);
        }

        System.out.println("Enter the number 1 to submit another patient, or enter 0 to continue...");
        int userPrompt = Integer.parseInt(keyboard.nextLine());

        if (userPrompt == 1){
            programOver = false;
        } else if (userPrompt == 0) {
            programOver = true;
        } else {
            System.out.println("Enter the number 1 to submit another patient, or enter 0 to continue...");
        }
    }
}