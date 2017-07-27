package com.mygate.dal.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * MobileFoodFacilityPermit entity.
 * 
 * @author MyEclipse Persistence Tools
 */

@XmlRootElement
@XmlAccessorType(value=XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MobileFoodFacilityPermit implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Long locationid;
	private String applicant;
	private String facilityType;
	private Long cnn;
	private String locationDescription;
	private String address;
	private String blocklot;
	private String block;
	private String lot;
	private String permit;
	private String status;
	private String foodItems;
	private Double x;
	private Double y;
	private Double latitude;
	private Double longitude;
	private String schedule;
	private String dayshours;
	private String noisent;
	private String approved;
	private Date received;
	private Integer priorPermit;
	private String expirationDate;
	private String location;

	// Constructors

	/** default constructor */
	public MobileFoodFacilityPermit() {
	}

	/** full constructor */
	public MobileFoodFacilityPermit(Long locationid, String applicant,
			String facilityType, Long cnn, String locationDescription,
			String address, String blocklot, String block, String lot,
			String permit, String status, String foodItems, Double x, Double y,
			Double latitude, Double longitude, String schedule,
			String dayshours, String noisent, String approved, Date received,
			Integer priorPermit, String expirationDate, String location) {
		this.locationid = locationid;
		this.applicant = applicant;
		this.facilityType = facilityType;
		this.cnn = cnn;
		this.locationDescription = locationDescription;
		this.address = address;
		this.blocklot = blocklot;
		this.block = block;
		this.lot = lot;
		this.permit = permit;
		this.status = status;
		this.foodItems = foodItems;
		this.x = x;
		this.y = y;
		this.latitude = latitude;
		this.longitude = longitude;
		this.schedule = schedule;
		this.dayshours = dayshours;
		this.noisent = noisent;
		this.approved = approved;
		this.received = received;
		this.priorPermit = priorPermit;
		this.expirationDate = expirationDate;
		this.location = location;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getLocationid() {
		return this.locationid;
	}

	public void setLocationid(Long locationid) {
		this.locationid = locationid;
	}

	public String getApplicant() {
		return this.applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getFacilityType() {
		return this.facilityType;
	}

	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}

	public Long getCnn() {
		return this.cnn;
	}

	public void setCnn(Long cnn) {
		this.cnn = cnn;
	}

	public String getLocationDescription() {
		return this.locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBlocklot() {
		return this.blocklot;
	}

	public void setBlocklot(String blocklot) {
		this.blocklot = blocklot;
	}

	public String getBlock() {
		return this.block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getLot() {
		return this.lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getPermit() {
		return this.permit;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFoodItems() {
		return this.foodItems;
	}

	public void setFoodItems(String foodItems) {
		this.foodItems = foodItems;
	}

	public Double getX() {
		return this.x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return this.y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getDayshours() {
		return this.dayshours;
	}

	public void setDayshours(String dayshours) {
		this.dayshours = dayshours;
	}

	public String getNoisent() {
		return this.noisent;
	}

	public void setNoisent(String noisent) {
		this.noisent = noisent;
	}

	public String getApproved() {
		return this.approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public Date getReceived() {
		return this.received;
	}

	public void setReceived(Date received) {
		this.received = received;
	}

	public Integer getPriorPermit() {
		return this.priorPermit;
	}

	public void setPriorPermit(Integer priorPermit) {
		this.priorPermit = priorPermit;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}