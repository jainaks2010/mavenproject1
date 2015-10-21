package com.mycompany.dao;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;

import com.mycompany.data.Event;


public class EventDAOImpl extends HibernateDaoSupport implements EventDAO{
	
	@Override
	public Event createEvent(String name) {
		Event event = new Event(name,new Date());
		getHibernateTemplate().save(event);
		return event;
	}

	@Override
	public Event getEventByName(String name) {
		Object object = currentSession().createCriteria(Event.class).add(Restrictions.eq("name" ,name)).uniqueResult();
		return (Event) object;
	}

	@Override
	public Event getEventById(Long id) {
		Object object = currentSession().get(Event.class, id);
		return (Event) object;
	}

	@Override
	public boolean deleteEventsByName(String name) {
		String hql = "delete from com.mycompany.data.Event e where e.name='"+name+"'";
		Query query = currentSession().createQuery(hql);
		int affectedRows = query.executeUpdate();
		return affectedRows > 0;
	}
}
