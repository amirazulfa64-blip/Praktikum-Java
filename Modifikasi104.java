import java.util.Scanner;

public class Modifikasi104{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gaji_pokok = sc.nextDouble();

        System.out.print("Masukkan tunjangan anak: ");
        double tunjangan_anak = sc.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        int jumlah_anak = sc.nextInt();

        double total_tunjangan = tunjangan_anak * jumlah_anak;
        double potongan_pensiun = gaji_pokok * 0.10; // 10% dari gaji pokok
        double gaji_bersih = gaji_pokok + total_tunjangan - potongan_pensiun;

        System.out.println("Gaji bersih per bulan: Rp " + gaji_bersih);
        System.out.println("Total tunjangan anak sebesar Rp "+ total_tunjangan);
        System.out.println("Total potongan untuk simpanan wajib dana pensiun sebesar Rp "+ potongan_pensiun);
    }
}