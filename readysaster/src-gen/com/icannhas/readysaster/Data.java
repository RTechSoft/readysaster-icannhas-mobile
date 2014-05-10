package com.icannhas.readysaster;

import com.icannhas.readysaster.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table DATA.
 */
public class Data {

    private Long id;
    private Long personal_id;
    private Long location_id;
    private Long structure_id;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient DataDao myDao;

    private PersonalDetails personalDetails;
    private Long personalDetails__resolvedKey;

    private Location location;
    private Long location__resolvedKey;

    private Structure structure;
    private Long structure__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Data() {
    }

    public Data(Long id) {
        this.id = id;
    }

    public Data(Long id, Long personal_id, Long location_id, Long structure_id) {
        this.id = id;
        this.personal_id = personal_id;
        this.location_id = location_id;
        this.structure_id = structure_id;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDataDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonal_id() {
        return personal_id;
    }

    public void setPersonal_id(Long personal_id) {
        this.personal_id = personal_id;
    }

    public Long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Long location_id) {
        this.location_id = location_id;
    }

    public Long getStructure_id() {
        return structure_id;
    }

    public void setStructure_id(Long structure_id) {
        this.structure_id = structure_id;
    }

    /** To-one relationship, resolved on first access. */
    public PersonalDetails getPersonalDetails() {
        Long __key = this.personal_id;
        if (personalDetails__resolvedKey == null || !personalDetails__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PersonalDetailsDao targetDao = daoSession.getPersonalDetailsDao();
            PersonalDetails personalDetailsNew = targetDao.load(__key);
            synchronized (this) {
                personalDetails = personalDetailsNew;
            	personalDetails__resolvedKey = __key;
            }
        }
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        synchronized (this) {
            this.personalDetails = personalDetails;
            personal_id = personalDetails == null ? null : personalDetails.getId();
            personalDetails__resolvedKey = personal_id;
        }
    }

    /** To-one relationship, resolved on first access. */
    public Location getLocation() {
        Long __key = this.location_id;
        if (location__resolvedKey == null || !location__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            LocationDao targetDao = daoSession.getLocationDao();
            Location locationNew = targetDao.load(__key);
            synchronized (this) {
                location = locationNew;
            	location__resolvedKey = __key;
            }
        }
        return location;
    }

    public void setLocation(Location location) {
        synchronized (this) {
            this.location = location;
            location_id = location == null ? null : location.getId();
            location__resolvedKey = location_id;
        }
    }

    /** To-one relationship, resolved on first access. */
    public Structure getStructure() {
        Long __key = this.structure_id;
        if (structure__resolvedKey == null || !structure__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            StructureDao targetDao = daoSession.getStructureDao();
            Structure structureNew = targetDao.load(__key);
            synchronized (this) {
                structure = structureNew;
            	structure__resolvedKey = __key;
            }
        }
        return structure;
    }

    public void setStructure(Structure structure) {
        synchronized (this) {
            this.structure = structure;
            structure_id = structure == null ? null : structure.getId();
            structure__resolvedKey = structure_id;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}