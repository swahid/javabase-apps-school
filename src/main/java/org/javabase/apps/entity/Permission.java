package org.javabase.apps.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Entity
@Table(name = "permission", uniqueConstraints = @UniqueConstraint(columnNames = { "perm_name","perm_code" }))
public class Permission implements java.io.Serializable {

	private static final long serialVersionUID = 1116683549304036088L;
	private Integer permId;
	private String permName;
	private String displayName;
	private String description;
	private String flag;
	private int permCode;
	private Set<RolePermission> rolePermissions = new HashSet<RolePermission>(0);

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "perm_id", unique = true, nullable = false, length=10)
	public Integer getPermId() {
		return this.permId;
	}

	public void setPermId(Integer permId) {
		this.permId = permId;
	}

	@Column(name = "perm_name", nullable = false, length = 50)
	public String getPermName() {
		return this.permName;
	}

	public void setPermName(String permName) {
		this.permName = permName;
	}

	@Column(name = "display_name", length = 100)
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Column(name = "description", length = 500)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "flag", length = 45)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "perm_code", nullable = false)
	public int getPermCode() {
		return this.permCode;
	}

	public void setPermCode(int permCode) {
		this.permCode = permCode;
	}

//	@JsonBackReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "permission")
	public Set<RolePermission> getRolePermissions() {
		return this.rolePermissions;
	}

	public void setRolePermissions(Set<RolePermission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}

}
