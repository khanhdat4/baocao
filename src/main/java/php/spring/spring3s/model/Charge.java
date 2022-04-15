package php.spring.spring3s.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Charges")
public class Charge implements Serializable{
	@Id
	@Column(name="personincharge")
	private String personincharge;
	
	@Column(name="responsibleid")
	private String responsibleid;
	
	@Column(name="businessid")
	private String businessid;
	
	@Column(name="departmentid")
	private String departmentid;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="unitprice")
	private Integer unitprice;
	
	@Column(name="analyticalid")
	private String analyticalid;
	
	@Column(name="titleid")
	private String titleid;
	
	@Column(name="password")
	private String password;
	
	@Column(name="textoutput")
	private String textoutput;
	
	@Column(name="classificationpg")
	private String classificationpg;
	
	@Column(name="totalhours")
	private String totalhours;
	
	@Column(name="halfprice")
	private Integer halfprice;

	

	public Charge(String personincharge, String responsibleid, String businessid, String departmentid, Integer year,
			Integer unitprice, String analyticalid, String titleid, String password, String textoutput,
			String classificationpg, String totalhours, Integer halfprice) {
		super();
		this.personincharge = personincharge;
		this.responsibleid = responsibleid;
		this.businessid = businessid;
		this.departmentid = departmentid;
		this.year = year;
		this.unitprice = unitprice;
		this.analyticalid = analyticalid;
		this.titleid = titleid;
		this.password = password;
		this.textoutput = textoutput;
		this.classificationpg = classificationpg;
		this.totalhours = totalhours;
		this.halfprice = halfprice;
	}

	public String getPersonincharge() {
		return personincharge;
	}

	public void setPersonincharge(String personincharge) {
		this.personincharge = personincharge;
	}

	public String getResponsibleid() {
		return responsibleid;
	}

	public void setResponsibleid(String responsibleid) {
		this.responsibleid = responsibleid;
	}

	public String getBusinessid() {
		return businessid;
	}

	public void setBusinessid(String businessid) {
		this.businessid = businessid;
	}

	public String getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(Integer unitprice) {
		this.unitprice = unitprice;
	}

	public String getAnalyticalid() {
		return analyticalid;
	}

	public void setAnalyticalid(String analyticalid) {
		this.analyticalid = analyticalid;
	}

	public String getTitleid() {
		return titleid;
	}

	public void setTitleid(String titleid) {
		this.titleid = titleid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTextoutput() {
		return textoutput;
	}

	public void setTextoutput(String textoutput) {
		this.textoutput = textoutput;
	}

	public String getClassificationpg() {
		return classificationpg;
	}

	public void setClassificationpg(String classificationpg) {
		this.classificationpg = classificationpg;
	}

	public String getTotalhours() {
		return totalhours;
	}

	public void setTotalhours(String totalhours) {
		this.totalhours = totalhours;
	}

	public Integer getHalfprice() {
		return halfprice;
	}

	public void setHalfprice(Integer halfprice) {
		this.halfprice = halfprice;
	}

	
	
}
