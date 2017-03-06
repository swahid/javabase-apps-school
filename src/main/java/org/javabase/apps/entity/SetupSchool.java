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
@Table(name = "setup_system")
public class SetupSchool implements java.io.Serializable {

    private static final long serialVersionUID = 6543749333542756492L;

    private Integer systemId;
    private String  systemName;
    private String  systemType;
    private String  systemEmail;
    private Integer  sessionId;
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
    private String  systemLogo;
    private String  systemBanner;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "system_id", unique = true, nullable = false)
    public Integer getSchoolId() {
        return this.systemId;
    }

    public void setSchoolId(Integer systemId) {
        this.systemId = systemId;
    }

    @Column(name = "system_name", length = 45)
    public String getSchoolName() {
        return this.systemName;
    }

    public void setSchoolName(String systemName) {
        this.systemName = systemName;
    }

    @Column(name = "system_Type", length = 45)
    public String getSchoolType() {
        return this.systemType;
    }

    public void setSchoolType(String systemType) {
        this.systemType = systemType;
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

    @Column(name = "system_logo", length = 45)
    public String getSchoolLogo() {
        return this.systemLogo;
    }

    public void setSchoolLogo(String systemLogo) {
        this.systemLogo = systemLogo;
    }

    @Column(name = "system_banner", length = 45)
    public String getSchoolBanner() {
        return this.systemBanner;
    }

    public void setSchoolBanner(String systemBanner) {
        this.systemBanner = systemBanner;
    }

    @Column(name = "system_email", length = 45)
    public String getSystemEmail() {
        return systemEmail;
    }

    public void setSystemEmail(String systemEmail) {
        this.systemEmail = systemEmail;
    }

    @Column(name = "session_id")
    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    
}
