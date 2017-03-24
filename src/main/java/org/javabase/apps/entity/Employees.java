package org.javabase.apps.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Entity
@Table(name = "employees")
public class Employees implements java.io.Serializable {
	
	private static final long serialVersionUID = 1313641502426903858L;
	
	private Integer userId;
	private User    user;
	private String 	employeeID;
	private String 	employeePost;
	private Date 	joinDate;
	private Date 	registerDate;
	private Date 	updateDate;

    @GenericGenerator(name = "generator", strategy = "foreign", 
            parameters = @Parameter(name = "property", value = "user"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "user_id", unique = true, nullable = false)
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @OneToOne(fetch=FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
	
   @Column(name = "employee_id", length = 45)
    public String getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    @Column(name = "employee_post", length = 45)
    public String getEmployeePost() {
    	return this.employeePost;
    }
    
    public void setEmployeePost(String employeePost) {
    	this.employeePost = employeePost;
    }

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "join_date", length = 19)
	public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "register_date", length = 19)
	public Date getRegisterDate() {
		return this.registerDate;
	}
	
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date", length = 19)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


}
