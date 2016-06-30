package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import pe.com.peruInka.core.dao.CustomerDAO;
import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.Enterprice;
import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.core.domain.StatusEnterprice;

@Controller("maintainService")
public class MaintainService {

	public static List<Customer> listCustomer = new ArrayList<Customer>();
	
	protected CustomerDAO customerDAO;
	
	public List<Customer> findCustomer(){
		return customerDAO.findCustomer();
	}
	public void saveCustomer(Customer customer){
		customerDAO.saveCustomer(customer);
	}
	public List<StatusCustomer> findStatusCustomer(){
		return customerDAO.findStatusCustomer();
	}
//______________________________________________________________________________________
	
	public List<Enterprice> findEnterprice(){
		return customerDAO.findEnterprice();
	}
	public void saveEnerprice(Enterprice enterprice){
		customerDAO.saveEnterprice(enterprice);
	}
	public List<StatusEnterprice> findStatusEnterprice(){
		return customerDAO.findStatusEnterprice();
	}
	
}
