public class ConverterSwitch implements Converter {
    public String convertMonth(int monthNumber) {



        if (monthNumber < 1 || monthNumber > 12) {
            throw new IllegalArgumentException();
        }

        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "That's not a month...";
        };
    }

    public String convertDay(int dayNumber) {

        if (dayNumber < 1 || dayNumber > 7) {
            throw new IllegalArgumentException();
        }

        return switch (dayNumber) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "That's not a day...";
        };
    }
}