import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println("Quotient when dividing " + dividend + " by " + divisor + " is: " + (dividend/divisor));
        System.out.println("Remainder when dividing " + dividend + " by " + divisor + " is: " + (dividend%divisor));

    }
}
