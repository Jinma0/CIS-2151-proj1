package proj1;

import java.time.LocalDate;
import java.time.Period;

public class PersonHeartRate {
    String firstName;
    String lastName;
    DateOfBirth birthDate;

    public PersonHeartRate(String firstName, String lastName, DateOfBirth birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int calculateAge(){
        LocalDate localDate = LocalDate.of(birthDate.getYear(),
                birthDate.getMonth(),
                birthDate.getDay());

        LocalDate todaysDate = LocalDate.now();

        Period patientAge = Period.between(localDate, todaysDate);
        return patientAge.getYears();
    }

    public int maxHeartRate(){
        return 220 - calculateAge();
    }

    public String targetHeartRateRange(){
        int lowRange = maxHeartRate() / 2;
        int highRange = (maxHeartRate() * 85) / 100;
        return lowRange + " - " + highRange;
    }

    public String printData(){
        return lastName + ", " + firstName + "\n" +
                "Max heart rate: " + maxHeartRate() + "\n" +
                "Target heart rate: " + targetHeartRateRange() + "\n";
    }
}
