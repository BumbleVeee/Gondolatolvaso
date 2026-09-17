package app;

import java.util.Scanner;

public class KartyaKeveres {
    static String[] pakli = new String[22];//index 0-21
    static Scanner obj = new Scanner(System.in);
    static String[] kevert = new String[22];

    public static void main(String[] args) {
        feltolt(); //feltölti a paklit 21 kártyával
        
        for (int i = 0; i < 3; i++) {
            kirak(); //1 tömb 3x7 kártya
            int oszlop = melyik(); //scanner melyik
            kever(oszlop); //középre
        }
        
        ezVolt(); //11., az az a középső lesz
    }
    
    public static String[] feltolt() {
        String[] kartya={"Ász", "Király", "Felső", "Alsó", "X", "IX"};
        String[] szin={"P", "T", "Z", "M"};
        
        int db = 0;
        for (int i = 0; i < kartya.length; i++) {
            for (int j = 0; j < szin.length; j++) {
                if (db < 21) {
                    pakli[++db] = szin[j] + kartya[i];
                }
            }
        }
        return pakli;
    }

    private static void kirak() {
        System.out.println(String.format("%-12s %-12s %-12s","1.oszlop","2.oszlop","3.oszlop"));
        // %-12s balra zárt 12 karakter széles
        System.out.println("-----------------------------------");
        //loop 7x
        for (int i = 0; i < 7; i++) {
             
            System.out.printf("%-12s %-12s %-12s%n",
            // %-12s balra zárt 12 karakter széles és sortörés van a végén
            // kartya pakli 1: 1,4,7,10,13,16,19
                pakli[i * 3 + 1],
            // kartya pakli 2: 2,5,8,11,14,17,20 
                pakli[i * 3 + 2],
            // kartya pakli 3: 3,5,9,12,15,18,21 
                pakli[i * 3 + 3]);
        }
        System.out.println();
    }

    private static int melyik() {
        System.out.println("Melyik oszlopban van a kártyád? (1/2/3)");
        int oszlop = obj.nextInt();
        while(oszlop < 1 || oszlop > 3){
            System.out.printf("\nHiba! Nincs ilyen oszlop.");
            System.out.println("\n\nMelyik oszlopban van a kártyád? (1/2/3)");
            oszlop = obj.nextInt();
        }
        System.out.println();
        return oszlop;
    }

    private static void kever(int oszlop) {
        String[] regiPak = new String[22];
        for (int i = 1; i <= 21; i++) {
            regiPak[i] = pakli[i];
        }
    
        switch(oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    pakli[i]    = regiPak[20-(i-1)*3];
                    pakli[i+7]  = regiPak[19-(i-1)*3];
                    pakli[i+14] = regiPak[21-(i-1)*3];
                }
                break;
            
            case 2:
                for (int i = 1; i <= 7; i++) {
                    pakli[i]    = regiPak[19-(i-1)*3];
                    pakli[i+7]  = regiPak[20-(i-1)*3];
                    pakli[i+14] = regiPak[21-(i-1)*3];
                }
                break;
            
            case 3:
                for (int i = 1; i <= 7; i++) {
                    pakli[i]    = regiPak[19-(i-1)*3];
                    pakli[i+7]  = regiPak[21-(i-1)*3];
                    pakli[i+14] = regiPak[20-(i-1)*3];
                }
            break;
        }
    }

    private static void ezVolt() {
        System.out.println("A kártyád: " + pakli[11]);
    }
    
}
