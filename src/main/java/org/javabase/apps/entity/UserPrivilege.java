/**
 * 
 */
package org.javabase.apps.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author medisys
 *
 */
@Entity
@Table(name="user_privilege")
public class UserPrivilege implements Serializable{

	private static final long serialVersionUID = 6326470270248586972L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="user_privilege_id", unique=true, nullable=false)
	private Integer userPrivilegeId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="roleid", nullable=false)
	private Role role;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userid", nullable=false)
	private User user;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="privilege_id", nullable=false)
	private Privilege privilege;

	public Integer getUserPrivilegeId() {
		return userPrivilegeId;
	}

	public void setUserPrivilegeId(Integer userPrivilegeId) {
		this.userPrivilegeId = userPrivilegeId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

}
