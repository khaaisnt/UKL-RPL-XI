package Progdas;
import java.util.Scanner;

public class volumeTabung {
    public static double hitungVolume(double jari, double tinggi) {
        double volume = 3.14 * (jari * jari) * tinggi;
        return volume;
    }

    public static double hitungLuas(double jari, double tinggi) {
        double luas = 2 * 3.14 * jari * (jari + tinggi);
        return luas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double jari = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        double volume = hitungVolume(jari, tinggi);
        System.out.println("Volume Tabung: " + volume);
        double luas = hitungLuas(jari, tinggi);
        System.out.println("Luas permukaan Tabung:"+ luas);
        input.close();
    }
}
