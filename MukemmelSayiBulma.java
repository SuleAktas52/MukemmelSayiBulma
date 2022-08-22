import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {

        int sayi, sayi2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                sayi2 += i;
            }
        }
        if (sayi == sayi2) {
            System.out.println(sayi + " Mukemmel Sayidir..");
        }
        else{
            System.out.println(sayi + " Mukemmel Sayi Degildir !");
        }
    }
}
/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
toplamı kendisine eşit olan sayıya mükemmel sayı denir.
 */