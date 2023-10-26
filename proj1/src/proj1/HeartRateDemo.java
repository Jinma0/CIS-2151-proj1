package proj1;

import java.util.ArrayList;
import java.util.Scanner;

public class HeartRateDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<PersonHeartRate> heartRateList = new ArrayList<>();

        String exitCommand = "";


        while (!exitCommand.equalsIgnoreCase("no")){
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
            heartRateList.add(personHeartRate);

            System.out.println("Enter another?");
            exitCommand = keyboard.nextLine();

            if (!exitCommand.equalsIgnoreCase("no")){
                exitCommand = "";
            }
        }
        for (PersonHeartRate phr: heartRateList){
            System.out.println(phr.printData());
        }
    }
}