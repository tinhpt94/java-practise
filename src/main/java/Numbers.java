import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Converts an integer to binary.
        int number = sc.nextInt();

        String binary = "";
        int temp = number;

        if (temp==0){
            binary = "0";
        }
        else {
            while (temp>0) {
                binary += temp%2;
                temp /= 2;
            }
        }
        String reverse = new StringBuilder(binary).reverse().toString();
        System.out.println("Binary number of " + number + " is: " + reverse);
        System.out.println();


        //Calculate the sum of prime numbers less than n.
        int result = 0;
        int sumPrime = 0;
        for(int i = 3; i<number; i++) {
            for(int j=2; j<i; j++) {
                if(i%j==0) {
                    result -= 1;
                    break;
                }
            }
            if(result == 0) {
                System.out.println( i + " is a prime number");
                sumPrime += i;
            }
            else {result=0;}
        }
        System.out.println("Sum of prime numbers is smaller " + number + " is: " + sumPrime);
        System.out.println();

        //Check for a perfect number (sum of divisors equals itself).
        int sumDivisor = 0;
        for(int i = 1; i <= number; i++) {
            if(number%i==0) {
                System.out.println(i + " is divisor of " + number);
                sumDivisor += i;
            }
        }
        if(sumDivisor == number) {
            System.out.println(number + " is a perfect number");
        }
        else {
            System.out.println(number + " isn't a perfect number");
        }
        System.out.println();

        //Find the number of Fibonacci numbers less than a number n.
        if (number <= 1) {
            System.out.println("The number of Fibonacci numbers is smaller " + number + " is: 0");
            return;
        }

        int a = 0, b = 1;
        int count = 2;

        while (true) {
            int next = a + b;
            if (next >= number)  {
                break;
            }
            count++;
            a = b;
            b = next;
        }

        System.out.println("The number of Fibonacci numbers is smaller " + number + " is: " + count);
        System.out.println();

        //Calculate the sum of odd digits of an integer.
        int number1 = sc.nextInt();
        int sum1 = 0;
        int temp1 = Math.abs(number1);
        while(temp1 > 0) {
            int num = temp1%10;
            if(num%2!=0) {
                sum1 += num;
            }
            temp1 /= 10;
        }
        System.out.println("Sum of odd digits of an integer " + number1 + " is " + sum1);
    }
}
