package autosaloon;

public class Car {
    private int rokVyroby;
    private int najeteKylometry;
    private String barva;
    private Condition condition;
    public Car(int rokVyroby,int najeteKylometry, String barva, Condition condition) {
        this.rokVyroby = rokVyroby;
        this.najeteKylometry = najeteKylometry;
        this.barva = barva;
        this.condition = condition;
    }
    public String printInfo(){
        return "rok vyroby: "+rokVyroby+", najete kylometry: "+najeteKylometry+", barva: "+barva+", condition: "+condition;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public int getNajeteKylometry() {
        return najeteKylometry;
    }

    public String getBarva() {
        return barva;
    }

    public Condition getCondition() {
        return condition;
    }
}
