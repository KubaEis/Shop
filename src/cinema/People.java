package cinema;

public class People {
    private Gender pohlavi;
    private String jmeno;
    private String rodneMesto;
    People(String jmeno, String rodneMesto, Gender pohlavi) {
        this.jmeno = jmeno;
        this.rodneMesto = rodneMesto;
        this.pohlavi = pohlavi;
    }
    public String printInfo(){
        return jmeno+" - "+pohlavi;
    }
}
