import Components.FuelEngine;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Tyres tyres1;
    Tyres tyres2;
    FuelEngine engine1;
    FuelEngine engine2;

    @Before
    public void before(){
        tyres1 = new Tyres("Offroad", "4");
        tyres2 = new Tyres("Racing", "4");
        engine1 = new FuelEngine("400");
        engine2 = new FuelEngine("600");
        car = new Car("Ford", "blue", 15000, 5, tyres1, engine1);
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres1, car.getTyres());
    }
    
    @Test
    public void canSetTyres(){
        car.setTyres(tyres2);
        assertEquals(tyres2, car.getTyres());
    }
    
    @Test
    public void canGetEngine(){
        assertEquals(engine1, car.getEngine());
    }
    
    @Test
    public void canSetEngine(){
        car.setEngine(engine2);
        assertEquals(engine2, car.getEngine());
    }
}
