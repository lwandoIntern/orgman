package ac.za.cput.adp3.xyzcongolmerate.repository.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationUserRepository;

import java.util.HashSet;
import java.util.Set;

public class OrganisationUserRepositoryImpl implements OrganisationUserRepository {

    private Set<OrganisationUser> organisationUserDB;
    private static OrganisationUserRepository organisationUserRepository = null;

    private OrganisationUserRepositoryImpl() {
        this.organisationUserDB = new HashSet<>();
    }

    public static OrganisationUserRepository getOrganisationUserRepository() {
        if (organisationUserRepository == null) organisationUserRepository = new OrganisationUserRepositoryImpl();
        return organisationUserRepository;
    }

    private OrganisationUser findOrgUser(String orgCode,String userEmail){
        return this.organisationUserDB.stream()
                .filter(organisationUser -> organisationUser.getOrgCode().trim().equalsIgnoreCase(orgCode)
                        && organisationUser.getUserEmail().trim().equalsIgnoreCase(userEmail))
                .findAny()
                .orElse(null);
    }
    @Override
    public OrganisationUser create(OrganisationUser organisationUser) {
        this.organisationUserDB.add(organisationUser);
        return organisationUser;
    }


    @Override
    public OrganisationUser read(String orgCode, String userEmail) {
        OrganisationUser organisationUser = findOrgUser(orgCode,userEmail);
        return organisationUser;
    }


    @Override
    public OrganisationUser update(OrganisationUser organisationUser) {
        OrganisationUser toDelete = findOrgUser(organisationUser.getOrgCode(),organisationUser.getUserEmail());
        if (toDelete != null){
            this.organisationUserDB.remove(toDelete);
            return create(organisationUser);
        }
        return null;
    }


    @Override
    public void delete(String orgCode, String userEmail) {
        OrganisationUser organisationUser = findOrgUser(orgCode,userEmail);
        if (organisationUser != null)this.organisationUserDB.remove(organisationUser);
    }


    @Override
    public Set<OrganisationUser> getAll() {
        return this.organisationUserDB;
    }


}
