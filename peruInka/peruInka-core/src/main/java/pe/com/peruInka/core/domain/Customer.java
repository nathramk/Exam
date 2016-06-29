package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;




public class Customer extends BaseEntity implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	status              
	private String createdBy;           
	private Date dateCreated;         
	private Date dateLastUpdated; 
	private String lastUpdatedBy;       
	private int version;
	private Person person;
	private Enterprice enterprice;
	
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Enterprice getEnterprice() {
		return enterprice;
	}
	public void setEnterprice(Enterprice enterprice) {
		this.enterprice = enterprice;
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
	public Integer getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
        
	
	
	
}
