import java.util.Scanner;
public class SistemParker04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jenis kendaraan pengguna
        System.out.println("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = input.nextLine().trim();

        // Pengecekan kondisi dan perhitungan biaya
        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            int biaya = 5000;
            System.out.println("\n--- Detail pembayaran ---");
            System.out.println("Jenis Kendaraan : Mobil");
            System.out.println("Total Biaya : Rp " + biaya);
        }  else if (jenisKendaraan.equalsIgnoreCase("Motor")) {
            int biaya = 3000;
            System.out.println("\n--- Detail pembayaran ---");
            System.out.println("Jenis Kendaraan : Motor");
            System.out.println("Total Biaya : Rp " + biaya);
        }  else {
            System.out.println("\n jenis kendaraan tidak valid");
        }
        input.close();
    }
}