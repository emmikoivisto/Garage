package Components;

public class ElectricEngine {
    private String charge;
    private String range;

    public ElectricEngine(String charge, String range){
    this.charge = charge;
    this.range = range;
    }


    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
