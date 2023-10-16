package proj1;

import java.util.Scanner;

public class HeartRateDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the patient's first name.");
        String patientFirstName = keyboard.nextLine();

        System.out.println("Enter the patient's last name.");
        String patientLastName = keyboard.nextLine();

        System.out.println("Enter the patient's date of birth in YYYY-MM-DD.");
    }
}