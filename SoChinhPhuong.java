
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public  class SoChinhPhuong {
    
    public static boolean SCP(double n){
        double sqr = Math.sqrt(n);
        if(sqr*sqr==n)
            return true;
        return false;
                
    }
    public static void main(String[] args) {
          double n;
          Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elenment: : ");
     n = scanner.nextDouble();
                System.out.println("The answer is:  "+SCP(n));

    }3
}
