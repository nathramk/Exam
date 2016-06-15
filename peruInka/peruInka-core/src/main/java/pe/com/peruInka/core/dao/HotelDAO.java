package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.core.domain.StatusProduct;
import pe.com.peruInka.core.domain.TypeProduct;

public interface HotelDAO {
	void updateProduct(Product product);
	
	Product findProductById(Long id);
	
	List<TypeProduct> findTypeProduct();
	
	void deleteProduct(Product product);
	
	void updateHotel(Hotel hotel);
	
	Hotel findHotelById(Long id);
	
	void deleteHotel(Hotel hotel);
	
	List<Hotel> finAllHotel();
	
	List<Product> findProduct();
	
	void saveHotel(Hotel hotel);

	List<StatusHotel> findStatusHotel();
	
	void saveProduct(Product product);
	
	List<StatusProduct> findStatusProduct();
	
}
