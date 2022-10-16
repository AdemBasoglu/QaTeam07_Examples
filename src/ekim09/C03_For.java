package ekim09;

public class C03_For {
    public static void main(String[] args) {

        /*

        int toplamPostSayisi = 125;
        int sayfaBasina = 10;
        int sayfaSayisi = 0;

        for(int i = 1; i <= (toplamPostSayisi / sayfaBasina); i++) {
            if(toplamPostSayisi % sayfaBasina != 0) {
                sayfaSayisi = i + 1;
            } else {
                sayfaSayisi = i;
            }
            System.out.print(i +  " - ");
        }

        if((toplamPostSayisi % sayfaBasina != 0)) {
            System.out.println(sayfaSayisi);
        }

        */

        int toplamPostSayisi= 121;
        int sayfaBasinaKacAdetPostGosterilecek=10;
        int kacsayfa=1;

        for (int i = 1; i <=(toplamPostSayisi/sayfaBasinaKacAdetPostGosterilecek) ; i++) {
            if (toplamPostSayisi%sayfaBasinaKacAdetPostGosterilecek!=0){
                kacsayfa=i+1;
            }else{
                kacsayfa=i;
            }
            System.out.print(kacsayfa+" ");
        }





    }
}
