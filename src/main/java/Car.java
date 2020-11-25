import Components.FuelEngine;
import Components.Tyres;
import Components.FuelEngine;

public class Car extends Vehicle{

    private Tyres tyres;
    private FuelEngine fuelEngine;

    public Car(String model, String color, int price, int capacity, Tyres tyres, FuelEngine fuelEngine) {
        super(model, color, price, capacity);
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
