public class C02_TrenVagon_Ornegi {
    public static void main(String[] args) {
        String tren1 = "  ╔═══════════════╦";
        String tren2 = "═╔╩ - T C D D -   ╚══╦";
        String tren3 = " ╚═══ÔÔÔ═══════ÔÔÔ═══╩";


        String vagon1 = "╔═══════════════════╦ ";
        String vagon2 = "|██  ██  ██  ██  ██ ╠═";
        String vagon3 = "╚═══ÔÔ════ÔÔ═══ÔÔ═══╩ ";

        int kacAdet = 2;

        for (int i = 1; i <= kacAdet; i++) {

            for (int j = 1; j <= kacAdet; j++) {

                for (int k = 1; k <= kacAdet; k++) {
                    if(i == kacAdet) System.out.println(tren1);
                    System.out.print(vagon1);
                }
                if(i == kacAdet) System.out.println(tren2);
                System.out.print(vagon2);

            }
            if(i == kacAdet) System.out.println(tren3);
            System.out.print(vagon3);

        }

    }
}
