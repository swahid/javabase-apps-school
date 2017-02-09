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
@Table(name="privilege")
public class Privilege implements Serializable{

	private static final long serialVersionUID = 6326470270248586972L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="privilege_id", unique=true, nullable=false)
	private Integer privilegeId;
	
	@Column(name="privilege_name", nullable=false, length=45)
	private String privilegeName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="roleid", nullable=false)
	private Role role;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userid", nullable=false)
	private User user;

	public Integer getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(Integer privilegeId) {
		this.privilegeId = privilegeId;
	}

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
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
	
}
