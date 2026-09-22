import java.util.Scanner;

public class Bank04{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gaji_pokok = 5000000;
        int tunjangan_anak_per_bulan = 100000;
        int jml_anak = 4;
        double prosentase_dana_pensiun=0.10; // 10%

        System.out.println ("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println ("masukkan lama menabung anda");
        lama_menabung= input.nextInt();

        bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;
        System.out.println ("Bunga adalah " +bunga);
        System.out.println ("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);
        
    }
}