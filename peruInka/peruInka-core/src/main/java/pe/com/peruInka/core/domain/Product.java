package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Product extends BaseEntity implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
private String	productName;          
private String	description; 
private Double	price;
private String	attribute;            
//private String	STATUS;               
//private String	hotelId;             
//private String	productType;          
private String	createBy;             
//private Date	dateCreated;          
//private Date	dateLastUpdated;     
private int VERSION;
private String	lastUpdatedBy;
private Hotel hotel;
private StatusProduct statusProduct;
private TypeProduct TypeProduct;

public TypeProduct getTypeProduct() {
	return TypeProduct;
}
public void setTypeProduct(TypeProduct typeProduct) {
	TypeProduct = typeProduct;
}
public int getVERSION() {
	return VERSION;
}
public void setVERSION(int vERSION) {
	VERSION = vERSION;
}
public StatusProduct getStatusProduct() {
	return statusProduct;
}
public void setStatusProduct(StatusProduct statusProduct) {
	this.statusProduct = statusProduct;
}
public Hotel getHotel() {
	return hotel;
}
public void setHotel(Hotel hotel) {
	this.hotel = hotel;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getAttribute() {
	return attribute;
}
public void setAttribute(String attribute) {
	this.attribute = attribute;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public String getCreateBy() {
	return createBy;
}
public void setCreateBy(String createBy) {
	this.createBy = createBy;
}
//public Date getDateCreated() {
//	return dateCreated;
//}
//public void setDateCreated(Date dateCreated) {
//	this.dateCreated = dateCreated;
//}
//public Date getDateLastUpdated() {
//	return dateLastUpdated;
//}
//public void setDateLastUpdated(Date dateLastUpdated) {
//	this.dateLastUpdated = dateLastUpdated;
//}
public String getLastUpdatedBy() {
	return lastUpdatedBy;
}
public void setLastUpdatedBy(String lastUpdatedBy) {
	this.lastUpdatedBy = lastUpdatedBy;
} 
	


}
