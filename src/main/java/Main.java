import dao.BankingDao;
import dao.BankingDaoImpl;
import model.Customer;

public class Main {
    static BankingDao bankingDao = new BankingDaoImpl();

    public static void main(String[] args) {
        String firstName = "choniyu", lastName="azwan";
        Customer customer = new Customer();
        customer.setFirstname(firstName);
        customer.setLastname(lastName);
        if (bankingDao.addCustomer(customer)) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
