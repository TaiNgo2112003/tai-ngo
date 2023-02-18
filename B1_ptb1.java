
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class B1_ptb1 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        //GiaiPTB1(a, b);
        GiaiPTB2(a, b, c);
    }

    public static void GiaiPTB1(int a, int b) {
        double x;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            x = (double) -b / a;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(x) + ".");
        }
    }

    public static void GiaiPTB2(int a, int b, int c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        System.out.println("Nhập vào số c: ");
        c = scanner.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        int x;
        if (a == 0) {
            GiaiPTB1(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("PT vô nghiệm");
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(x) + ".");

            } else {
                int x1 = (int) (-b + Math.sqrt(delta) / (2 * a));
                int x2 = (int) (-b + Math.sqrt(delta) / (2 * a));
                System.out.println("2 nghiệm pb lần lượt là: " + decimalFormat.format(x1) + decimalFormat.format(x2));

            }
        }

    }

    public static void TienDien(int SoDien) {
        int Total = 0;
        if (SoDien < 50) {
            Total = SoDien*1000;
            System.out.println("Số tiền điện là: "+Total);
        }
        else{
            Total= 50*1000+(SoDien-50)*1200;
                        System.out.println("Số tiền điện là: "+Total);

        }
        
    }
}
