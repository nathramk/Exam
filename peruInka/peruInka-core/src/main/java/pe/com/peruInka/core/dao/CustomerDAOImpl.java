package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.Enterprice;
import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.core.domain.StatusEnterprice;

public class CustomerDAOImpl extends BaseDAOHibernate{

	public List<Customer> findCustomer(){
		return find(Customer.class, "from Customer");
	}
	public void saveCustomer(Customer customer){
		save(customer);
	}
	public void updateCustomer(Customer customer){
		update(customer);
	}
	public void deleteCustomer(Customer customer){
		delete(customer);
	}
	public List<StatusCustomer> findStatusCustomer(){
		return find(StatusCustomer.class, "from StatusCustomer");
	}
	public Customer findCustomerById(Long id){
		return findById(Customer.class, id);
	}
//____________________________________________________________________________________
	
	public List<Enterprice> findEnterprice(){
		return find(Enterprice.class, "from Enterprice");
	}
	public void saveEnterprice(Enterprice enterprice){
		save(enterprice);
	}
	public void updateEnterprice(Enterprice enterprice){
		update(enterprice);
	}
	public void deleteEnterprice(Enterprice enterprice){
		delete(enterprice);
	}
	public List<StatusEnterprice> findStatusEnterprice(){
		return find(StatusEnterprice.class, "from StatusEnterprice");
	}
	public Enterprice findEnterpriceById(Long id){
		return findById(Enterprice.class, id);
	}
}
