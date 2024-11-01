import java.util.Scanner;

public class TUGAS1NilaiMahasiswa19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int banyak = input19.nextInt();

        int[] nilaiMhs = new int[banyak];

        for (int i = 0; i < banyak; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input19.nextInt();
        }

        int total = 0;
        for (int i = 0; i < banyak; i++) {
            total += nilaiMhs[i];
        }
        double rataRata = (double) total / banyak;

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 1; i < banyak; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        System.out.println("Nilai mahasiswa yang telah dimasukkan:");
        for (int i = 0; i < banyak; i++) {
            System.out.println("nilai Mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i]);
        }

        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

    }
}
