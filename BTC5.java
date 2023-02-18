
import java.awt.List;
import java.util.Scanner;

public class BTC5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elenment for your Array: : ");
        int n = scanner.nextInt();
        int Mang[] = new int[n];
        System.out.println("Enter the element values for your array: ");
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Enter element value position  " + (i + 1) + "5: ");
            Mang[i] = scanner.nextInt();
        }

        System.out.println("Enter the element value you want to remove: ");
        int k = scanner.nextInt();
        int c;
        for (c = i = 0; i < n; i++) {
            if (Mang[i] != k) {
                Mang[c] = Mang[i];
                c++;
            }
        }
            n=c;
                System.out.println("The remaining after deletion " + k + " is: ");
                for(i=0;i<n;i++){
                            System.out.print(Mang[i] + "\t");
                }
    }
}
