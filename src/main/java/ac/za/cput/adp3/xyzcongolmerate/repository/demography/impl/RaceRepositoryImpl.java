package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    private Set<Race> raceDB;
    private static RaceRepository raceRepository = null;

    private RaceRepositoryImpl() {
        this.raceDB = new HashSet<>();
    }

    public static RaceRepository getRaceRepository() {
        if (raceRepository == null) raceRepository = new RaceRepositoryImpl();
        return raceRepository;
    }

    private Race findRace(String raceId){
        return this.raceDB.stream()
                .filter(race -> race.getRaceId().trim().equalsIgnoreCase(raceId))
                .findAny()
                .orElse(null);
    }

    public Race create(Race race) {
        this.raceDB.add(race);
        return race;
    }


    public Race read(String raceId) {
        Race race = findRace(raceId);
        return race;
    }

    //TODO: Implement body
    @Override
    public Race update(Race race) {
        Race toDelete = findRace(race.getRaceId());
        if (toDelete != null){
            this.raceDB.remove(toDelete);
            return create(race);
        }
        return null;
    }

    //TODO: Implement body
    @Override
    public void delete(String raceId) {
        Race race = findRace(raceId);
        if (race != null)
            this.raceDB.remove(race);
    }

    //TODO: Implement body
    @Override
    public Set<Race> getAll() {
        return this.raceDB;
    }
}
