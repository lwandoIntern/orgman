package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {

    private Gender gender = GenderFactory.buildGender("Male");
    private GenderRepository repository = GenderRepositoryImpl.genderRepository();
    @Test
    public void a_create() {
        assertEquals(repository.create(gender),repository.create(gender));
    }

    @Test
    public void b_read() {
        assertEquals(repository.read(gender.getGenderId()),repository.read(gender.getGenderId()));
    }

    @Test
    public void c_update() {
        assertEquals(repository.update(gender),repository.update(gender));
    }

    @Test
    public void e_delete() {
        repository.delete(gender.getGenderId());
    }

    @Test
    public void d_getAll() {
        assertEquals(repository.getAll(),repository.getAll());
    }
}