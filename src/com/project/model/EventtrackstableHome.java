package com.project.model;
// Generated Apr 11, 2017 7:41:17 PM by Hibernate Tools 4.3.5.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Eventtrackstable.
 * @see com.project.model.Eventtrackstable
 * @author Hibernate Tools
 */
public class EventtrackstableHome {

	private static final Log log = LogFactory.getLog(EventtrackstableHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Eventtrackstable transientInstance) {
		log.debug("persisting Eventtrackstable instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Eventtrackstable instance) {
		log.debug("attaching dirty Eventtrackstable instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Eventtrackstable instance) {
		log.debug("attaching clean Eventtrackstable instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Eventtrackstable persistentInstance) {
		log.debug("deleting Eventtrackstable instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Eventtrackstable merge(Eventtrackstable detachedInstance) {
		log.debug("merging Eventtrackstable instance");
		try {
			Eventtrackstable result = (Eventtrackstable) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Eventtrackstable findById(com.project.model.EventtrackstableId id) {
		log.debug("getting Eventtrackstable instance with id: " + id);
		try {
			Eventtrackstable instance = (Eventtrackstable) sessionFactory.getCurrentSession()
					.get("com.project.model.Eventtrackstable", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Eventtrackstable instance) {
		log.debug("finding Eventtrackstable instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.project.model.Eventtrackstable")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
