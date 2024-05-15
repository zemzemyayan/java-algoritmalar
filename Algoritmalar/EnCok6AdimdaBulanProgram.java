package AlgoritmalarPdf;

public class EnCok6AdimdaBulanProgram {
    public static void main(String[] args) {
        int deger = 46;
        int m = 6;
        int k = 1;
        int sayac = 0;
        int sayacs = 1;
        boolean state = false;
        boolean state2 = false;

        while (true) {

            sayac = 0;
            for (int i = k; i < 63; i++) {
                sayacs++;
                sayac++;
                if (sayac > 6)
                    break;

                if (i == deger) {
                    System.out.println("deger 6 adımın " + (sayacs - deger) + ".tekrarında bulundu");
                    state = true;
                }
                k++;
                if (state)
                    break;
                if (sayac > 6) {
                    break;
                }

            }

            if (state) {
                break;
            }

            m++;
            if (m > 12) {
                System.out.println("sayı 6 adımın " + (m - 6) + ".tekrarında bulundu ");
                break;
            }

        }

    }
}
