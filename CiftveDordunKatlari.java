package Giris;
import java.util.Scanner;
public class CiftveDordunKatlari {
    public static void main(String[] args) {
        int j;
        int total = 0;
        Scanner baba = new Scanner(System.in);


        do {
            System.out.print("Sayı girin : ");
            j = baba.nextInt();
            if (j % 4 == 0){
                total += j;
            }
        }while (j % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
