import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Find the largest element in an integer array
        int[] arrInt = new int[n];
        int maxInt = arrInt[0];
        for(int i = 0; i < n; i++) {
            arrInt[i] = sc.nextInt();
            if(arrInt[i] >= maxInt) {
                maxInt = arrInt[i];
            }
        }
        System.out.println("The largest element in the integer array: " + maxInt);

        //Find the smallest element in an array of real numbers
        double[] arrDouble = new double[n];
        for(int i = 0; i < n; i++) {
            arrDouble[i] = sc.nextDouble();
        }
        double minDouble = arrDouble[0];
        for(int i=1; i<n; i++) {
            if(arrDouble[i] < minDouble) {
                minDouble = arrDouble[i];
            }
        }
        System.out.println("Smallest element in an array of real numbers: " + minDouble);

        //Sorts an array of integers in ascending order
        Arrays.sort(arrInt);

        System.out.println("Array after sorting in ascending order: " + Arrays.toString(arrInt));

        //Reverse an array
        for(int i=0; i<(n/2); i++) {
            int temp = arrInt[i];
            arrInt[i] = arrInt[n-1-i];
            arrInt[n-1-i] = temp;
        }
        System.out.println("Array after inversion: " + Arrays.toString(arrInt));

        //Calculate the sum of elements in an integer array
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arrInt[i];
        }
        System.out.println("Sum of array: " + sum);
    }
}
