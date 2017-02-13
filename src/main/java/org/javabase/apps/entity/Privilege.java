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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author medisys
 *
 */
@Entity
@Table(name="privilege")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="privilegeId")
public class Privilege implements Serializable{
	
	private static final long serialVersionUID = 3208533250194362271L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="privilege_id", unique=true, nullable=false)
	private Integer privilegeId;
	
	@Column(name="privilege_name", nullable=false, length=45)
	private String privilegeName;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="privilege")
	private Set<UserPrivilege> userPrivilege = new HashSet<UserPrivilege>(0);

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

	public Set<UserPrivilege> getUserPrivilege() {
		return userPrivilege;
	}

	public void setUserPrivilege(Set<UserPrivilege> userPrivilege) {
		this.userPrivilege = userPrivilege;
	}
	
}
