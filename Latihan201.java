import java.util.Scanner;

public class Latihan201 {
    public static void main(String[] args) {

    Scanner input01 = new Scanner(System.in);
    String jenisBuku;
    int jumlahBuku;
    double diskon=0, total, harga;

    System.out.print("Masukkan jenis buku yang dibeli: ");
    jenisBuku = input01.nextLine();
    System.out.print("Masukkan jumlah Buku yang dibeli: ");
    jumlahBuku = input01.nextInt();
    System.out.print("Masukkan Harga: ");
    harga = input01.nextDouble();

    if (jenisBuku.equalsIgnoreCase("kamus")){
        if (jumlahBuku <= 2){
            diskon = 0.1;
        }else if (jumlahBuku > 2){
            diskon = 0.12;
        }    
    }
    else if  (jenisBuku.equalsIgnoreCase("novel")){
        if (jumlahBuku == 1){
            diskon = 0.07;
        }else if (jumlahBuku <=3){
            diskon = 0.08;
        }else if (jumlahBuku >3){
            diskon = 0.09;
        }
    }
    else if (jumlahBuku >3){
        diskon = 0.05;
    }else {
        diskon = 0;
    }

    total = (harga * jumlahBuku) - ((jumlahBuku * harga) * diskon);
    System.out.print("Harga yang harus dibayarkan: Rp " + total);
    }
}
