
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class RankSchool {
    public static void Input(  float n){
                 Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your point: ");
      n = scanner.nextFloat();

    }
    
    public static void calculator(float n) {
        if(n>8)
             System.out.println("Giỏi");
        else if(n>7)
             System.out.println("Khá ");
        else if(n>5)
             System.out.println("Trung bình ");
        else
             System.out.println("kém: ");
    }
}
