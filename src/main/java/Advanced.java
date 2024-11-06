import java.util.Scanner;
import java.util.Arrays;

public class Advanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //Find the number of occurrences of a character in a string.
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                count += 1;
            }
        }
        System.out.println("The number of occurrences of " + c + " in " + str + ": " + count);

        //Check if a number is an Armstrong number.
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        int n = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is number Armstrong.");
        } else {
            System.out.println(originalNumber + " isn't number Armstrong.");
        }

        //Find prime divisors of a number.
        int number1 = sc.nextInt();
        int a = 0;
        for(int i=3; i<=number1; i++) {
            if(number1%i==0) {
                for(int j=2; j<i; j++) {
                    if(i%j==0) {
                        a -= 1;

                    }
                }
                if(a==0) {
                    System.out.println(i + " is prime divisors of " + number1);
                }
            }
        }
        System.out.println();

        //Checks if a string is a happy string (contains the characters a, e, i, o, u at least once).
        String strLowerCase = str.toLowerCase();
        boolean hasA = false, hasE = false, hasI = false, hasO = false, hasU = false;

        for (char ch : strLowerCase.toCharArray()) {
            switch (ch) {
                case 'a': hasA = true;
                break;
                case 'e': hasE = true;
                break;
                case 'i': hasI = true;
                break;
                case 'o': hasO = true;
                break;
                case 'u': hasU = true;
                break;
            }

            if (hasA && hasE && hasI && hasO && hasU) {
                System.out.println(str + " is chain of happiness.");
                return;
            }
        }

        if (hasA && hasE && hasI && hasO && hasU) {
            System.out.println(str + " is chain of happiness.");
        } else {
            System.out.println(str + " isn't chain of happiness.");
        }

        //Calculate the sum of the digits of an integer.
        int sum1 = 0;
        int temp = Math.abs(number1);
        while (temp > 0) {
            sum1 += temp%10;
            temp /= 10;
        }
        System.out.println();
        System.out.println("The sum of the digits of an integer " + number1 + " is: " + sum1);

        //Find the continuous subsequence with the largest sum in the array.
        int n0 = sc.nextInt();

        int[] arr = new int[n0];
        for (int i = 0; i < n0; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < n0; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        System.out.println("The continuous subsequence has the largest sum in the array is: " + maxSoFar);

        //Check if two arrays are permutations of each other.
        System.out.print("Enter the number of elements of the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements of the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (n1 != n2) {
            System.out.println("The two arrays are not permutations of each other (different lengths).");
            return;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean arePermutations = Arrays.equals(arr1, arr2);

        if (arePermutations) {
            System.out.println("The two arrays are permutations of each other.");
        } else {
            System.out.println("The two arrays are not permutations of each other.");
        }

        //Find the position of the first occurrence of an element in the array.
        System.out.print("Enter the number of elements of the third array: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter the elements of the third array:");
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find: ");
        int target = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n3; i++) {
            if (arr3[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + target + " appears first in position: " + index);
        } else {
            System.out.println("Element " + target + " does not exist in the array.");
        }



    }
}
