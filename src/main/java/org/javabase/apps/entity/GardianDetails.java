package org.javabase.apps.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Entity
@Table(name = "gardian_details")
public class GardianDetails implements java.io.Serializable {

	private static final long serialVersionUID = -4134914308672214987L;
	private int userId;
	private String address;
	private String company;
	private String gardianName;
	private String homeDistrict;
	private String jobPosition;
	private String nidNo;
	private String officeAddress;
	private String officeContact;
	private String profession;
	private String relation;
	private Integer studentId;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "address", length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "company", length = 45)
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Column(name = "gardian_name", length = 45)
	public String getGardianName() {
		return this.gardianName;
	}

	public void setGardianName(String gardianName) {
		this.gardianName = gardianName;
	}

	@Column(name = "home_district", length = 45)
	public String getHomeDistrict() {
		return this.homeDistrict;
	}

	public void setHomeDistrict(String homeDistrict) {
		this.homeDistrict = homeDistrict;
	}

	@Column(name = "job_position", length = 45)
	public String getJobPosition() {
		return this.jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	@Column(name = "nid_no", length = 45)
	public String getNidNo() {
		return this.nidNo;
	}

	public void setNidNo(String nidNo) {
		this.nidNo = nidNo;
	}

	@Column(name = "office_address", length = 45)
	public String getOfficeAddress() {
		return this.officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	@Column(name = "office_contact", length = 45)
	public String getOfficeContact() {
		return this.officeContact;
	}

	public void setOfficeContact(String officeContact) {
		this.officeContact = officeContact;
	}

	@Column(name = "profession", length = 45)
	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Column(name = "relation", length = 45)
	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	@Column(name = "student_id")
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

}
