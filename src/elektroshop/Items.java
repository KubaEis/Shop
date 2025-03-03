package elektroshop;

import java.util.Scanner;

public class Items {
    Scanner sc = new Scanner(System.in);
    private Fridge[] items;


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu ledniček. A ty prida do pole items.
     * @param count - pozadovany pocet lednicek
     */
    public void addItems(int count) {
      items = new Fridge[count];
        for (int i=0; i<count; count++){
            System.out.println("Lednice "+count+".");
            System.out.println("Jakou má lednice elektrickou náročnost? (zapiš jen znak)" +
                                                                        "(A – very low\n" +
                                                                        "B – low\n" +
                                                                        "C – normal\n" +
                                                                        "D – above normal\n" +
                                                                        "E – high\n" +
                                                                        "F – very high\n" +
                                                                        "G – extremely high)");
            String elnaro = sc.nextLine();
            ElectricityUse narocnost = ElectricityUse.valueOf(elnaro);
            System.out.println("Jakou má ladnice znacku?");
            String znacka = sc.nextLine();
            System.out.println("Jaký má lednice model?");
            String model = sc.nextLine();
            System.out.println("Jaký má lednice rok výroby?");
            int rok = sc.nextInt();
            sc.nextLine();
            Fridge f = new Fridge(narocnost,znacka,model,rok);
        }

    }


    /**
     * Tato metoda vypise informace o lednickach. Na prvnim rádku bude text "-----INFO O LEDNICKACH----- ",
     * na dalsich radkach bude vzdy rok vyroby lednick, dvojtecka a popis spotreby. (Vyuzijte metodu printInfo() tridy Fridge.)
     * Na poslednim radku bude text "-----".
     */
    public void printInfo(){
        System.out.println("-----INFO O LEDNICKACH----- ");
        for (int i=0; i<items.length; i++){
            System.out.println("Lednice "+i+".");
            items[i].printInfo();
        }
        System.out.println("----- ");
    }
    public void printFridgeWithA(){
        System.out.println("Lednice s energickou náročností A");
        for (int i=0; i<items.length; i++){
            if (items[i].getElectricityUse().equals(ElectricityUse.A)){
                items[i].printInfo();
            }
        }
    }
    public void printFridgeCount(){
        System.out.println("Počet ledniček: "+items.length);
    }
    public void printInterestingThings(){
        int pocetA=0;
        int pocetB=0;
        int pocetC=0;
        int pocetD=0;
        int pocetE=0;
        int pocetF=0;
        int pocetG=0;
        for (int i=0; i<items.length; i++){
            if (items[i].getElectricityUse().equals(ElectricityUse.A)){
                pocetA ++;
            }
        }
        for (int i=0; i<items.length; i++){
            if (items[i].getElectricityUse().equals(ElectricityUse.B)){
                pocetB ++;
            }
        }
        for (int i=0; i<items.length; i++){
            if (items[i].getElectricityUse().equals(ElectricityUse.C)){
                pocetC ++;
            }
        }
        for (int i=0; i<items.length; i++){
            if (items[i].getElectricityUse().equals(ElectricityUse.D)){
                pocetD ++;
            }
        }
        for (int i=0; i<items.length; i++){
            if (items[i].getElectricityUse().equals(ElectricityUse.E)){
                pocetE ++;
            }
        }
        for (int i=0; i<items.length; i++){
            if (items[i].getElectricityUse().equals(ElectricityUse.F)){
                pocetF ++;
            }
        }
        for (int i=0; i<items.length; i++){
            if (items[i].getElectricityUse().equals(ElectricityUse.G)){
                pocetG ++;
            }
        }
        System.out.println("Pocet A – very low: "+pocetA);
        System.out.println("Pocet B – low: "+pocetB);
        System.out.println("Pocet C – normal: "+pocetC);
        System.out.println("Pocet D – above normal: "+pocetD);
        System.out.println("Pocet E – high: "+pocetE);
        System.out.println("Pocet F – very high: "+pocetF);
        System.out.println("Pocet G – extremely high: "+pocetG);
    }
}
