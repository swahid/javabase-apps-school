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
@Table(name = "room_info")
public class RoomInfo implements java.io.Serializable {

	private static final long serialVersionUID = 4135325435377052390L;
	private Integer roomId;
    private Integer buildingId;
    private Integer roomUsedId;
    private String floorNo;
    private String roomName;
    private String roomNo;
    private Integer totalSeat;
    private String size;
    private String usedFor;
    private Date entryDate;
    private Date updateDate;
    private Integer entryUser;
    private Integer updateUser;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "room_id", unique = true, nullable = false)
    public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

    @Column(name = "building_id")
    public Integer getBuildingId() {
        return this.buildingId;
    }

	public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    @Column(name = "room_name", length = 45)
    public String getRoomName() {
        return this.roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
    @Column(name = "floor_no", length = 45)
    public String getFloorNo() {
    	return this.floorNo;
    }
    
    public void setFloorNo(String floorNo) {
    	this.floorNo = floorNo;
    }

    @Column(name = "room_no", length = 45)
    public String getRoomNo() {
        return this.roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    @Column(name = "total_seat")
    public Integer getTotalSeat() {
        return this.totalSeat;
    }

    public void setTotalSeat(Integer totalSeat) {
        this.totalSeat = totalSeat;
    }

    @Column(name = "size", length = 45)
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Column(name = "used_for", length = 45)
    public String getUsedFor() {
        return this.usedFor;
    }

    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
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

    @Column(name = "room_used_id")
    public Integer getRoomUsedId() {
        return this.roomUsedId;
    }

    public void setRoomUsedId(Integer roomUsedId) {
        this.roomUsedId = roomUsedId;
    }

}
