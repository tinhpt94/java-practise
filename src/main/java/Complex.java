import java.util.Scanner;
public class Complex {
    double thuc, ao;

    Complex(double thuc, double ao) {

        this.thuc = thuc;

        this.ao = ao;

    }

    Complex cong(Complex sp) {

        return new Complex(this.thuc + sp.thuc, this.ao + sp.ao);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập phần thực của số phức thứ nhất: ");
        double thuc1 = sc.nextDouble();
        System.out.print("Nhập phần ảo của số phức thứ nhất: ");
        double ao1 = sc.nextDouble();
        Complex sp1 = new Complex(thuc1, ao1);

        System.out.print("Nhập phần thực của số phức thứ hai: ");
        double thuc2 = sc.nextDouble();
        System.out.print("Nhập phần ảo của số phức thứ hai: ");
        double ao2 = sc.nextDouble();
        Complex sp2 = new Complex(thuc2, ao2);

        Complex tong = sp1.cong(sp2);

        System.out.println("Tổng hai số phức là: " + tong.thuc + " + " + tong.ao + "i");

    }
}
