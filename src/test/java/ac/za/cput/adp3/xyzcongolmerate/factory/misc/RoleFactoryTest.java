package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {


    @Test
    public void buildRole() {
        Role role = RoleFactory.buildRole("Supervisor");
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the RoleFactory class
         * 4. Assert that the id is generated.
         */
        assertEquals(role,role);
        assertNotNull(role.getRoleId());
    }
}