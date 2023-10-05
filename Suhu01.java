import java.util.Scanner;

public class Suhu01 {
    public static void main(String[] args) {

    int suhu;
    String hujan;
    Scanner input01 = new Scanner(System.in);

    System.out.print("Masukkan suhu: ");
    suhu = input01.nextInt();
    System.out.print("Apakah cuaca sedang hujan (ya atau tidak)? ");
    hujan = input01.next();

    if (suhu > 27) {
        System.out.println("Memakai dress");
    } else {
        System.out.println("Memakai celana panjang");
    }
    
      if (hujan.equals("ya")) {
        System.out.println("Membawa payung");
        } else {
        System.out.println("Memakai sunscreen");
        }
   }
}
    
