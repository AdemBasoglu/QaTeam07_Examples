public class C02_Gokdelen_Ornegi {
    public static void main(String[] args) {

        String cati1  = "   ╔===╦";
        String cati2  = "╔==╩   ╩==╦";
        String kat    = "╟ █  █  █ ╟";
        String zemin1 = "╟   ███   ╟";
        String zemin2 = "▀▀▀▀▀▀▀▀▀▀▀";

        int katSayisi = 10;

        for(int i = 1; i <= katSayisi; i++) {

            if(i == 1) {
                System.out.println(cati1);
                System.out.println(cati2);
            }

            System.out.println(kat);

            if(i == katSayisi) {
                System.out.println(zemin1);
                System.out.println(zemin2);
            }
        }
    }
}
