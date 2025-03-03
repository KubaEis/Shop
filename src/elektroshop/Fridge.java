package elektroshop;

public class Fridge {
    private ElectricityUse electricityUse;
    private String znacka;
    private String model;
    private int rokVyroby;

    Fridge(ElectricityUse electricityUse, String znacka, String model, int rokVyroby){
        this.electricityUse = electricityUse;
        this.znacka = znacka;
        this.model = model;
        this.rokVyroby = rokVyroby;
    }

    public void printInfo(){
        String el = " ";
        if(electricityUse.equals(ElectricityUse.A)){
            el = "very low";
        }
        if(electricityUse.equals(ElectricityUse.B)){
            el = "low";
        }
        if(electricityUse.equals(ElectricityUse.C)){
            el = "normal";
        }
        if(electricityUse.equals(ElectricityUse.D)){
            el = "above normal";
        }if(electricityUse.equals(ElectricityUse.E)){
            el = "high";
        }
        if(electricityUse.equals(ElectricityUse.F)){
            el = "very high";
        }if(electricityUse.equals(ElectricityUse.G)){
            el = "extreamly high";
        }
        System.out.println(rokVyroby+": "+el);
    }

    public String getZnacka() {
        return znacka;
    }

    public ElectricityUse getElectricityUse() {
        return electricityUse;
    }

    public String getModel() {
        return model;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }
}
