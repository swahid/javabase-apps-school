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
@Table(name = "setup_school")
public class SetupSchool implements java.io.Serializable {

    private static final long serialVersionUID = 6543749333542756492L;

    private Integer schoolId;
    private String  schoolName;
    private String  schoolType;
    private String  addressLine1;
    private String  addressLine2;
    private String  city;
    private String  state;
    private String  postcode;
    private String  district;
    private String  country;
    private Date    establishedDate;
    private Date    openTime;
    private Date    closeTime;
    private String  schoolLogo;
    private String  schoolBanner;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "school_id", unique = true, nullable = false)
    public Integer getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Column(name = "school_name", length = 45)
    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Column(name = "school_Type", length = 45)
    public String getSchoolType() {
        return this.schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    @Column(name = "address_line1", length = 100)
    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Column(name = "address_line2", length = 100)
    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @Column(name = "city", length = 20)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "state", length = 20)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "postcode", length = 10)
    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Column(name = "district", length = 45)
    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Column(name = "country", length = 45)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "established_date", length = 19)
    public Date getEstablishedDate() {
        return this.establishedDate;
    }

    public void setEstablishedDate(Date establishedDate) {
        this.establishedDate = establishedDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "open_time", length = 19)
    public Date getOpenTime() {
        return this.openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "close_time", length = 19)
    public Date getCloseTime() {
        return this.closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    @Column(name = "school_logo", length = 45)
    public String getSchoolLogo() {
        return this.schoolLogo;
    }

    public void setSchoolLogo(String schoolLogo) {
        this.schoolLogo = schoolLogo;
    }

    @Column(name = "school_banner", length = 45)
    public String getSchoolBanner() {
        return this.schoolBanner;
    }

    public void setSchoolBanner(String schoolBanner) {
        this.schoolBanner = schoolBanner;
    }

}
