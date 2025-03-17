package library;

import java.util.Scanner;

public class Book implements IItem{
    Scanner sc = new Scanner(System.in);
    private String nazev;
    private String jmenoAutora;
    private int pocetStran;
    Book(){
        System.out.println("Jaký má kniha název?");
        String naz = sc.nextLine();
        System.out.println("Jaké je jméno autora knihy?");
        String jme = sc.nextLine();
        System.out.println("Kolik má kniha stran?");
        int poc = sc.nextInt();
        sc.nextLine();
        this.nazev = naz;
        this.jmenoAutora = jme;
        this.pocetStran = poc;
    }
    public void printInfo(){
        System.out.println("Kniha s názvem "+nazev+" má "+pocetStran+" stran a napsal ji "+jmenoAutora+".");
    }
    public void printDelka(){
        System.out.println("Kniha má "+pocetStran+" stran");
    }

}
