package proj1;

public class DateOfBirth {
    public int birthDay;
    public int birthMonth;
    public int birthYear;

    public DateOfBirth(int birthDay, int birthMonth, int birthYear){
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public int getBirthDay(){
        return birthDay;
    }

    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;
    }

    public int getBirthMonth(){
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth){
        this.birthMonth = birthMonth;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
}
