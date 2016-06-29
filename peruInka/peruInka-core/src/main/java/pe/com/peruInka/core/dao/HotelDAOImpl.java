package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.core.domain.StatusProduct;
import pe.com.peruInka.core.domain.TypeProduct;

public class HotelDAOImpl extends BaseDAOHibernate implements HotelDAO{

	public List<Hotel> finAllHotel(){
		return find(Hotel.class, "from Hotel");
	}
	public void saveHotel(Hotel hotel){
		save(hotel);
	}
	
	public void updateHotel(Hotel hotel){
		update(hotel);
	}
	
	public Hotel findHotelById(Long id) {
		return findById(Hotel.class, id);
	}
	public List<StatusHotel> findStatusHotel() {
		return find(StatusHotel.class, "from StatusHotel");
	}
	public void deleteHotel(Hotel hotel) {
		delete(hotel);
	}
	
	public void updatehotel(Hotel hotel){
		update(hotel);
	}
	
	public List<Product> findProduct() {
		return find(Product.class, "from Product");
	}
	public void saveProduct(Product product){
		save(product);
	}
	
	public List<StatusProduct> findStatusProduct(){
		return find(StatusProduct.class, "from StatusProduct");
	}
	
	public void updateProduct(Product product){
		update(product);
	}
	public Product findProductById(Long id){
		return findById(Product.class, id);
	}
	
	public void deleteProduct(Product product){
		delete(product);
	}
	public List<TypeProduct> findTypeProduct() {
		return find(TypeProduct.class, "from TypeProduct");
	}
	
}
