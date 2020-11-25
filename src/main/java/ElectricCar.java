import Components.ElectricEngine;
import Components.FuelEngine;
import Components.Tyres;

public class ElectricCar extends Vehicle{

    private Tyres tyres;
    private ElectricEngine electricEngine;

    public ElectricCar(String model, String color, int price, int capacity, Tyres tyres, ElectricEngine electricEngine) {
        super(model, color, price, capacity);
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
