package AlgoritmalarPdf;

import java.util.ArrayList;

public class EnBuyukUcDeger {
    public static void main(String[] args) {

        int enb1 = 0, enb2 = 0, enb3 = 0;
        int[] d = { 10, 4, 3, 5, 2, 9 };
        ArrayList<Integer> liste = new ArrayList<>();

        // dizi degerleri listeye eklendi
        for (int i = 0; i < d.length; i++) {
            liste.add(d[i]);
        }

        // listenin ilk hali
        System.out.println("listenin ilk hali ");
        System.out.println(liste);
        System.out.println();

        // ----------------------------------------------------------------------------------------------
        // listede enb1 degeri bulundu
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) > enb1) {
                enb1 = liste.get(i);

            }

        }
        // liste içinde enb1 degerini barındırmaycak sekilde guncellendi
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) == enb1) {
                liste.remove(i);
            }
        }

        // liste elemanlarının ilk guncel hali yazdırılıyor
        System.out.println("liste degerleri 1. yazilma ");
        System.out.println(liste);
        System.out.println();
        // ----------------------------------------------------------------------------------------------------------

        // ------------------------------------------------------------------------------------------------------------
        // listede enb2 eleman blundu
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) > enb2) {
                enb2 = liste.get(i);
            }
        }

        // listede enb2 degeri olmaycak sekilde liste guncellendi
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) == enb2) {
                liste.remove(i);
            }
        }

        // listenin 2.guncel hali yazdırıldı
        System.out.println("liste degerleri 2.yazilma ");
        System.out.println(liste);
        System.out.println();
        // ----------------------------------------------------------------------------------

        // --------------------------------------------------------------------------------------
        // listenin son halinde enb3 degeri bulundu
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) > enb3) {
                enb3 = liste.get(i);
            }
        }

        // --------------------------------------------------------------------------------------

        System.out.println(enb1 + " " + enb2 + " " + enb3);

    }
}
