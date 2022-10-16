package ekim09;

public class C04_MukemmelSayi {
    public static void main(String[] args) {

        int kullanicininGirdigiSayi = 28;

        int toplam = 0;
        int bolunebilenSayilar = 0;

        for(int i = 1; i <= kullanicininGirdigiSayi; i++) {
            if(kullanicininGirdigiSayi % i == 0) {
                toplam += i;
                bolunebilenSayilar = i;
                System.out.print(i + " + ");
            }
        }

        System.out.println(" = " + bolunebilenSayilar*2);

        if(toplam == kullanicininGirdigiSayi*2) {
            System.out.println(kullanicininGirdigiSayi + " bir mukemmel sayidir. Cunku kendisine bolunebilen sayilarin toplami, sayinin iki katini verir.");
        } else {
            System.out.println(kullanicininGirdigiSayi + " mukemmel sayi degildir!");
        }
    }
}
