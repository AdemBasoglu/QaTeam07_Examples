package ekim16;

public class C03_Polindrome {
    public static void main(String[] args) {

        int sayi = 12321;
        int sayininOrtasi;
        String sayininIlkYarisi = "";
        String sayininSonYarisi = "";

        String strSayi = String.valueOf(sayi);

        if(strSayi.length() % 2 != 0) {
            sayininOrtasi = (int)(strSayi.length()+1)/2;
        } else {
            int sayininOrtasiIndex = (strSayi.length() / 2);
            strSayi = strSayi.substring(0,sayininOrtasiIndex) + 'l' + strSayi.substring(sayininOrtasiIndex);
        }

        for (int i = strSayi.length()-1; i >= 0 ; i--) {
            if(strSayi.charAt(i) == 'l') {
                break;
            }
            sayininIlkYarisi += strSayi.charAt(i);
        }

        for (int i = 0; i < strSayi.length(); i++) {
            if(strSayi.charAt(i) == 'l') {
                break;
            }
            sayininSonYarisi += strSayi.charAt(i);
        }

        if(sayininIlkYarisi.equals(sayininSonYarisi)) {
            System.out.println("Bu sayi bir polindrome sayidir.");
        } else {
            System.out.println("Bu sayi bir polindrome sayi degildir!");
        }
    }
}
