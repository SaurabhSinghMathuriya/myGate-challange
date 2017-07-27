package com.mygate.dal.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mygate.dal.bean.MobileFoodFacilityPermit;

/**
 * A data access object (DAO) providing persistence and search support for
 * MobileFoodFacilityPermit entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.mygate.dal.bean.MobileFoodFacilityPermit
 * @author MyEclipse Persistence Tools
 */
@SuppressWarnings("rawtypes")
public class MobileFoodFacilityPermitDAO extends HibernateDaoSupport {
	private static final Logger LOGGER = Logger.getLogger(MobileFoodFacilityPermitDAO.class);
	// property constants
	public static final String LOCATIONID = "locationid";
	public static final String APPLICANT = "applicant";
	public static final String FACILITY_TYPE = "facilityType";
	public static final String CNN = "cnn";
	public static final String LOCATION_DESCRIPTION = "locationDescription";
	public static final String ADDRESS = "address";
	public static final String BLOCKLOT = "blocklot";
	public static final String BLOCK = "block";
	public static final String LOT = "lot";
	public static final String PERMIT = "permit";
	public static final String STATUS = "status";
	public static final String FOOD_ITEMS = "foodItems";
	public static final String X = "x";
	public static final String Y = "y";
	public static final String LATITUDE = "latitude";
	public static final String LONGITUDE = "longitude";
	public static final String SCHEDULE = "schedule";
	public static final String DAYSHOURS = "dayshours";
	public static final String NOISENT = "noisent";
	public static final String APPROVED = "approved";
	public static final String PRIOR_PERMIT = "priorPermit";
	public static final String EXPIRATION_DATE = "expirationDate";
	public static final String LOCATION = "location";

	protected void initDao() {
		// do nothing
	}

	public void save(MobileFoodFacilityPermit transientInstance) {
		LOGGER.debug("saving MobileFoodFacilityPermit instance");
		try {
			getHibernateTemplate().save(transientInstance);
			LOGGER.debug("save successful");
		} catch (RuntimeException re) {
			LOGGER.error("save failed", re);
			throw re;
		}
	}

	public void delete(MobileFoodFacilityPermit persistentInstance) {
		LOGGER.debug("deleting MobileFoodFacilityPermit instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			LOGGER.debug("delete successful");
		} catch (RuntimeException re) {
			LOGGER.error("delete failed", re);
			throw re;
		}
	}

	public MobileFoodFacilityPermit findById(java.lang.Integer id) {
		LOGGER.debug("getting MobileFoodFacilityPermit instance with id: " + id);
		try {
			MobileFoodFacilityPermit instance = (MobileFoodFacilityPermit) getHibernateTemplate()
					.get("com.mygate.dal.bean.MobileFoodFacilityPermit", id);
			return instance;
		} catch (RuntimeException re) {
			LOGGER.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MobileFoodFacilityPermit instance) {
		LOGGER.debug("finding MobileFoodFacilityPermit instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			LOGGER.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			LOGGER.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		LOGGER.debug("finding MobileFoodFacilityPermit instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from MobileFoodFacilityPermit as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			LOGGER.error("find by property name failed", re);
			throw re;
		}
	}

	
	public List findByLocationid(Object locationid) {
		return findByProperty(LOCATIONID, locationid);
	}

	public List findByApplicant(Object applicant) {
		return findByProperty(APPLICANT, applicant);
	}

	public List findByFacilityType(Object facilityType) {
		return findByProperty(FACILITY_TYPE, facilityType);
	}

	public List findByCnn(Object cnn) {
		return findByProperty(CNN, cnn);
	}

	public List findByLocationDescription(Object locationDescription) {
		return findByProperty(LOCATION_DESCRIPTION, locationDescription);
	}

	public List findByAddress(Object address) {
		return findByProperty(ADDRESS, address);
	}

	public List findByBlocklot(Object blocklot) {
		return findByProperty(BLOCKLOT, blocklot);
	}

	public List findByBlock(Object block) {
		return findByProperty(BLOCK, block);
	}

	public List findByLot(Object lot) {
		return findByProperty(LOT, lot);
	}

	public List findByPermit(Object permit) {
		return findByProperty(PERMIT, permit);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByFoodItems(Object foodItems) {
		return findByProperty(FOOD_ITEMS, foodItems);
	}

	public List findByX(Object x) {
		return findByProperty(X, x);
	}

	public List findByY(Object y) {
		return findByProperty(Y, y);
	}

	public List findByLatitude(Object latitude) {
		return findByProperty(LATITUDE, latitude);
	}

	public List findByLongitude(Object longitude) {
		return findByProperty(LONGITUDE, longitude);
	}

	public List findBySchedule(Object schedule) {
		return findByProperty(SCHEDULE, schedule);
	}

	public List findByDayshours(Object dayshours) {
		return findByProperty(DAYSHOURS, dayshours);
	}

	public List findByNoisent(Object noisent) {
		return findByProperty(NOISENT, noisent);
	}

	public List findByApproved(Object approved) {
		return findByProperty(APPROVED, approved);
	}

	public List findByPriorPermit(Object priorPermit) {
		return findByProperty(PRIOR_PERMIT, priorPermit);
	}

	public List findByExpirationDate(Object expirationDate) {
		return findByProperty(EXPIRATION_DATE, expirationDate);
	}

	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	public List findAll() {
		LOGGER.debug("finding all MobileFoodFacilityPermit instances");
		try {
			String queryString = "from MobileFoodFacilityPermit";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			LOGGER.error("find all failed", re);
			throw re;
		}
	}

	public MobileFoodFacilityPermit merge(
			MobileFoodFacilityPermit detachedInstance) {
		LOGGER.debug("merging MobileFoodFacilityPermit instance");
		try {
			MobileFoodFacilityPermit result = getHibernateTemplate()
					.merge(detachedInstance);
			LOGGER.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			LOGGER.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MobileFoodFacilityPermit instance) {
		LOGGER.debug("attaching dirty MobileFoodFacilityPermit instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			LOGGER.debug("attach successful");
		} catch (RuntimeException re) {
			LOGGER.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MobileFoodFacilityPermit instance) {
		LOGGER.debug("attaching clean MobileFoodFacilityPermit instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			LOGGER.debug("attach successful");
		} catch (RuntimeException re) {
			LOGGER.error("attach failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<MobileFoodFacilityPermit> findByFilter(final String applicantName, final String expiryDate, final String streetName, String queryString) {
	 List<MobileFoodFacilityPermit> results=null;
	LOGGER.debug("finding MobileFoodFacilityPermit instances with applicantName: " + applicantName+ ", expiryDate: " + expiryDate+" streetName: "+streetName);
	try { 
		final String finalQuery = queryString;
		results = (List<MobileFoodFacilityPermit>) getHibernateTemplate().execute(new HibernateCallback() {
					public List<MobileFoodFacilityPermit> doInHibernate(Session session) throws HibernateException, SQLException {
						Query query = session.createQuery(finalQuery);
						if(null != applicantName && applicantName.trim().length()>0){
							query.setString("applicantName",applicantName);
						}if(null != expiryDate && expiryDate.trim().length()>0){
							query.setString("expiryDate",expiryDate);
						}if(null != streetName && streetName.trim().length()>0){
							query.setString("streetName",streetName);
						}
						return (List<MobileFoodFacilityPermit>)query.list();
					}
				});
	} catch (RuntimeException re) {
		LOGGER.error("get failed", re);
		throw re;
	}
	return results;
	}

	
	public void deleteById(Integer id) {
		LOGGER.debug("Deleting MobileFoodFacilityPermit instances with id: " + id);
		try { 
			getHibernateTemplate().delete(getHibernateTemplate().get(MobileFoodFacilityPermit.class, id));
		} catch (RuntimeException re) {
			LOGGER.error("Delete failed", re);
			throw re;
		}
	}
	
	public static MobileFoodFacilityPermitDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MobileFoodFacilityPermitDAO) ctx.getBean("mobileFoodFacilityPermitDAO");
	}
}