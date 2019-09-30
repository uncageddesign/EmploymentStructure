package staffTest.ManagementTests;
import org.junit.Before;
import org.junit.Test;
import staff.Management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Walter Bishop", "ww110011w", 25000.00, "Labs");
    }

    @Test
    public void hasName(){
        assertEquals("Walter Bishop", manager.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("ww110011w", manager.getNatInsurance());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(26000.00, manager.raiseSalary(1000.00), 0.01);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(250.00, manager.payBonus(0.01), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Labs", manager.getDeptName());
    }
}
