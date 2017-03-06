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
@Table(name = "institution_info")
public class InstitutionInfo implements java.io.Serializable {

	private static final long serialVersionUID = -5440237415943326862L;
	private Integer insId;
    private Integer categoryId;
    private String insName;
    private String insCode;
    private String upazila;
    private String category;
    private String situated;
    private String address;
    private String postalCode;
    private String mailAddress;
    private String webAddress;
    private Date entryDate;
    private Date updateDate;
    private Integer entryUser;
    private Integer updateuser;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "ins_id", unique = true, nullable = false)
    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    @Column(name = "category_id")
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "ins_name", length = 45)
    public String getInsName() {
        return this.insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    @Column(name = "ins_code", length = 45)
    public String getInsCode() {
        return this.insCode;
    }

    public void setInsCode(String insCode) {
        this.insCode = insCode;
    }

    @Column(name = "upazila", length = 45)
    public String getUpazila() {
        return this.upazila;
    }

    public void setUpazila(String upazila) {
        this.upazila = upazila;
    }

    @Column(name = "category", length = 45)
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name = "situated", length = 45)
    public String getSituated() {
        return this.situated;
    }

    public void setSituated(String situated) {
        this.situated = situated;
    }

    @Column(name = "address", length = 45)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "postal_code", length = 45)
    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Column(name = "mail_address", length = 45)
    public String getMailAddress() {
        return this.mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Column(name = "web_address", length = 45)
    public String getWebAddress() {
        return this.webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "entryDate", length = 19)
    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updateDate", length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "entryUser")
    public Integer getEntryUser() {
        return this.entryUser;
    }

    public void setEntryUser(Integer entryUser) {
        this.entryUser = entryUser;
    }

    @Column(name = "updateuser")
    public Integer getUpdateuser() {
        return this.updateuser;
    }

    public void setUpdateuser(Integer updateuser) {
        this.updateuser = updateuser;
    }

}
