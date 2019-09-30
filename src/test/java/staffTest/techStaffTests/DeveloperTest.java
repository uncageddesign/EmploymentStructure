package staffTest.techStaffTests;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Olivia Dunham", "dd110011d", 24000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Olivia Dunham", developer.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("dd110011d", developer.getNatInsurance());
    }

    @Test
    public void hasSalary(){
        assertEquals(24000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(25000.00, developer.raiseSalary(1000.00), 0.01);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(240.00, developer.payBonus(0.01), 0.01);
    }

}
