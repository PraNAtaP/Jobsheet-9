import java.util.Scanner;

public class TUGAS3Pesanan19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                         "Kentang Goreng", "Teh Tarik", "Cappucino",
                         "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari : ");
        String makananDicari = input19.nextLine();

        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan " + makananDicari + " tersedia di menu. GAS PESAN!!");
        } else {
            System.out.println("Makanan " + makananDicari + " tidak ada di menu.");
        }
    }
}

