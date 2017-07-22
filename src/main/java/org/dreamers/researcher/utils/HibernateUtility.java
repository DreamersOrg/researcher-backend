package org.dreamers.researcher.utils;

import org.dreamers.researcher.pojo.Answers;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by Yaseen on 7/19/2017.
 */
public class HibernateUtility {
  private final static SessionFactory sessionFactory;
  private final static StandardServiceRegistry standardServiceRegistry;
  static {

//    Below code has been commented out as it seems to be incompatible with Hibernate5 as it was throwing unkown mapping entity exception
    /*Configuration configuration = new Configuration();
    configuration.configure("hibernate.cfg.xml");
    standardServiceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
    sessionFactory = configuration.buildSessionFactory(standardServiceRegistry);*/
    standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
    sessionFactory = metadata.getSessionFactoryBuilder().build();
  }


  public static SessionFactory getSessionFactory(){
    return sessionFactory;
  }
}
