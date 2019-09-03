package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.factory.demography.RaceFactory;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.RaceRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceRepositoryImplTest {

    private Race race = RaceFactory.buildRace("Black");
    private RaceRepository repository = RaceRepositoryImpl.getRaceRepository();
    @Test
    public void a_create() {
        assertEquals(repository.create(race),repository.create(race));
    }

    @Test
    public void b_read() {
        assertEquals(repository.read(race.getRaceId()),repository.read(race.getRaceId()));
    }

    @Test
    public void c_update() {
        assertEquals(repository.update(race),repository.update(race));
    }

    @Test
    public void e_delete() {
        repository.delete(race.getRaceId());
    }

    @Test
    public void d_getAll() {
        assertEquals(repository.getAll(),repository.getAll());
    }
}