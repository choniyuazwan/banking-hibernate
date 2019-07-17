package dao;

import db.DBUtil;
import model.Customer;

public class BankingDaoImpl implements BankingDao {
    DBUtil dbUtil = new DBUtil();
    public boolean addCustomer(Customer customer) {
        return dbUtil.addCustomer(customer);
    }
}
