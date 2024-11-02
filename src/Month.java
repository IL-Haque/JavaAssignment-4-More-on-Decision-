class Month {
    private int month; // month (1 for January, 2 for February, etc.)

    public Month(int month) {
        this.month = month;
    }

    public int getLength() {
        return (month == 2) ? 28 :
                (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31;
    }

    public void printDays() {
        System.out.println(getLength() + " days");
    }

    public static void main(String[] args) {
        Month january = new Month(1);
        january.printDays(); // Output: 31 days

        Month february = new Month(2);
        february.printDays(); // Output: 28 days

        Month april = new Month(4);
        april.printDays(); // Output: 30 days

        Month march = new Month(3);
        march.printDays(); // Output: 31 days
    }
}
