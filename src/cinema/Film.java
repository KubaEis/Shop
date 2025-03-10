package cinema;

import java.util.Scanner;

public class Film {
    Scanner sc = new Scanner(System.in);

    private String name;
    private int year;
    private People[] actors;

    private People director;


    public Film(String name, int year) {
        this.name = name;
        this.year = year;
    }


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu hercu. A ty prida do pole actors.
     * @param count - pozadovany pocet hercu
     */


    public void addActors(int count) {
        actors = new People[count];
        for (int i=0; i<count; i++){
            System.out.println("Herec/Herečka "+(i+1)+".");
            System.out.println("Jaký ma herec/herečka gender(pohlaví)?  (muz, zena)");
            String ge = sc.nextLine().toLowerCase();
            Gender g = Gender.valueOf(ge);
            if (g == (Gender.muz)){
                System.out.println("Jak se herec jmenuje?");
                String jm = sc.nextLine();
                System.out.println("Jaké je jeho rodné město?");
                String rm = sc.nextLine();
                People p = new People(jm,rm,g);
                actors[i] = p;
            }else if (g == (Gender.zena)){
                System.out.println("Jak se herečka jmenuje?");
                String jm = sc.nextLine();
                System.out.println("Jaké je její rodné město?");
                String rm = sc.nextLine();
                People p = new People(jm,rm,g);
                actors[i] = p;
            }
            //nacti od uzivatele jmeno, rodne mesto a pohlavi herce
            //pridej herce do pole hercu
        }

    }

    /**
     * Tato metoda vypise informace o filmu. Na prvnim rádku bude text "-----INFO O FILMU----- ", na druhem bude nazev, rok vydani filmu.
     * Na tretim radku bude text "herci" a následne budou vypsani vsichni herci oddeleni od sebe carkou a to ve formatu "jmeno - pohlavi" (Vyuzijte metodu printInfo() tridy People.)
     * Na poslednim radku bude text "-----".
     */


    public void printInfo(){
        System.out.println("-----INFO O FILMU-----");
        System.out.println("Název: " + name+" Rok výdání: " + year);
        System.out.println("Herci: ");
        for (int i=0; i<actors.length; i++){
            if(i==actors.length-1){
                System.out.print(actors[i].printInfo()+"\n");
            }else{
                System.out.print(actors[i].printInfo()+", ");
            }
        }
        System.out.println("-----");
    }


    public void actorCount(){
        System.out.println("Počet herců je: " + actors.length);
    }
}
