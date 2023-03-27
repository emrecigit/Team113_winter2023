package day12_forLoops;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class C01_DikkatEdilecekler {
    public static void main(String[] args) {

        for (int i = 20; i <10 ; i++) {
            System.out.print(i + " ");
        }
        // for loop calisti, ancak ilk deger icin bitis sarti false verdiginden
        // loop body'si HIC DEVREYE GIRMEDI
        //for (int i = 0; i <10 ; i--) { // Calistirma
        //    System.out.print(i + " "); // Calistirma
        }
        // loop basladiktan sonra artis/azalis yontemi sebebiyle
        // bitis degerinden uzaklasiyorsa, loop teorik olarak sonsuza kadar calisir
        // buna Sonsuz Loop denir
    }
