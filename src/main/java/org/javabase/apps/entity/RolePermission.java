package org.javabase.apps.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Entity
@Table(name = "role_permission")
public class RolePermission implements java.io.Serializable {

	private static final long serialVersionUID = -7334936128251489259L;
	private Integer rolePermId;
	private Role role;
	private Permission permission;
	private boolean isActive;
	private Integer grantUser;
	private Date grantDate;
	private Integer revokeUser;
	private Date revokeDate;
	private String flag;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "role_perm_id", unique = true, nullable = false)
	public Integer getRolePermId() {
		return this.rolePermId;
	}

	public void setRolePermId(Integer rolePermId) {
		this.rolePermId = rolePermId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "perm_id", nullable = false)
	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	@Column(name = "is_active", nullable = false)
	public boolean isIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "grant_user")
	public Integer getGrantUser() {
		return this.grantUser;
	}

	public void setGrantUser(Integer grantUser) {
		this.grantUser = grantUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "grant_date", length = 19)
	public Date getGrantDate() {
		return this.grantDate;
	}

	public void setGrantDate(Date grantDate) {
		this.grantDate = grantDate;
	}

	@Column(name = "revoke_user")
	public Integer getRevokeUser() {
		return this.revokeUser;
	}

	public void setRevokeUser(Integer revokeUser) {
		this.revokeUser = revokeUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "revoke_date", length = 19)
	public Date getRevokeDate() {
		return this.revokeDate;
	}

	public void setRevokeDate(Date revokeDate) {
		this.revokeDate = revokeDate;
	}

	@Column(name = "flag", length = 10)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}
