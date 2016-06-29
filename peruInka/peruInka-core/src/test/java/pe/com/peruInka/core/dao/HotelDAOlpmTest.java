package pe.com.peruInka.core.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.Enterprice;
import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.core.domain.StatusEnterprice;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.core.domain.StatusProduct;

public class HotelDAOlpmTest extends AbstractUnitTest{

	@Autowired
	protected HotelDAO hotelDAO;
	
	@Autowired
	protected CustomerDAO customerDAO;
	
	public void test() {
		System.out.println(hotelDAO);
	}
	public void testFinAllHotel(){
		System.out.println(" === "+hotelDAO.finAllHotel());
	}
	public void testSaveHotel(){
		Hotel hotel = new Hotel();
		hotel.setBusinessName("pacha hotel");
		hotel.setAddress("jr. las Soyam 777");
		hotel.setRuc("12345678987");
		hotel.setPhone("978654123");
		
		StatusHotel statushotel=new StatusHotel();
		statushotel.setTypeCode(StatusHotel.HOTEL_ACT);
		hotel.setStatusHotel(statushotel);
		
		hotelDAO.saveHotel(hotel);
		testFinAllHotel();
		setComplete();
	}
	
	public void testFindPersonById(){
		
		System.out.println("::: "+hotelDAO.findHotelById(5L));
		Hotel hotel = hotelDAO.findHotelById(5L);
		
		System.out.println("Name: "+hotel.getBusinessName());
		System.out.println("Address: "+hotel.getAddress());
	}
	
//	void deleteHotel(Hotel hotel)
//	
	public void testDeleteHotel(){
		Hotel hotel = hotelDAO.findHotelById(6L);
		hotelDAO.deleteHotel(hotel);
		setComplete();
	
	}
	public void testSaveProduct(){
		Product product = new Product();
		product.setProductName("Espa");
		product.setDescription("Sauna a vapor");
		product.setCreatedBy("Hotel");
		
		StatusProduct statusProduct = new StatusProduct();
		statusProduct.setTypeCode(StatusProduct.PRODUCT_DISP);
		product.setStatusProduct(statusProduct);
		
		Hotel hotel = new Hotel();
		hotel.setBusinessName("pacha hotel");
		hotel.setAddress("jr. las Soyam 777");
		hotel.setRuc("12345678987");
		hotel.setPhone("978654123");
		hotel.setVersion(1);
		
		StatusHotel statushotel=new StatusHotel();
		statushotel.setTypeCode(StatusHotel.HOTEL_ACT);
		hotel.setStatusHotel(statushotel);
		
		product.setHotel(hotel);
		
		hotelDAO.saveProduct(product);
		setComplete();
	}
	
	public void testFindProduct(){
		List<Product> listaProduct = hotelDAO.findProduct();
		for (Product product2 : listaProduct) {
			System.out.println(product2.getProductName()+" :::: "+product2.getHotel().getBusinessName());
//					getUserName()+"  ::: "+userSystem2.getPerson().getName());
		}
	}
	
//	List<Customer> findCustomer();
//	
//	void saveCustomer(Customer customer);
	
	public void testFindCustomer(){
		System.out.println(" ::: "+customerDAO.findCustomer());
	}
	
	
	public void testFindEnterprice(){
		System.out.print(" ::: "+customerDAO.findEnterprice());
	}
	
	public void testSaveCustomer(){
		Customer customer=new Customer();
		customer.setCreatedBy("admin");
		customer.setVersion(1);
		
		StatusCustomer statusCustomer = new StatusCustomer();
		statusCustomer.setTypeCode(StatusCustomer.CUSTOMER_ACT.toString());
		customer.setStatusCustomer(statusCustomer);
		
		Enterprice enterprice=new Enterprice();
		enterprice.setBusinessName("papas SAC");
		enterprice.setRuc("78945221");
		enterprice.setAddress("jr. Los Manzaños # 87954");
		
		StatusEnterprice  statusEnterprice = new  StatusEnterprice();
		statusEnterprice.setTypeCode(StatusEnterprice.ENTERPRICE_ACT.toString());
		enterprice.setStatusEnterprice(statusEnterprice);
		
		customer.setEnterprice(enterprice);
		
		customerDAO.saveCustomer(customer);
		setComplete();
	}
}


