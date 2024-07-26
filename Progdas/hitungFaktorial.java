package Progdas;
import java.util.Scanner;

public class hitungFaktorial {
    public static int hitungFaktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int n = input.nextInt();
        input.close();
        
        int hasilFaktorial = hitungFaktorial(n);
        System.out.println("Faktorial dari " + n + " adalah " + hasilFaktorial);
    }
}