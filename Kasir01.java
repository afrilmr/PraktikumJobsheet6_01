import java.util.Scanner;

public class Kasir01 {
    public static void main(String[] args) {

    int total, diskon, bayar;
    String kartu;
    Scanner input01 = new Scanner(System.in);

    System.out.print("Apakah pelanggan mempunyai kartu anggota (ya atau tidak)? ");
    kartu = input01.nextLine();
    System.out.print("Berapa total harga barang belanjaan? ");
    total = input01.nextInt();

    if (kartu.equals("ya")){
        if (total > 500000){
            diskon = 50000;
        } else {
            diskon = 25000;
        }
    } else {
        if (total > 200000){
            diskon = 10000;
        } else {
            diskon = 0;
        }
    }
    bayar = total - diskon;
    System.out.println("Total yang harus dibayar: Rp " + bayar);
    }
}
