package proj1;

import java.util.Scanner;

public class HeartRateDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Patient's first name: ");
        String patientFirstName = keyboard.nextLine();

        System.out.println("Patient's last name: ");
        String patientLastName = keyboard.nextLine();

        System.out.println("Patient's birth month: ");
        Integer patientBirthMonth = Integer.parseInt(keyboard.nextLine());

        System.out.println("Patient's birth day: ");
        Integer patientBirthDay = Integer.parseInt(keyboard.nextLine());

        System.out.println("Patient's birth year: ");
        Integer patientBirthYear = Integer.parseInt(keyboard.nextLine());
    }
}