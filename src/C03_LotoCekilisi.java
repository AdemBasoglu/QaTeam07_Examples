import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class C03_LotoCekilisi {
    public static void main(String[] args) {

        // Rastgele cekilecek minimum sayi
        int min = 1;

        // Rastgele cekilecek maksimum sayi
        int max = 49;

        // Cekilecek sayi adeti
        int kacAdet = 6;

        // Cekilen sayiyi tutan degisken
        int cekilenSayi;

        // Cekilen tum sayilari tutan collection objesi (Dizisi)
        ArrayList<Integer> dizi = new ArrayList<Integer>();

        for(int i = min; i <= kacAdet; i++) {

            cekilenSayi = (int) (Math.random() * (max - min + 1) + min);

            // Cekilen sayi dizi icerisinde varsa, yeni bir sayi cek
            while(dizi.contains(cekilenSayi)) {
                cekilenSayi = (int) (Math.random() * (max - min + 1) + min);
            }

            // Cekilen sayiyi diziye ekle
            dizi.add(cekilenSayi);
        }

        // Dizi elemanlarini kucukten buyuge siralar
        Collections.sort(dizi);

        System.out.println(dizi);
    }
}
