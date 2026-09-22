public class StudiKasus104{
    public void main(String[] args) {
        int gaji_pokok = 5000000;
        int tunjangan_anak_per_bulan = 100000;
        int jumlah_anak = 4;
        double prosentase_dana_pensiun = 0.10; // 10%

        int total_tunjangan = tunjangan_anak_per_bulan * jumlah_anak;
        double potongan_pensiun = gaji_pokok * prosentase_dana_pensiun;
        double gaji_bersih = gaji_pokok + total_tunjangan - potongan_pensiun;

        System.out.println("Gaji bersih Pak Danur: Rp " + gaji_bersih);
    }
}