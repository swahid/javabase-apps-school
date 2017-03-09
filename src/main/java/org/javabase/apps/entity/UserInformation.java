package org.javabase.apps.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Entity
@Table(name = "user_information")
public class UserInformation implements java.io.Serializable {

    private static final long serialVersionUID = -7772090218042970865L;

    private Integer userId;
    private User    user;
    private String  firstName;
    private String  lastName;
    private String  fatherName;
    private String  motherName;
    private String  spouseName;
    private String  gardianName;
    private String  addressLine1;
    private String  addressLine2;
    private String  city;
    private String  zipCode;
    private String  state;
    private String  country;
    private String  district;
    private String  gender;
    private Boolean isStudent;
    private Boolean isStaff;
    private Boolean isParent;
    private Boolean isTeacher;
    private String  phoneHome;
    private String  phoneOffice;
    private String  phoneMobile;
    private String  emailPrimary;
    private String  emailSecordary;
    private String  phoneEmergency;
    private String  userFlag;
    private Boolean isBlocked;
    private Boolean isDelete;
    private String  entryUser;
    private Date    entryDate;
    private String  updateUser;
    private Date    updateDate;
    private Date    birthdate;
    private String  nationalId;
    private String  birthRegistration;
    private String  userLogo;
    private String  userBanner;

    @GenericGenerator(name = "generator", strategy = "foreign", 
            parameters = @Parameter(name = "property", value = "user"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "user_id", unique = true, nullable = false)
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @OneToOne(fetch=FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "first_name", length = 45)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", length = 45)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "father_name", length = 45)
    public String getFatherName() {
        return this.fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Column(name = "mother_name", length = 45)
    public String getMotherName() {
        return this.motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @Column(name = "spouse_name", length = 45)
    public String getSpouseName() {
        return this.spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    @Column(name = "gardian_name", length = 45)
    public String getGardianName() {
        return this.gardianName;
    }

    public void setGardianName(String gardianName) {
        this.gardianName = gardianName;
    }

    @Column(name = "address_line1", length = 45)
    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Column(name = "address_line2", length = 45)
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
    
    @Column(name = "zip_code", length = 6)
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    @Column(name = "district", length = 20)
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "country", length = 45)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "gender", length = 10)
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "is_student")
    public Boolean getIsStudent() {
        return this.isStudent;
    }

    public void setIsStudent(Boolean isStudent) {
        this.isStudent = isStudent;
    }

    @Column(name = "is_staff")
    public Boolean getIsStaff() {
        return this.isStaff;
    }

    public void setIsStaff(Boolean isStaff) {
        this.isStaff = isStaff;
    }

    @Column(name = "is_parent")
    public Boolean getIsParent() {
        return this.isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    @Column(name = "is_teacher")
    public Boolean getIsTeacher() {
        return this.isTeacher;
    }

    public void setIsTeacher(Boolean isTeacher) {
        this.isTeacher = isTeacher;
    }

    @Column(name = "phone_home", length = 45)
    public String getPhoneHome() {
        return this.phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    @Column(name = "phone_office", length = 45)
    public String getPhoneOffice() {
        return this.phoneOffice;
    }

    public void setPhoneOffice(String phoneOffice) {
        this.phoneOffice = phoneOffice;
    }

    @Column(name = "phone_mobile", length = 45)
    public String getPhoneMobile() {
        return this.phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    @Column(name = "email_primary", length = 45)
    public String getEmailPrimary() {
        return this.emailPrimary;
    }

    public void setEmailPrimary(String emailPrimary) {
        this.emailPrimary = emailPrimary;
    }

    @Column(name = "email_secordary", length = 45)
    public String getEmailSecordary() {
        return this.emailSecordary;
    }

    public void setEmailSecordary(String emailSecordary) {
        this.emailSecordary = emailSecordary;
    }

    @Column(name = "phone_emergency", length = 45)
    public String getPhoneEmergency() {
        return this.phoneEmergency;
    }

    public void setPhoneEmergency(String phoneEmergency) {
        this.phoneEmergency = phoneEmergency;
    }

    @Column(name = "user_flag", length = 45)
    public String getUserFlag() {
        return this.userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }

    @Column(name = "is_blocked")
    public Boolean getIsBlocked() {
        return this.isBlocked;
    }

    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    @Column(name = "is_delete")
    public Boolean getIsDelete() {
        return this.isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    @Column(name = "entry_user", length = 20)
    public String getEntryUser() {
        return this.entryUser;
    }

    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "entry_date", length = 19)
    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Column(name = "update_user", length = 20)
    public String getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date", length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "birthdate", length = 19)
    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Column(name = "national_id", length = 30)
    public String getNationalId() {
        return this.nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    @Column(name = "birth_registration", length = 30)
    public String getBirthRegistration() {
        return this.birthRegistration;
    }

    public void setBirthRegistration(String birthRegistration) {
        this.birthRegistration = birthRegistration;
    }

    @Column(name = "user_logo", length = 100)
    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo;
    }

    @Column(name = "user_banner", length = 100)
    public String getUserBanner() {
        return userBanner;
    }

    public void setUserBanner(String userBanner) {
        this.userBanner = userBanner;
    }

    
}
