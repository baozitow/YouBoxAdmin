package Beans;

import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "package")
public class Package {
	
	private int packageId;
	private int terminalId;
	private long userPhone;
	private String parcelId;
	private int courierId;
	private int boxId;
	private Timestamp storeTime;
	private Timestamp getTime;
	private String courierCorp;
	private int packageStatus;
	
	
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "package_id", unique = true, nullable = false)
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	
	@Column(name="package_terminal_id")
	public int getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}
	
	@Column(name="package_user_mobile_num")
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	
	@Column(name="package_parcel_id")
	public String getParcelId() {
		return parcelId;
	}
	public void setParcelId(String parcelId) {
		this.parcelId = parcelId;
	}
	
	@Column(name="package_courier_id")
	public int getCourierId() {
		return courierId;
	}
	public void setCourierId(int courierId) {
		this.courierId = courierId;
	}
	
	@Column(name="package_box_id")
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	
	@Column(name="package_store_time")
	public Timestamp getStoreTime() {
		return storeTime;
	}
	public void setStoreTime(Timestamp storeTime) {
		this.storeTime = storeTime;
	}
	
	@Column(name="package_get_time")
	public Timestamp getGetTime() {
		return getTime;
	}
	public void setGetTime(Timestamp getTime) {
		this.getTime = getTime;
	}
	
	@Column(name="package_belong")
	public String getCourierCorp() {
		return courierCorp;
	}
	public void setCourierCorp(String courierCorp) {
		this.courierCorp = courierCorp;
	}
	
	@Column(name="package_status")
	public int getPackageStatus() {
		return packageStatus;
	}
	public void setPackageStatus(int packageStatus) {
		this.packageStatus = packageStatus;
	}
	
	
	
	public void print(){
		System.out.println("pacakgeTerminal: "+terminalId);
		System.out.println("pacakge User mobile Num: "+userPhone);
		System.out.println("package package status: "+packageStatus);
		System.out.println("package box id: "+boxId);
		System.out.println("pakcage courier id: "+courierId);
		System.out.println("pakcage Courier Corp. : "+courierCorp);
//		System.out.println("store time: "+storeTime.toString());
//		System.out.println("get time: "+getTime.toString());
		System.out.println("parcel id: "+parcelId);
		System.out.println("---------------------------------------");
	}

}
