package proj1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateOfBirth {
    Scanner keyboard = new Scanner(System.in);
    int birthMonth;
    int birthDay;
    int birthYear;

    public DateOfBirth(int birthMonth, int birthDay, int birthYear){
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
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

    public Period calculateAge(int birthMonth, int birthDay, int birthYear){
        LocalDate birthDate = LocalDate.of(birthYear, birthDay, birthYear);
        LocalDate todaysDate = LocalDate.now();
        Period patientAge = Period.between(birthDate, todaysDate);
        return patientAge;
    }
}
