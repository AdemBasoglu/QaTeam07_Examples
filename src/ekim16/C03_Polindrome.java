package ekim16;

public class C03_Polindrome {
    public static void main(String[] args) {

        int sayi = 12321;

        String strSayi = String.valueOf(sayi);
        String sayininIlkYarisi;
        String sayininSonYarisi;
        String sayininSonYarisiTers = "";

        sayininIlkYarisi = strSayi.substring(0, strSayi.length()/2);
        
        if(strSayi.length() % 2 != 0) {
            sayininSonYarisi = strSayi.substring((strSayi.length()+1)/2);
        } else {
            sayininSonYarisi = strSayi.substring(strSayi.length()/2);
        }

        for (int i = sayininSonYarisi.length()-1; i >= 0 ; i--) {
            sayininSonYarisiTers += sayininSonYarisi.charAt(i);
        }

        if(sayininIlkYarisi.equals(sayininSonYarisiTers)) {
            System.out.printf("%d bir polindrome sayidir.", sayi);
        } else {
            System.out.printf("%d bir polindrome degildir sayidir.", sayi);
        }
    }
}
