package proj1;

import java.time.LocalDate;
import java.time.Period;

public class PersonHeartRate {
    String firstName;
    String lastName;
    int month;
    int day;
    int year;
    DateOfBirth birthDate = new DateOfBirth(year, day, month);

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

    public int getMonth(){
        return month;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int calculateAge(int year, int month, int day){
        LocalDate birthDate = LocalDate.of(getYear(), getMonth(),getDay());
        LocalDate todaysDate = LocalDate.now();
        Period patientAge = Period.between(birthDate, todaysDate);
        return Integer.parseInt(String.valueOf(patientAge));
    }

    public int maxHeartRate(){
        return 220 - calculateAge(year, month, day);
    }

    public int printData(){
        return maxHeartRate();
    }
}
