package org.javabase.apps.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Entity
@Table(name = "class_section")
public class ClassSection implements java.io.Serializable {

	private static final long serialVersionUID = 6759632239272891147L;
	
	private Integer secId;
    private int shiftClaId;
    private String secName;
    private String className;
    private String shiftName;
    private String details;
    private Date entryDate;
    private int entryUser;
    private Date updateDate;
    private int updateUser;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "sec_id", unique = true, nullable = false)
    public Integer getSecId() {
        return this.secId;
    }

    public void setSecId(Integer secId) {
        this.secId = secId;
    }

    @Column(name = "shift_cla_id")
    public Integer getShiftClaId() {
    	return shiftClaId;
    }
    
    public void setShiftClaId(Integer shiftClaId) {
    	this.shiftClaId = shiftClaId;
    }
    
    @Column(name = "sec_name", length = 45)
    public String getSecName() {
        return this.secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    @Column(name = "details",  length = 100)
    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "entry_date", length = 19)
    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Column(name = "entry_user")
    public int getEntryUser() {
        return this.entryUser;
    }

    public void setEntryUser(int entryUser) {
        this.entryUser = entryUser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date",  length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "update_user")
    public int getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(int updateUser) {
        this.updateUser = updateUser;
    }

    @Column(name = "class_name", length = 45)
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Column(name = "shift_name", length = 45)
    public String getShiftName() {
        return shiftName;
    }

    public void setShiftName(String shiftName) {
        this.shiftName = shiftName;
    }
    
}
