public class RobotArm04 {
    public static void main(String[] args) {
        // Kondisi awal
        String nampanA = "Bintang";
        String nampanB = "Bulan";
        String nampanC = "Kosong";

        // Langkah 1: Ambil bola di nampan A, taruh di nampan C
        nampanC = nampanA;
        nampanA = "Kosong";
        System.out.println("Setelah langkah 1: Nampan A = " + nampanA + ", Nampan B = " + nampanB + ", Nampan C = " + nampanC);

        // Langkah 2: Ambil bola di nampan B, taruh di nampan A
        nampanA = nampanB;
        nampanB = "Kosong";
        System.out.println("Setelah langkah 2: Nampan A = " + nampanA + ", Nampan B = " + nampanB + ", Nampan C = " + nampanC);

        // Langkah 3: Ambil bola di nampan C, taruh di nampan B
        nampanB = nampanC;
        nampanC = "Kosong";
        System.out.println("Setelah langkah 3: Nampan A " + nampanA + ", Nampan B = " + nampanB + ", Nampan C = " + nampanC);

        // Kesimpulan
        System .out.println("Kesimpulan: Pernyataan yang benar adalah (a) Kedua bola sudah bertukar tempat, dan (e) nampan C kosong.");
    }
}