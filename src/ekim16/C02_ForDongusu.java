package ekim16;

import java.util.ArrayList;

public class C02_ForDongusu {
    public static void main(String[] args) {

        System.out.println("");
        for (int i = 9; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }


    }
}
