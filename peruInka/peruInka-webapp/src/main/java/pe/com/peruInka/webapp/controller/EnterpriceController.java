package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.peruInka.core.domain.Enterprice;
import pe.com.peruInka.core.domain.StatusEnterprice;
import pe.com.peruInka.service.services.MaintainService;

@Controller
public class EnterpriceController {

	@Autowired
	private MaintainService maintainService;
	
	@RequestMapping(value = "maintain/enterpriceboard", method = RequestMethod.GET)
	public String maintainEnterprice(Model model, HttpServletRequest request){

		request.getSession().setAttribute("menuHeader", "Enterprice");
		
		model.addAttribute("listEnterprice", maintainService.findEnterprice());
		
		return "maintain/enterpriceboard";
	}
	
	@RequestMapping(value = "maintain/frmenterprice", method = RequestMethod.GET)
	public String frmenterprice(Model model, HttpServletRequest request) {
		model.addAttribute("enterprice", new Enterprice());
		return "maintain/frmenterprice";
	}
	
	@RequestMapping(value = "maintain/saveEnterprice", method = RequestMethod.POST)
	public String saveEnterprice(Model model, HttpServletRequest request,@ModelAttribute("enterprice") Enterprice enterprice) {
		maintainService.saveEnerprice(enterprice);
		return "redirect:enterpriceboard";
	}
	
	@ModelAttribute("statusEnterprice")
	public List<StatusEnterprice> findStatusEnterprice(){
		return maintainService.findStatusEnterprice();
	}
}
