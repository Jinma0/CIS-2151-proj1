package proj1;

import java.time.LocalDate;
import java.time.Period;

public class PersonHeartRate {
    String firstName;
    String lastName;
    int birthMonth;
    int birthDay;
    int birthYear;

    DateOfBirth birthDate = new DateOfBirth(birthMonth, birthDay, birthYear);

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

    public int getBirthMonth(){
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth){
        this.birthMonth = birthMonth;
    }

    public int getBirthDay(){
        return birthDay;
    }

    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int calculateAge(int birthMonth, int birthDay, int birthYear){
        LocalDate birthDate = LocalDate.of(birthMonth, birthDay, birthYear);
        LocalDate todaysDate = LocalDate.now();
        Period patientAge = Period.between(birthDate, todaysDate);
        return Integer.parseInt(String.valueOf(patientAge));
    }

    public int maxHeartRate(){
        return 220 - calculateAge(birthMonth, birthDay, birthYear);
    }

    public int printData(){
        return maxHeartRate();
    }
}
