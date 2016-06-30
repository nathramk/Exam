package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.core.domain.StatusEnterprice;
import pe.com.peruInka.service.services.MaintainService;

@Controller
public class CustomerController {

	@Autowired
	private MaintainService maintainService;
	
	@RequestMapping(value = "maintain/customerboard", method = RequestMethod.GET)
	public String maintainCustomer(Model model, HttpServletRequest request){

		request.getSession().setAttribute("menuHeader", "maintain");
		
		model.addAttribute("listCustomer", maintainService.findCustomer());
		
		return "maintain/customerboard";
	}
	

	@RequestMapping(value = "maintain/frmcustomer", method = RequestMethod.GET)
	public String frmcustomer(Model model, HttpServletRequest request) {
		model.addAttribute("customer", new Customer());
		return "maintain/frmcustomer";
	}
	
	
	@RequestMapping(value = "maintain/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(Model model, HttpServletRequest request,@ModelAttribute("customer") Customer customer) {
		maintainService.saveCustomer(customer);
		return "redirect:customerboard";
	}
	
	@ModelAttribute("statusCustomer")
	public List<StatusCustomer> findStatusCustomer(){
		return maintainService.findStatusCustomer();
	}
	
	@ModelAttribute("statusEnterprice")
	public List<StatusEnterprice> findStatusEnterprice(){
		return maintainService.findStatusEnterprice();
	}
	
}
