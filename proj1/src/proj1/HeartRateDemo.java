package proj1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HeartRateDemo {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String exitCommand = "";


        while (!exitCommand.equalsIgnoreCase("exit")){
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

            System.out.println("Enter the number 1 to submit another patient, or enter exit to print data...");
            exitCommand = keyboard.nextLine();

            if (exitCommand.equalsIgnoreCase("1")){
                exitCommand = "exit";
            } else if (exitCommand.equalsIgnoreCase("exit")) {
                for (PersonHeartRate phr : heartRateList){
                    phr.printData();
                }
            } else {
                exitCommand = "exit";
            }
        }
    }
}