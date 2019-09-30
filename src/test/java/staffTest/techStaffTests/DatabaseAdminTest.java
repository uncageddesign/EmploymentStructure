package staffTest.techStaffTests;

import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Astrid Farnsworth", "aa110011a", 24000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Astrid Farnsworth", databaseAdmin.getName());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Charlie Francis");
        assertEquals("Charlie Francis", databaseAdmin.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("aa110011a", databaseAdmin.getNatInsurance());
    }

    @Test
    public void hasSalary(){
        assertEquals(24000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(240.00, databaseAdmin.payBonus(), 0.01);
    }

}
