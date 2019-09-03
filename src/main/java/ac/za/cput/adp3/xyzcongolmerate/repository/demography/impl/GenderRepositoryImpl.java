package ac.za.cput.adp3.xyzcongolmerate.repository.demography.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepository genderRepository = null;
    private Set<Gender> genderDB;

    private GenderRepositoryImpl() {
        this.genderDB = new HashSet<>();
    }

    public static GenderRepository genderRepository() {
        if (genderRepository == null) genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }

    private Gender findGender(String genderId){
        return this.genderDB.stream()
                .filter(gender -> gender.getGenderId().trim().equalsIgnoreCase(genderId))
                .findAny()
                .orElse(null);
    }
    public Gender create(Gender gender) {
        this.genderDB.add(gender);
        return gender;
    }

    @Override
    public Gender read(String genderId) {
        Gender gender = findGender(genderId);
        return gender;
    }
    @Override
    public Gender update(Gender gender) {
        Gender toDelete = findGender(gender.getGenderId());
        if (toDelete != null){
            this.genderDB.remove(gender);
            return create(gender);
        }
        return null;
    }


    @Override
    public void delete(String genderId) {
        Gender gender = findGender(genderId);
        if (gender != null)this.genderDB.remove(gender);
    }

    //TODO: Implement body
    @Override
    public Set<Gender> getAll() {
        return this.genderDB;
    }
}
