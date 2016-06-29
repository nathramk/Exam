package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.Enterprice;
import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.core.domain.StatusEnterprice;

public interface CustomerDAO {

	Customer findCustomerById(Long id);
	
	void updateCustomer(Customer customer);
	
	List<Customer> findCustomer();
	
	void deleteCustomer(Customer customer);
	
	void saveCustomer(Customer customer);

	List<StatusCustomer> findStatusCustomer();
	

//___________________________________________________________________________
	
	Enterprice findEnterpriceById(Long id);
	
	void saveEnterprice(Enterprice enterprice);
	
	List<Enterprice> findEnterprice();
	
	void updateEnterprice(Enterprice enterprice);
	
	void deleteEnterprice(Enterprice enterprice);
	
	List<StatusEnterprice> findStatusEnterprice();
	
	

	
}
