import java.util.HashMap;
import java.util.Map;

public class SimpleDate {

    private int day;
    private int month;
    private int year;
    private static final int MONTH_MAX_NUMBER = 30;
    private static final int YEAR_MAX_DAYS = 360;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    //I need to redo this challenge later, had a tough day at work. Even if it passes, i'm not happy with the approach i took to solve this problem.
    //Maybe when i finish the last part, i could see it with fresh eyes!
    /* 1ST TRY - FAILED
    public void advance() {
        
        this.day = advanceDay(this.day, 1);
        if(this.month >= 12) {
            this.year = advanceYear(1);
            this.month = this.month % 12;
            if(this.month == 0) {
                this.month = 1;
            }
        }
        if(this.day == 1) { //if day one, month shall advance, thus 2nd parameter being MONTH_MAX_NUMBER
            this.month += advanceMonth(this.day, MONTH_MAX_NUMBER);
        }
    }

    public void advance(int howManyDays) {
        if((this.day + howManyDays) > 30) { //advance month
            this.month += advanceMonth(this.day, howManyDays);
            if(this.month > 12) {
                this.month = this.month % 12;
            }
            this.day = advanceDay(this.day, howManyDays);
        } else {
            this.day = advanceDay(this.day, howManyDays);
        }
    }

    public int advanceYear(int yearsPassed) {
        return this.year += yearsPassed;
    }

    public int advanceMonth(int currentDay, int sumDay) {

        int monthsPassed = (currentDay + sumDay) / MONTH_MAX_NUMBER;
        if(monthsPassed > 12) {
            int yearsPassed = (currentDay + sumDay) / YEAR_MAX_DAYS;
            advanceYear(yearsPassed);
        }
        return monthsPassed;
    }

    public int advanceDay(int currentDay, int sumDay) {
        
        if(currentDay + sumDay > MONTH_MAX_NUMBER) {
            int daysPassed = (currentDay + sumDay) % MONTH_MAX_NUMBER;
            if(daysPassed == 0) { //29 + 1 = 30, 30 % 30 = 0, never gets to the last day of the month without it.
                daysPassed = MONTH_MAX_NUMBER;
            }
            return daysPassed;
        } else {
            return this.day += sumDay;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {

        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        if(newDate.month > 12){ //shitty-ass fix
            newDate.month = newDate.month % 12;
        }
        return newDate;
    }
    */

    //I couldnt wait! This course is awesome!

    //2ND TRY
    public void advance(){
        this.advance(1);
    }

    public void advance(int howManyDays){
        if(howManyDays < 0) {
            return;
        }

        Map<String, Integer> convertedDays = daysToMonthAndYear(howManyDays);
        advanceYear(convertedDays.get("yearsPassed"));
        advanceMonth(convertedDays.get("monthsPassed"));
        advanceDay(convertedDays.get("daysPassed"));
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

    //advance helpers
    public void advanceYear(int yearsSum){
        this.year += yearsSum;
    }

    public void advanceMonth(int monthsSum){
        if(this.month == 12 && monthsSum != 0) {
            this.month = monthsSum;
            advanceYear(1);
        } else {
            this.month += monthsSum;
        }
    }

    public void advanceDay(int daysSum){
        //problem
            //when the day is 30, and i add 1 day, it should cycle months, and year (if month is 12)
        if(this.day == 30 && daysSum != 0) {
            this.day = daysSum;
            advanceMonth(1);
        } else {
            this.day += daysSum;
        }

    }

    private Map<String, Integer> daysToMonthAndYear(int howManyDays){
        Map<String, Integer> convertedDays = new HashMap<>();
        
        int yearsPassed = howManyDays / YEAR_MAX_DAYS;

        int monthsPassed = (howManyDays / MONTH_MAX_NUMBER) % 12;
        int monthsRemainderInDays = howManyDays % MONTH_MAX_NUMBER;
        
        int daysPassed = monthsRemainderInDays;
        //logging the converted days
        // System.out.println("years passed: " + yearsPassed);
        // System.out.println("months passed: " + monthsPassed);
        // System.out.println("days passed: " + daysPassed);
        
        convertedDays.put("yearsPassed", yearsPassed);
        convertedDays.put("monthsPassed", monthsPassed);
        convertedDays.put("daysPassed", daysPassed);

        return convertedDays;
    }
}
