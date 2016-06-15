package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Hotel extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String businessName;
	private String ruc;
	private String address;
	private String phone;
	private String root;
//	private String Status;
	private StatusHotel statusHotel;
//	private Person person;
	
	
	
//	public Person getPerson() {
//		return person;
//	}
//	public void setPerson(Person person) {
//		this.person = person;
//	}
	public StatusHotel getStatusHotel() {
		return statusHotel;
	}
	public void setStatusHotel(StatusHotel statusHotel) {
		this.statusHotel = statusHotel;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}

}
