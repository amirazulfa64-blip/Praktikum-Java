import java.util.Scanner;
public class StudiKasus2Dinamis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int lebar_tanah, panjang_tanah, panjang_sisi_kolam, diameter_kolam;
        double luas_tanah, luas_tanah_tidak_digunakan, luas_kolam_lingkaran, luas_kolam_persegi, rumus = 0.25, phi = 3.14;
        System.out.println("Masukkan lebar tanah : ");
        lebar_tanah = input.nextInt();
        System.out.println("Masukkan panjang tanah : ");
        panjang_tanah = input.nextInt();
        System.out.println("Masukkan diameter kolam : ");
        diameter_kolam = input.nextInt();
        System.out.println("Masukkan panjang sisi kolam : ");
        panjang_sisi_kolam = input.nextInt();

        luas_tanah = lebar_tanah * panjang_tanah;
        luas_kolam_lingkaran = rumus * (diameter_kolam * diameter_kolam)*phi;
        luas_kolam_persegi = panjang_sisi_kolam * panjang_sisi_kolam;
        luas_tanah_tidak_digunakan = luas_tanah - (luas_kolam_lingkaran + luas_kolam_persegi);
        System.out.println("Luas tanah adalah "+luas_tanah);
        System.out.println("Luas kolam lingkaran adalah "+luas_kolam_lingkaran);
        System.out.println("Luas kolam persegi adalah "+luas_kolam_persegi);
        System.out.println("Luas tanah yang tidak digunakan adalah "+luas_tanah_tidak_digunakan);
        
    }
}