package app;

public class KartyaKeveres {
    static String[] pakli = new String[22];

    public static void main() {
        feltolt();
        
        for (int i = 0; i < 3; i++) {
            kirak(); //1 tömb
            melyik(); //scanner
            kever(); //középre
        }
        
        ezVolt(); //11., az az a középső lesz
    }
    
    public static void feltolt() {
        String[] kartya={"Ász", "Király", "Felső", "Alsó", "X", "IX"};
        String[] szin={"P", "T", "Z", "M"};
        
        int db = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (db <21) {
                    
                }
            }
        }
    }

    private static void kirak() {
        
    }

    private static void melyik() {
        
    }

    private static void kever() {
       
    }

    private static void ezVolt() {
    
    }
    
}
