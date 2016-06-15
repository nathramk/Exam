package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.HotelDAO;
import pe.com.peruInka.core.dao.PersonDAO;
import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.core.domain.StatusPerson;
import pe.com.peruInka.core.domain.StatusProduct;
import pe.com.peruInka.core.domain.StatusUser;
import pe.com.peruInka.core.domain.TypeDocument;
import pe.com.peruInka.core.domain.TypeProduct;
import pe.com.peruInka.core.domain.UserSystem;
import pe.com.peruInka.service.util.Person;

@Service("peruInkaService")
public class PeruInkaService {

	public static List<Person> listPerson = new ArrayList<Person>();

	public static List<Hotel> listHotel = new ArrayList<Hotel>();
	
	@Autowired
	private PersonDAO personDAO;

	
	@Autowired
	private HotelDAO hotelDAO;
	
	
	// UserSystem findUserSystemById(Long id);
	//
	// void deleteUserSystem(UserSystem userSystem);

	public void deleteUserSystem(Long id) {
		UserSystem userSystem  = personDAO.findUserSystemById(id);
		personDAO.deleteUserSystem(userSystem);
	}

	public UserSystem findUserSystemById(Long id) {
		return personDAO.findUserSystemById(id);
	}

	public List<StatusUser> findStatusUser() {
		return personDAO.findStatusUser();
	}

	public List<TypeDocument> findTypeDocument() {
		return personDAO.findTypeDocument();
	}

	public List<StatusPerson> findStatusPerson() {
		return personDAO.findStatusPerson();
	}

	public List<pe.com.peruInka.core.domain.Person> findAllPerson() {
		return personDAO.findAllPerson();
		// return listPerson;
	}

	public void savePerson(pe.com.peruInka.core.domain.Person person) {
		// listPerson.add(person);
		personDAO.savePerson(person);
	}

	public List<UserSystem> findUserSystem() {
		return personDAO.findUserSystem();
	}

	public void saveUserSystem(UserSystem userSystem) {
		if (userSystem.getId() == null) {
			personDAO.saveUserSystem(userSystem);
		} else {
			personDAO.updateUserSystem(userSystem);
		}
	}

	public void deletePerson(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<Person> listPersoTemp = new ArrayList<Person>();

		for (Person person : listPerson) {
			if (id.compareTo(person.getId()) != 0) {
				listPersoTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listPersoTemp);
	}

	public void updatePerson(Person personUpdate) {
		List<Person> listTemp = new ArrayList<Person>();

		for (Person person : listPerson) {
			if (personUpdate.getId().compareTo(person.getId()) == 0) {
				listTemp.add(personUpdate);
			} else {
				listTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listTemp);

	}

	public Person searchPerson(Long id) {
		Person personReturn = new Person();
		for (Person person : listPerson) {
			if (id.compareTo(person.getId()) == 0) {
				personReturn = person;
				continue;
			}
		}
		return personReturn;
	}
	
//	List<Hotel> finAllHotel();
//	void saveHotel(Hotel hotel);
	public List<Hotel> finAllHotel(){
		return hotelDAO.finAllHotel();
	}
	
	public void saveHotel(Hotel hotel){
		if(hotel.getId()==null){
			hotelDAO.saveHotel(hotel);
			
		}else{
			hotelDAO.updateHotel(hotel);
		}
	}
		
	public void deleteHotel(Long id){
		Hotel hotel = hotelDAO.findHotelById(id);
		hotelDAO.deleteHotel(hotel);
//		UserSystem userSystem  = personDAO.findUserSystemById(id);
//		personDAO.deleteUserSystem(userSystem);
	}
	
	public Hotel findHotelById(Long id){
			return hotelDAO.findHotelById(id);
	}
//	List<StatusHotel> findStatusHotel();
	public List<StatusHotel> findStatusHotel() {
		return hotelDAO.findStatusHotel();
	}
//	List<Product> findProduct();
//void saveProduct(Product product);
//	
//	List<StatusProduct> findStatusProduct();
//	_______________________________________________________________________________________________
	public List<Product> findProduct(){
		return hotelDAO.findProduct();
	}
	
	public void saveProduct(Product product){
		if(product.getId()==null){
			hotelDAO.saveProduct(product);
		}else{
			hotelDAO.updateProduct(product);
		}
	}
	public void deleteProduct(Long id){
		Product product = hotelDAO.findProductById(id);
		hotelDAO.deleteProduct(product);
	}
	
	public Product findProductById(Long id){
		return hotelDAO.findProductById(id);
	}
	public List<StatusProduct> findStatusProduct(){
		return hotelDAO.findStatusProduct();
	}
	public List<TypeProduct> findTypeProduct() {
		return hotelDAO.findTypeProduct();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
