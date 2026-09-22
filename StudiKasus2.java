public class StudiKasus2 {
    public static void main (String[] args) {
        int lebar_tanah = 30;
        int panjang_tanah = 100;
        int diameter_kolam = 5;
        int panjang_sisi_kolam = 2;

        double luas_tanah;
        double luas_kolam_lingkaran;
        double luas_kolam_persegi;
        double luas_tanah_tidak_digunakan;
        double phi = 3.14;
        double rumus = 0.25;

        luas_tanah = lebar_tanah * panjang_tanah;
        luas_kolam_lingkaran = rumus*(diameter_kolam * diameter_kolam) * phi;
        luas_kolam_persegi = panjang_sisi_kolam * panjang_sisi_kolam;
        luas_tanah_tidak_digunakan = luas_tanah - (luas_kolam_lingkaran + luas_kolam_persegi);

        System.out.println("Luas tanah Pak Tono adalah " + luas_tanah);
        System.out.println("Luas kolam ikan lingkaran adalah " + luas_kolam_lingkaran);
        System.out.println("Luas kolam ikan persegi adalah " + luas_kolam_persegi);
        System.out.println("Luas tanah Pak Tono yang tidak digunakan adalah " + luas_tanah_tidak_digunakan);

    }
}