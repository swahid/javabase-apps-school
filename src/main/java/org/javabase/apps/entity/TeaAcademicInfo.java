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
@Table(name = "tea_academic_info")
public class TeaAcademicInfo implements java.io.Serializable {

	private static final long serialVersionUID = 4987785524993652227L;
	private Integer teaAcaInfoId;
    private Integer teacherId;
    private String degreeName;
    private String titile;
    private String passingYear;
    private String session;
    private String institution;
    private String board;
    private String result;
    private String gpa;
    private String comments;
    private Integer entryUser;
    private Date entryDate;
    private Integer updateUser;
    private Date updateDate;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "tea_aca_info_id", unique = true, nullable = false)
    public Integer getTeaAcaInfoId() {
        return this.teaAcaInfoId;
    }

    public void setTeaAcaInfoId(Integer teaAcaInfoId) {
        this.teaAcaInfoId = teaAcaInfoId;
    }

    @Column(name = "teacher_id")
    public Integer getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Column(name = "degree_name", length = 45)
    public String getDegreeName() {
        return this.degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    @Column(name = "titile", length = 45)
    public String getTitile() {
        return this.titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    @Column(name = "passing_year", length = 4)
    public String getPassingYear() {
        return this.passingYear;
    }

    public void setPassingYear(String passingYear) {
        this.passingYear = passingYear;
    }

    @Column(name = "session", length = 45)
    public String getSession() {
        return this.session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Column(name = "institution", length = 45)
    public String getInstitution() {
        return this.institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Column(name = "board", length = 45)
    public String getBoard() {
        return this.board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    @Column(name = "result", length = 45)
    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Column(name = "gpa", length = 45)
    public String getGpa() {
        return this.gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Column(name = "comments", length = 45)
    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Column(name = "entry_user")
    public Integer getEntryUser() {
        return this.entryUser;
    }

    public void setEntryUser(Integer entryUser) {
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

    @Column(name = "update_user")
    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
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

}
