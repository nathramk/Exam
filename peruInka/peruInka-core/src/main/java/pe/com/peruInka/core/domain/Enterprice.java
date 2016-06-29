package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Enterprice extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String businessName;         
	private String ruc;                  
	private String address;              
	private String phone;                
//	private String status;               
	private String createdBy;            
	private Date dateCreated;         
	private Date dateLastUpdated;     
	private String lastUpdatedBy;     
	private Integer version;
	private StatusEnterprice statusEnterprice;
	
	
	
	
	public StatusEnterprice getStatusEnterprice() {
		return statusEnterprice;
	}
	public void setStatusEnterprice(StatusEnterprice statusEnterprice) {
		this.statusEnterprice = statusEnterprice;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	      
	
}
