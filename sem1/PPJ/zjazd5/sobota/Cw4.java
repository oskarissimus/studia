public class Cw4 {
    public static void main(String[] args) {
        printMonth(1, 2022);
    }

    public static void printMonth(int m, int y) {
        java.time.LocalDate d = java.time.LocalDate.of(y, m, 1);
        int dayOfWeekOfMonthBeginning = d.getDayOfWeek().getValue();
        int dayOfMonthCounter = 1;
        int daysInMonth = d.getMonth().length(d.isLeapYear());

        // first line of calendar
        for (int day = 1; day <= 7; day++) {
            if (day < dayOfWeekOfMonthBeginning) {
                System.out.print("   ");
            } else {
                System.out.print(String.format("%1$3s", dayOfMonthCounter++));
            }
        }
        System.out.println("");

        for (int line = 0; line < 6 && dayOfMonthCounter <= daysInMonth; line++) {
            for (int day = 1; day <= 7 && dayOfMonthCounter <= daysInMonth; day++) {
                System.out.print(String.format("%1$3s", dayOfMonthCounter++));
            }
            System.out.println("");
        }

    }

}
