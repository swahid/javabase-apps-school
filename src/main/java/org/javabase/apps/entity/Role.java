/**
 * 
 */
package org.javabase.apps.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Entity
@Table(name="role")
public class Role implements Serializable{

	private static final long serialVersionUID = 7406695508037970942L;

    private Integer roleId;
    private String roleName;
	private Set<User> users = new HashSet<User>(0);
	private Set<UserPrivilege> userPrivilege = new HashSet<UserPrivilege>(0);

  
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="roleid", unique=true, nullable=false)
   public Integer getRoleid() {
       return this.roleId;
   }
   
   public void setRoleid(Integer roleid) {
       this.roleId = roleid;
   }

   @Column(name="rolename", nullable=false, length=45)
   public String getRolename() {
       return this.roleName;
   }
   
   public void setRolename(String rolename) {
       this.roleName = rolename;
   }

   @OneToMany(fetch=FetchType.LAZY, mappedBy="role")
   public Set<User> getUsers() {
       return this.users;
   }
   
   public void setUsers(Set<User> users) {
       this.users = users;
   }

   @OneToMany(fetch=FetchType.LAZY, mappedBy="role")
	public Set<UserPrivilege> getPrivilege() {
		return userPrivilege;
	}
	
	public void setPrivilege(Set<UserPrivilege> userPrivilege) {
		this.userPrivilege = userPrivilege;
	}
   
   
	
}
