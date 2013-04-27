package Beans;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="boxstatus")

public class Box {

	private int boxId;
	private int terminalId;
	private int boxType;
	private int boxStatus;
	private int boxNum;
	public String boxTypeName;
	
	@GenericGenerator(name="generator",strategy="increment")
	@Id
	@GeneratedValue(generator="generator")
	@Column(name="boxStatus_id",unique=true,nullable=false)
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	
	@Column(name="boxStatus_terminalID")
	public int getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}
	
	@Column(name="boxStatus_boxTypeID")
	public int getBoxType() {
		return boxType;
	}
	public void setBoxType(int boxType) {
		this.boxType = boxType;
		
	    this.boxTypeName="小";
//		if(boxType==1){
//			this.boxTypeName = "����";
//		}else if(boxType==2){
//			this.boxTypeName ="��";
//		}else if(boxType==3){
//			this.boxTypeName="��";
//		}else{
//			this.boxTypeName="С";
//		}
	}
	
	@Column(name="boxStatus_status")
	public int getBoxStatus() {
		return boxStatus;
	}
	public void setBoxStatus(int boxStatus) {
		this.boxStatus = boxStatus;
	}
	
	@Column(name="boxStatus_boxNum")
	public int getBoxNum() {
		return boxNum;
	}
	public void setBoxNum(int boxNum) {
		this.boxNum = boxNum;
	}
	
	

	
	
	
	
}
