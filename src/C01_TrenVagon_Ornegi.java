public class C01_TrenVagon_Ornegi {
    public static void main(String[] args) {
        String tren1 = "   ╔══════════════╦";
        String tren2 = "═╔═┘ - T C D D -  ╚═══╦";
        String tren3 = " ╚═══ÔÔÔ═══════ÔÔÔ════╩";


        String vagon1 = "╔═══════════════════╦ ";
        String vagon2 = "|██  ██  ██  ██  ██ ╠═";
        String vagon3 = "╚═══ÔÔ════ÔÔ═══ÔÔ═══┘ ";

        int kacDefa = 3;

        for(int i = 1; i <= kacDefa; i++) {
            System.out.print(vagon1);
            if(i == kacDefa) System.out.println(tren1);
        }

        for(int i = 1; i <= kacDefa; i++) {
            System.out.print(vagon2);
            if(i == kacDefa) System.out.println(tren2);
        }

        for(int i = 1; i <= kacDefa; i++) {
            System.out.print(vagon3);
            if(i == kacDefa) System.out.println(tren3);
        }
    }
}
