package autosaloon;

import library.IItem;

import java.util.Scanner;

public class Magazine implements IItem {
    Scanner sc = new Scanner(System.in);
    private String nazevM;
    private String jmenoRedakce;
    private int pocetStranM;
    public Magazine() {
        System.out.println("Jaký má magazín název?");
        String naz = sc.nextLine();
        System.out.println("Jaké je jméno redakce magazínu?");
        String jme = sc.nextLine();
        System.out.println("Kolik má magazín stran?");
        int poc = sc.nextInt();
        sc.nextLine();
        this.nazevM = naz;
        this.jmenoRedakce = jme;
        this.pocetStranM = poc;
    }
    @Override
    public void printInfo(){
        System.out.println("Magazín s názvem "+nazevM+" má "+pocetStranM+" stran a napsal ji "+jmenoRedakce+".");
    }
    public void printDelka(){
        System.out.println("Magazín má "+pocetStranM+" stran");
    }
}
