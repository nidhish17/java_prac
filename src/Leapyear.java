public class Leapyear {

    public static void main(String[] args) {
        checkLeapYear(1600); // Expected: Yes the year 1600 is a leap year
        checkLeapYear(1700); // Expected: No the year 1700 is not a leap year
        checkLeapYear(1800); // Expected: No the year 1800 is not a leap year
        checkLeapYear(1900); // Expected: No the year 1900 is not a leap year
        checkLeapYear(2000); // Expected: Yes the year 2000 is a leap year
        checkLeapYear(2004); // Expected: Yes the year 2004 is a leap year
        checkLeapYear(2019); // Expected: No the year 2019 is not a leap year
        checkLeapYear(2020); // Expected: Yes the year 2020 is a leap year
        checkLeapYear(2021); // Expected: No the year 2021 is not a leap year
        checkLeapYear(2024); // Expected: Yes the year 2024 is a leap year
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Yes the year " + year + " is a leap year");
                } else {
                    System.out.println("No the year " + year + " is not a leap year");
                }
            } else {
                System.out.println("Yes the year " + year + " is a leap year");
            }
        } else {
            System.out.println("No the year " + year + " is not a leap year");
        }

    }

}