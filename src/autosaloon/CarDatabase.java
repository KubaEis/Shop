package autosaloon;

import java.util.Scanner;

public class CarDatabase {
    Scanner sc = new Scanner(System.in);

    String owner;
    Car[] cars;
    public CarDatabase(String owner) {
        this.owner = owner;
    }


    /**
     * Metoda se zepta uzivatele na informace k pozadovanemu poctu aut. A ty prida do pole aut.
     * @param count - pozadovany pocet aut
     */
    public void addCars(int count) {
        cars = new Car[count];
        for (int i=0;i<count; i++){
            System.out.println("Jaký má auto rok výroby?");
            int rok = sc.nextInt();
            sc.nextLine();
            System.out.println("Kolik má auto najetých km?");
            int najete = sc.nextInt();
            sc.nextLine();
            System.out.println("Jakou má auto barvu?");
            String barva = sc.nextLine();
            System.out.println("Jaký má auto stav? (excellent, good, bad, damaged");
            String stav = sc.nextLine().toLowerCase();
            Condition kondice = Condition.valueOf(stav);

            Car c = new Car(rok, najete, barva, kondice);
            cars[i] = c;

            //nacti od uzivatele rok vyroby, pocet najetych km, barvu a stav auta
            //vytvor instanci auta - nutno upravit i tridu Car, chceme instanci nastavit atributy na nactene hodnoty od uzivatele
            //pridej auto do pole aut
        }

    }

    /**
     * Vypise vsechna auta, jejijz stav je "good". Vypis bude ve formatu: Na prvnim radku bude vypis: Dobra auta jsou: .
     * Na kazdem dalsim radku bude vypis informaci o jednom aute - pouzij mezodu printInfo() tridy Car
     */
    public void printCarInGoodCondition(){
        System.out.println("Auta se stavem 'good' jsou: ");
        for (int i=0; i<cars.length; i++){
            if(cars[i].getCondition()==Condition.good){
                System.out.println(cars[i].printInfo());
            }
        }
    }
    public void printCarWithMostDrivenKm(){
        int nejvice = 0;
        int nejviceNajete = 0;
        for (int i=0; i<cars.length; i++){
            if(cars[i].getNajeteKylometry()>nejviceNajete){
                nejvice = i;
                nejviceNajete = cars[i].getNajeteKylometry();
            }
        }
        System.out.println("Auto s nejvíce najetými km je auto s barvou: "+cars[nejvice].getBarva()+" a najelo "+nejviceNajete+" km");
    }
    public void printInterestingThings(){
        System.out.println("Počet aut je: "+cars.length);
        System.out.println("Jméno majitele obchodu: "+owner);
        System.out.println("Počet znaků tohoto jména je: "+owner.length());
        boolean damage = false;
        for(int i=0; i<cars.length; i++){
            if(cars[i].getCondition()==Condition.damaged){
                damage = true;
            }
        }
        if(damage){
            System.out.println("Nejméně jedno z aut je ve stavu 'damaged'");
        }

    }
    public String getOwner(){
        return owner;
    }


}
