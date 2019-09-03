package ac.za.cput.adp3.xyzcongolmerate.repository.org.impl;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.repository.org.OrganisationRepository;

import java.util.HashSet;
import java.util.Set;

public class OrganisationRepositoryImpl implements OrganisationRepository {

    private Set<Organisation> organisationDB;
    private static OrganisationRepository organisationRepository = null;

    private OrganisationRepositoryImpl() {
        this.organisationDB = new HashSet<>();
    }

    public static OrganisationRepository getOrganisationRepository() {
        if (organisationRepository == null) organisationRepository = new OrganisationRepositoryImpl();
        return organisationRepository;
    }

    private Organisation findOrg(String orgCode){
        return this.organisationDB.stream()
                .filter(organisation -> organisation.getOrgCode().trim().equalsIgnoreCase(orgCode))
                .findAny()
                .orElse(null);
    }
    @Override
    public Organisation create(Organisation organisation) {
        this.organisationDB.add(organisation);
        return organisation;
    }


    @Override
    public Organisation read(String orgCode) {
        Organisation organisation = findOrg(orgCode);
        return organisation;
    }


    @Override
    public Organisation update(Organisation organisation) {
        Organisation toDelete = findOrg(organisation.getOrgCode());
        if (toDelete != null){
            this.organisationDB.remove(toDelete);
            return create(organisation);
        }
        return null;
    }


    @Override
    public void delete(String orgCode) {
        Organisation organisation = findOrg(orgCode);
        if (organisation != null)this.organisationDB.remove(organisation);
    }


    @Override
    public Set<Organisation> getAll() {
        return this.organisationDB;
    }
}
