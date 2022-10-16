package ekim16;

public class C03_Polindrome {
    public static void main(String[] args) {

        int sayi = 1221;
        int sayininOrtasi;
        String sayininIlkYarisi;
        String sayininSonYarisi;
        String sayininSonYarisiTers = "";
        String strSayi = String.valueOf(sayi);


        sayininIlkYarisi = (strSayi.substring(0, strSayi.length()/2));
        sayininSonYarisi = (strSayi.substring(strSayi.length() /2 ));

        for (int i = sayininSonYarisi.length()-1; i >=0 ; i--) {
            sayininSonYarisiTers += sayininSonYarisi.charAt(i);
        }

        if(sayininIlkYarisi.equals(sayininSonYarisiTers)) {
            System.out.println("Bu sayi bir polindrome sayidir.");
        } else {
            System.out.println("Bu sayi bir polindrome sayi degildir!");
        }
    }
}
