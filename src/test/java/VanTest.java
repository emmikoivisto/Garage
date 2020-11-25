import Components.FuelEngine;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VanTest {

    Van van;
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
        van = new Van("Audi", "green", 20000, 3, tyres1, engine1);
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres1, van.getTyres());
    }

    @Test
    public void canSetTyres(){
        van.setTyres(tyres2);
        assertEquals(tyres2, van.getTyres());
    }

    @Test
    public void canGetEngine(){
        assertEquals(engine1, van.getEngine());
    }

    @Test
    public void canSetEngine(){
        van.setEngine(engine2);
        assertEquals(engine2, van.getEngine());
    }
}