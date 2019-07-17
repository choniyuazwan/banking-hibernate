package db;

import model.Account;
import model.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DBConnection {
    static SessionFactory sessionFactory;
    static ServiceRegistry serviceRegistry;

    public static SessionFactory getConnection() {
        Configuration config = new Configuration();
        config.addAnnotatedClass(Customer.class);
        config.addAnnotatedClass(Account.class);
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        sessionFactory = config.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
}
