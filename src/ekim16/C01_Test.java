package ekim16;

import java.util.Scanner;

public class C01_Test {
    public static void main(String[] args) {

        int maxSayi = 10;
        int minSayi = 1;
        int rastgeleSayi = (int) (Math.random() * (maxSayi - minSayi + 1) + minSayi);
        int can = 3;
        int girilenSayi;

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi tahmin oyununa hosgeldiniz. Lutfen ilk tahmininizi yapin: ");
        System.out.println("Lutfen " + minSayi + " - " + maxSayi + " araliginda bir sayi girin!");

        while (true) {
            girilenSayi = scan.nextInt();

            if (girilenSayi <= maxSayi && girilenSayi >= minSayi) {

                if (girilenSayi > rastgeleSayi) {

                    --can;
                    if (can != 0) System.out.println("Biraz asagi in...");

                } else if (girilenSayi < rastgeleSayi) {

                    --can;
                    if (can != 0) System.out.println("Biraz daha yukari cik...");

                } else {
                    System.out.println("Tebrikler sayiyi bildiniz!");
                    break;
                }
            } else {
                System.out.println("Lutfen " + minSayi + " - " + maxSayi + " araliginda bir sayi girin!");
            }

            if (can == 0) {
                System.out.println("Tum tahmin haklarinizi doldurdunuz!");
                break;
            }
        }
    }
}
