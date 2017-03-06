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
@Table(name = "teacher_post")
public class TeacherPost implements java.io.Serializable {

	private static final long serialVersionUID = -3670465799534855391L;
	private Integer teaPostId;
    private Integer insId;
    private String subName;
    private String degignation;
    private String activity;
    private String details;
    private Date entryDate;
    private Integer entryUser;
    private Date updateDate;
    private Integer updateUser;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "tea_post_id", unique = true, nullable = false)
    public Integer getTeaPostId() {
        return this.teaPostId;
    }

    public void setTeaPostId(Integer teaPostId) {
        this.teaPostId = teaPostId;
    }

    @Column(name = "ins_id")
    public Integer getInsId() {
        return this.insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    @Column(name = "sub_name", length = 45)
    public String getSubName() {
        return this.subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    @Column(name = "degignation", length = 50)
    public String getDegignation() {
        return this.degignation;
    }

    public void setDegignation(String degignation) {
        this.degignation = degignation;
    }

    @Column(name = "activity", length = 45)
    public String getActivity() {
        return this.activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Column(name = "details", length = 45)
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
    public Integer getEntryUser() {
        return this.entryUser;
    }

    public void setEntryUser(Integer entryUser) {
        this.entryUser = entryUser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date", length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "update_user")
    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

}
