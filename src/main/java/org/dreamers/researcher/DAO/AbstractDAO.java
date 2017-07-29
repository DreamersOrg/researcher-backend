package org.dreamers.researcher.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yaseen on 7/29/2017.
 */
public class AbstractDAO<T extends Serializable> {
    private Class<T> clazz;

    @Autowired
    SessionFactory sessionFactory;

    public void setClazz(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public T getById(long id) {
        return (T) this.getCurrentSession().get(this.clazz, id);
    }

    public List<T> findAll() {
        return this.getCurrentSession().createQuery("from " + this.clazz.getName()).list();
    }

    public void save(T entity) {
        this.getCurrentSession().persist(entity);
    }

    public void update(T entity) {
        this.getCurrentSession().merge(entity);
    }

    public void delete(T entity) {
        this.getCurrentSession().delete(entity);
    }

    public void deleteById(long entityId) {
        T entity = this.getById(entityId);
        this.delete(entity);
    }

    protected Session getCurrentSession() {
        return this.sessionFactory.getCurrentSession();
    }
}
