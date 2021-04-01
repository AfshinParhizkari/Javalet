import customer.Customer;
import customer.CustomerArray;
import customer.CustomerInt;
import customer.CustomerSrv;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Project order
 * @Author Afshin Parhizkari
 * @Date 4/2/21
 * @Time 3:07 AM
 * Created by   IntelliJ IDEA
 * Email:       Afshin.Parhizkari@gmail.com
 * Description:
 */
public class HelloTest {

    Hello hello=new Hello();

    public HelloTest() throws MalformedURLException {}
    @Test
    public void getHello() {
        System.out.println(hello.getHello("Afshin"));
    }
    public String toString(Customer customer) {
        return "Customer{" +
                "customerNumber=" + customer.getCustomerNumber() +
                ", customerName='" + customer.getCustomerName() + '\'' +
                ", contactLastName='" + customer.getContactLastName() + '\'' +
                ", contactFirstName='" + customer.getContactFirstName() + '\'' +
                ", phone='" + customer.getPhone() + '\'' +
                ", addressLine1='" + customer.getAddressLine1() + '\'' +
                ", addressLine2='" + customer.getAddressLine2() + '\'' +
                ", city='" + customer.getCity() + '\'' +
                ", state='" + customer.getState() + '\'' +
                ", postalCode='" + customer.getPostalCode() + '\'' +
                ", country='" + customer.getCountry() + '\'' +
                ", salesRepEmployeeNumber=" + customer.getSalesRepEmployeeNumber() +
                ", creditLimit=" + customer.getCreditLimit() +
                '}';
    }

    @Test
    public void findall() throws MalformedURLException {
        URL url = new URL("http://localhost:8080/order/soap/customer");
        CustomerSrv CSrv = new CustomerSrv(url);
        CustomerInt CInt = CSrv.getCustomerIntPort();

        CustomerArray customers= CInt.all();
        List<Customer> customerList=customers.getItem();
        for(Customer customer:customerList)
            System.out.println(toString(customer));
    }
}