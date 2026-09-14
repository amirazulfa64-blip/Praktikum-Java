import java.util.Scanner;
public class PemilihanBilangan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        // Modifikasi struktur pemilihan menggunakan ternary operator
        String hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println("Angka " + angka + " " + hasil);

        input.close();
    }
}