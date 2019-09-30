package staffTest.ManagementTests;

import org.junit.Before;
import org.junit.Test;
import staff.Management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTests {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Philip Broyles", "pp110011p", 30000.00, "Labs", 100000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Philip Broyles", director.getName());
    }

    @Test
    public void canChangeName(){
        director.setName("Lincoln Lee");
        assertEquals("Lincoln Lee", director.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("pp110011p", director.getNatInsurance());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000.00);
        assertEquals(31000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(600.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Labs", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000.00, director.getBudget(), 0.01);
    }
}

