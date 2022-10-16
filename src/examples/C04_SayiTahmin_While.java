package examples;

import java.util.Scanner;

public class C04_SayiTahmin_While {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maxSayi = 100;
        int minSayi = 1;
        int sayi = (int) (Math.random() * (maxSayi - minSayi + 1) + minSayi);
        int can = 5;
        int girilenSayi;

        System.out.println("Sayi tahmin oyununa hosgeldiniz. Lutfen tahmininizi yapin: ");

        while (true) {
            girilenSayi = scan.nextInt();

            if(girilenSayi > sayi) {
                System.out.println("Asagi in");
                --can;
            } else if(girilenSayi < sayi) {
                System.out.println("Yukari cik");
                --can;
            } else {
                System.out.println("Tebrikler");
                break;
            }
            if(can == 0) {
                System.out.println("hic canin kalmadi!");
                break;
            }
        }
    }

}

