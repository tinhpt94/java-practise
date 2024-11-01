import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Print the multiplication table from 1 to 10.
        System.out.println("Multiplication table:");
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                System.out.print(j + "x" + i + "=" +(j*i) + "  ");
            }
            System.out.println();
        }

        //Calculate the factorial of a number.
        int num = sc.nextInt();
        int fac = num;
        for(int i=num-1; i>0; i--) {
            fac *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fac);

        //Print the Fibonacci sequence for the first n numbers.
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Fibonacci sequence: ");
            int a = 0, b = 1;
            for (int i = 1; i <= num; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }

        //Kiểm tra số nguyên tố.
        int result = 0;
        for(int i=2; i<num; i++) {
            if(num%i==0){
                System.out.println(num + " isn't a prime number");
                result += 1;
                break;
            }
        }
        if(result == 0) {
            System.out.println(num + " is a prime number");
        }

        //Find the greatest common divisor of two numbers.
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
        while (b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("Greatest common divisor of " + num1 + " and " + num2 + " is: " + a);
    }
}
