package db;

import model.Customer;
import org.hibernate.Session;

public class DBUtil {
    Session session;

    public boolean addCustomer(Customer customer) {
        session = new DBConnection().getConnection().openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        return true;
    }
}
