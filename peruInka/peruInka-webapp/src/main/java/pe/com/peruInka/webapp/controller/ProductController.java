package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.core.domain.StatusProduct;

import pe.com.peruInka.core.domain.TypeProduct;

import pe.com.peruInka.service.services.PeruInkaService;

@Controller
public class ProductController {

	@Autowired
	private PeruInkaService peruInkaService;
	
	@RequestMapping(value = "admin/productboard", method = RequestMethod.GET)
	public String adminProductboard(Model model, HttpServletRequest request) {
		
		request.getSession().setAttribute("menuHeader", "productboard");
		
		model.addAttribute("listProduct", peruInkaService.findProduct());
		
		System.out.println("admin/productboard");

		return "admin/productboard";
	}
	
	@RequestMapping(value = "admin/frmProduct", method = RequestMethod.GET)
	public String frmProduct(Model model, HttpServletRequest request) {
		model.addAttribute("product", new Product());
		return "admin/frmProduct";
	}
	@RequestMapping(value = "admin/deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(Model model, HttpServletRequest request, @RequestParam("id") Long id) {
		peruInkaService.deleteProduct(id);;
		return "redirect:productboard";
	}
	@RequestMapping(value = "admin/saveProduct", method = RequestMethod.POST)
	public String saveProduct(Model model, HttpServletRequest request,@ModelAttribute("product") Product product) {
		peruInkaService.saveProduct(product);
		return "redirect:productboard";
	}
	@RequestMapping(value = "admin/editProduct", method = RequestMethod.GET)
	public String editPerson(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		model.addAttribute("product", peruInkaService.findProductById(id) );
		return "admin/frmProduct";
	}
	
	@ModelAttribute("statusProduct")
	public List<StatusProduct> statusProductList(){
		return peruInkaService.findStatusProduct();
	}
	@ModelAttribute("typeProduct")
	public List<TypeProduct> typeProductList(){
		return peruInkaService.findTypeProduct();
	}
	@ModelAttribute("statusHotel")
	public List<StatusHotel> statusHotelList(){
		return peruInkaService.findStatusHotel();
	}
//	@RequestMapping(value = "admin/dashboard", method = RequestMethod.GET)
//	public String adminDashboard(Model model, HttpServletRequest request) {
//
//		request.getSession().setAttribute("menuHeader", "admin");
//
//		System.out.println("admin/dashboard");
//
//		return "admin/dashboard";
//	}
}
