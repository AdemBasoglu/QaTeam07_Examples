package ekim09;

public class C01_for_dongusu {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirin
            //        01234567..........18
        String str = "Burasi baska bir cumle ve ne oldugunun önemi yok."; // => 19

        // Metni ters yazdirir
        for(int i = str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();

        // Metni duz yazdirir fakat aralarina tire koyar.
        for(int i = 0; i <= str.length()-1; i++) {
            System.out.print(str.charAt(i) +  " - ");
        }

        System.out.println();




    }
}
