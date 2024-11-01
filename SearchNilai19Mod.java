import java.util.Scanner;

public class SearchNilai19Mod {

    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int banyak = input19.nextInt();
        
        int[] arrNilai = new int[banyak];
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = input19.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = input19.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, nilai tersebut adalah nilai dari mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}