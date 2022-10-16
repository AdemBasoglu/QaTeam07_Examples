package ekim16;

import java.util.Scanner;

public class C04_PolindromeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str = scan.nextLine();
        String ilkBolum = (str.substring(0, str.length() / 2));

        String ikinciBolum = (str.substring(str.length() / 2));

        if (str.length() % 2 == 0) {
            System.out.println(ilkBolum + ":)" + ikinciBolum);
        } else {
            System.out.println(ilkBolum + ":(" + ikinciBolum.substring(1));
        }
    }
}
