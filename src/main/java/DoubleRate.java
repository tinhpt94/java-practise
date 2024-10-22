import java.util.Scanner;

public class DoubleRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();

        double r1 = sc.nextDouble();

        double r2 = sc.nextDouble();

        double amount = p * (1 + r1) * (1 + r2);

        System.out.println("The amount after compound interest is: " + amount);

    }
}
