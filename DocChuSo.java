
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class DocChuSo {

    public static int Input() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your point: ");
        n = scanner.nextInt();
        if (n < 100 || n > 999) {
            System.out.println("Re-Enter the  three-digit number: ");
        }
        return n;
    }
    public static void HowToPronunciation(int n) {
        int a = n % 10;

        int b = (n / 10) % 10;

        int c = n / 100;

        switch (c) {
            case 1 ->
                System.out.println("một trăm ");
            case 2 ->
                System.out.println("haitrăm  ");
            case 3 -> {
                System.out.println("ba trăm  ");
            }
            case 4 -> {
                System.out.println("bốn  trăm  ");
            }
            case 5 -> {
                System.out.println("năm trăm  ");
            }
            case 6 -> {
                System.out.println("sáu trăm  ");
            }
            case 7 -> {
                System.out.println("bảy trăm  ");
            }
            case 8 -> {
                System.out.println("tám trăm  ");
            }
            case 9 -> {
                System.out.println("chín trăm  ");
            }
        }

        if (b % 10 == 0 && a != 0) {
            System.out.println("lẻ  ");
        }
        //in ra hàng chục
        switch (b) {
            case 1 ->
                System.out.println("mười  ");
            case 2 ->
                System.out.println("hai mươi ");
            case 3 ->
                System.out.println("ba mươi ");
            case 4 ->
                System.out.println("bốn mươi  ");
            case 5 ->
                System.out.println("năm mươi  ");
            case 6 ->
                System.out.println("sáu mơi ");
            case 7 ->
                System.out.println("bảy mươi  ");
            case 8 ->
                System.out.println("tám mươi  ");
            case 9 ->
                System.out.println("chín mươi ");
        }
        //in ra hàn đơn vị
        switch (a) {
            case 1 ->
                System.out.println("một  ");
            case 2 ->
                System.out.println("hai ");
            case 3 ->
                System.out.println("ba  ");
            case 4 ->
                System.out.println("bốn  ");
            case 5 ->
                System.out.println("năm ");
            case 6 ->
                System.out.println("sáu   ");
            case 7 ->
                System.out.println("bảy   ");
            case 8 ->
                System.out.println("tám  ");
            case 9 ->
                System.out.println("chín  ");
        }
    }
    public static void main(String[] args) {

        HowToPronunciation(Input());
    }
}

