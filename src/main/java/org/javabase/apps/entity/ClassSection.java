package org.javabase.apps.entity;
// Generated Jan 10, 2017 12:47:22 PM by Hibernate Tools 3.6.0

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
 * ClassSection generated by hbm2java
 */
@Entity
@Table(name = "class_section", catalog = "jschool"
)
public class ClassSection implements java.io.Serializable {

	private static final long serialVersionUID = 6759632239272891147L;
	private Integer secId;
    private int classId;
    private String secName;
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

    @Column(name = "class_id")
    public int getClassId() {
        return this.classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
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

}
