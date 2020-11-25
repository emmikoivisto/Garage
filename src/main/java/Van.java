import Components.Tyres;
import Components.FuelEngine;

public class Van {

    private Tyres tyres;
    private FuelEngine fuelEngine;

    public Van(Tyres tyres, FuelEngine fuelEngine) {
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
