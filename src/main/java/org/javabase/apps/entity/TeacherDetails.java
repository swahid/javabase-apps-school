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

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Entity
@Table(name = "teacher_details")
public class TeacherDetails implements java.io.Serializable {

	private static final long serialVersionUID = -7947438187750407254L;
	private int 	userId;
	private User    user;
	private Date 	createdate;
	private Date 	promotionDate;
	private String 	designation;
	private String 	joinPosition;
	private String 	status;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
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
    
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdate", length = 19)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "promotionDate", length = 19)
	public Date getPromotionDate() {
		return this.promotionDate;
	}
	
	public void setPromotionDate(Date promotionDate) {
		this.promotionDate = promotionDate;
	}

	@Column(name = "designation", length = 45)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	@Column(name = "joinPosition", length = 45)
	public String getJoinPosition() {
		return this.joinPosition;
	}
	
	public void setJoinPosition(String joinPosition) {
		this.joinPosition = joinPosition;
	}
	
	@Column(name = "status", length = 45)
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

}
