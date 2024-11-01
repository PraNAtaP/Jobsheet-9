import java.util.Scanner;

public class ArrayNilai19Mod {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int[] nilaiAkhir = new int[11];

        for (int i = 1; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilaiAkhir[i] = input19.nextInt();
        }

        for (int i = 1; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus! ");
            }
            else {
                System.out.println("Mahasiswa ke-" + i + " tidak lulus ");
            }
        }
    }
}
