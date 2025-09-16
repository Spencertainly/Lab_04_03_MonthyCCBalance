public class MonthlyCC {
    public static void main(String[] args) {
        System.out.println( "Monthly CC Balance"); //Task 3
        double balance = 5000.0;
        double interestRate = 0.17;
        double firstMonth = 0;
        double secondMonth = 0;


        firstMonth = balance + (balance * interestRate);
        secondMonth = firstMonth + (firstMonth * interestRate);


        System.out.println( " At the end of the first month the balance equals $" + firstMonth);
        System.out.println( " At the end of the second month the balance equals $" + secondMonth);


        System.out.println();
        System.out.println();

    }
}