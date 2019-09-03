package ac.za.cput.adp3.xyzcongolmerate.repository.misc.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.factory.misc.RoleFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl.RaceRepositoryImpl;
import ac.za.cput.adp3.xyzcongolmerate.repository.misc.RoleRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleRepositoryImplTest {

    private Role role = RoleFactory.buildRole("Cashier");
    private RoleRepository repository = RoleRepositoryImpl.getRoleRepository();
    @Test
    public void a_create() {

    }

    @Test
    public void b_read() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Test
    public void c_update() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Test
    public void e_delete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Test
    public void d_getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}