/**
 * 
 */
package org.javabase.apps.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Entity
@Table(name="user")
public class User implements Serializable{

	private static final long serialVersionUID = 7790622876833971743L;
	
	private Integer userid;
    private Role role;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String isactive;
    private Date regdate;
    private String isnonexpired;
    private String isnonlocked;
    private Date expDate;

   public User() {
   }

	
   public User(Role role, String username, String password, String email) {
       this.role = role;
       this.username = username;
       this.password = password;
       this.email = email;
   }
   public User(Role role, String username, String password, String email, String firstName, String lastName, String phone, String isactive, Date regdate, String isnonexpired, String isnonlocked, Date expDate) {
      this.role = role;
      this.username = username;
      this.password = password;
      this.email = email;
      this.firstName = firstName;
      this.lastName = lastName;
      this.phone = phone;
      this.isactive = isactive;
      this.regdate = regdate;
      this.isnonexpired = isnonexpired;
      this.isnonlocked = isnonlocked;
      this.expDate = expDate;
   }
  
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="userid", unique=true, nullable=false)
   public Integer getUserid() {
       return this.userid;
   }
   
   public void setUserid(Integer userid) {
       this.userid = userid;
   }

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
       return this.username;
   }
   
   public void setUsername(String username) {
       this.username = username;
   }

   
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

   
   @Column(name="isactive")
   public String getIsactive() {
       return this.isactive;
   }
   
   public void setIsactive(String isactive) {
       this.isactive = isactive;
   }

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name="regdate", length=19)
   public Date getRegdate() {
       return this.regdate;
   }
   
   public void setRegdate(Date regdate) {
       this.regdate = regdate;
   }

   
   @Column(name="isnonexpired")
   public String getIsnonexpired() {
       return this.isnonexpired;
   }
   
   public void setIsnonexpired(String isnonexpired) {
       this.isnonexpired = isnonexpired;
   }

   
   @Column(name="isnonlocked")
   public String getIsnonlocked() {
       return this.isnonlocked;
   }
   
   public void setIsnonlocked(String isnonlocked) {
       this.isnonlocked = isnonlocked;
   }

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name="expDate", length=19)
   public Date getExpDate() {
       return this.expDate;
   }
   
   public void setExpDate(Date expDate) {
       this.expDate = expDate;
   }

	

}
