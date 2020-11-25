import Components.FuelEngine;
import Components.Tyres;
import Components.FuelEngine;

public class Car {

    private Tyres tyres;
    private FuelEngine fuelEngine;

    public Car(Tyres tyres, FuelEngine fuelEngine) {
        this.tyres = tyres;
        this.fuelEngine = fuelEngine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres newTyres) {
        this.tyres = newTyres;
    }

    public FuelEngine getEngine() {
        return fuelEngine;
    }

    public void setEngine(FuelEngine newEngine) {
        this.fuelEngine = newEngine;
    }
}
