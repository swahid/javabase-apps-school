/**
 * 
 */
package org.javabase.apps.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Entity
@Table(name="user")
public class User implements Serializable{

	private static final long serialVersionUID = 7790622876833971743L;
	
	private Integer userId;
    private Role role;
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String isActive;
    private Date regdate;
    private String isNonExpired;
    private String isNonLocked;
    private Date expDate;
    private Set<UserPrivilege> userPrivilege = new HashSet<UserPrivilege>(0);

  
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="userid", unique=true, nullable=false)
   public Integer getUserid() {
       return this.userId;
   }
   
   public void setUserid(Integer userid) {
       this.userId = userid;
   }

   @JsonManagedReference
   @ManyToOne(fetch=FetchType.LAZY)
   @JoinColumn(name="roleid", nullable=false)
   public Role getRole() {
       return this.role;
   }
   
   public void setRole(Role role) {
       this.role = role;
   }

   
   @Column(name="username", nullable=false, length=45)
   public String getUsername() {
       return this.userName;
   }
   
   public void setUsername(String username) {
       this.userName = username;
   }

   @JsonIgnore
   @Column(name="password", nullable=false, length=45)
   public String getPassword() {
       return this.password;
   }
   
   public void setPassword(String password) {
       this.password = password;
   }

   
   @Column(name="email", nullable=false, length=45)
   public String getEmail() {
       return this.email;
   }
   
   public void setEmail(String email) {
       this.email = email;
   }

   
   @Column(name="firstName", length=45)
   public String getFirstName() {
       return this.firstName;
   }
   
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   
   @Column(name="lastName", length=45)
   public String getLastName() {
       return this.lastName;
   }
   
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   
   @Column(name="phone", length=45)
   public String getPhone() {
       return this.phone;
   }
   
   public void setPhone(String phone) {
       this.phone = phone;
   }

   
   @Column(name="isactive", length=45)
   public String getIsactive() {
       return this.isActive;
   }
   
   public void setIsactive(String isactive) {
       this.isActive = isactive;
   }

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name="regdate", length=19)
   public Date getRegdate() {
       return this.regdate;
   }
   
   public void setRegdate(Date regdate) {
       this.regdate = regdate;
   }

   
   @Column(name="isnonexpired", length=45)
   public String getIsnonexpired() {
       return this.isNonExpired;
   }
   
   public void setIsnonexpired(String isnonexpired) {
       this.isNonExpired = isnonexpired;
   }

   
   @Column(name="isnonlocked", length=45)
   public String getIsnonlocked() {
       return this.isNonLocked;
   }
   
   public void setIsnonlocked(String isnonlocked) {
       this.isNonLocked = isnonlocked;
   }

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name="expDate", length=19)
   public Date getExpDate() {
       return this.expDate;
   }
   
   public void setExpDate(Date expDate) {
       this.expDate = expDate;
   }

   @JsonBackReference
   @OneToMany(fetch=FetchType.LAZY, mappedBy="user")
	public Set<UserPrivilege> getPrivilege() {
		return userPrivilege;
	}
	
	public void setPrivilege(Set<UserPrivilege> userPrivilege) {
		this.userPrivilege = userPrivilege;
	}
}
