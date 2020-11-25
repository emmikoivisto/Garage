import Components.ElectricEngine;
import Components.Tyres;

public class ElectricCar {

    private Tyres tyres;
    private ElectricEngine electricEngine;

    public ElectricCar(Tyres tyres, ElectricEngine electricEngine) {
        this.tyres = tyres;
        this.electricEngine = electricEngine;
    }


    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres newTyres) {
        this.tyres = newTyres;
    }

    public ElectricEngine getElectricEngine() {
        return electricEngine;
    }

    public void setElectricEngine(ElectricEngine newElectricEngine) {
        this.electricEngine = newElectricEngine;
    }
}
