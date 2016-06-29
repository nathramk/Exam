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

import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.service.services.PeruInkaService;

@Controller
public class HotelController {

	@Autowired
	private PeruInkaService peruInkaService;
	
	@RequestMapping(value = "admin/hotelboard", method = RequestMethod.GET)
	public String homedashboard(Model model, HttpServletRequest request) {
		request.getSession().setAttribute("menuHeader", "hotel");
		// request.getSession().setAttribute("menuHeader", "home");
		model.addAttribute("listHotel", peruInkaService.finAllHotel());
		System.out.println("admin/hotelboard");

		return "admin/hotelboard";
	}
	
	@RequestMapping(value = "admin/frmHotel", method = RequestMethod.GET)
	public String newPerson(Model model, HttpServletRequest request) {
		model.addAttribute("hotel", new Hotel());
		model.addAttribute("opc", "new");

//		model.addAttribute("typeDocument",peruInkaService.findTypeDocument());
		
		return "admin/frmHotel";
	}
	@RequestMapping(value = "admin/deleteHotel", method = RequestMethod.GET)
	public String deleteHotel(Model model, HttpServletRequest request, @RequestParam("id") Long id) {
		peruInkaService.deleteHotel(id);
		
		return "redirect:hotelboard";
	}
	
	@ModelAttribute("statusHotel")
	public List<StatusHotel> statusHotelList(){
		return peruInkaService.findStatusHotel();
	}
	
	@RequestMapping(value = "admin/saveHotel", method = RequestMethod.POST)
	public String saveHotel(Model model, HttpServletRequest request,@ModelAttribute("hotel") Hotel hotel) {
		peruInkaService.saveHotel(hotel);
		return "redirect:hotelboard";
	}
	
	@RequestMapping(value = "admin/editHotel", method = RequestMethod.GET)
	public String editHotel(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		model.addAttribute("hotel", peruInkaService.findHotelById(id) );
		return "admin/frmHotel";
	}
	
//	deleteHotel
//	editHotel
	
}
