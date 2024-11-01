import java.util.Scanner;

public class ArrayRataNilai19Mod2 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int banyak = input19.nextInt();

        int[] nilaiMhs = new int[banyak];
        double totalLulus = 0, totalTidakLulus = 0;
        int hitunglulus = 0, hitungTidakLulus = 0;
        double rata2Lulus, rata2TidakLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input19.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                hitunglulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                hitungTidakLulus++;
            }
        }
        if (hitunglulus > 0) {
            rata2Lulus = totalLulus / hitunglulus;
        } else {
            rata2Lulus = 0;
        }
    
        if (hitungTidakLulus > 0) {
            rata2TidakLulus = totalTidakLulus / hitungTidakLulus;
        } else {
            rata2TidakLulus = 0;
        }

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
