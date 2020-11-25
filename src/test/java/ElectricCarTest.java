import Components.ElectricEngine;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Tyres tyres1;
    Tyres tyres2;
    ElectricEngine electricEngine1;
    ElectricEngine electricEngine2;

    @Before
    public void before(){
        tyres1 = new Tyres("Offroad", "4");
        tyres2 = new Tyres("Racing", "4");
        electricEngine1 = new ElectricEngine("400", "500");
        electricEngine2 = new ElectricEngine("900", "1500");
        electricCar = new ElectricCar("Honda", "Green", 30000, 5, tyres1, electricEngine1);
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres1, electricCar.getTyres());
    }

    @Test
    public void canSetTyres(){
        electricCar.setTyres(tyres2);
        assertEquals(tyres2, electricCar.getTyres());
    }

    @Test
    public void canGetEngine(){
        assertEquals(electricEngine1, electricCar.getElectricEngine());
    }

    @Test
    public void canSetEngine(){
        electricCar.setElectricEngine(electricEngine2);
        assertEquals(electricEngine2, electricCar.getElectricEngine());
    }

}
