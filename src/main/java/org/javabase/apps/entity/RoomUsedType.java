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
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version 1.0.0
 * @since   1.0.0
 */
@Entity
@Table(name = "room_used_type")
public class RoomUsedType implements java.io.Serializable {

	private static final long serialVersionUID = -8333692961138855101L;
	private Integer roomUsedId;
    private Integer insId;
    private String usedName;
    private String details;
    private Date entryDate;
    private Date updateDate;
    private Integer entryUser;
    private Integer updateUser;

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "room_used_id", unique = true, nullable = false)
    public Integer getRoomUsedId() {
        return this.roomUsedId;
    }

    public void setRoomUsedId(Integer roomUsedId) {
        this.roomUsedId = roomUsedId;
    }

    @Column(name = "ins_id", length = 45)
    public Integer getInsId() {
        return this.insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    @Column(name = "used_name", length = 45)
    public String getUsedName() {
        return this.usedName;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date", length = 19)
    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Column(name = "entry_user")
    public Integer getEntryUser() {
        return this.entryUser;
    }

    public void setEntryUser(Integer entryUser) {
        this.entryUser = entryUser;
    }

    @Column(name = "update_user")
    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

}
