package Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "terminal")
public class Terminal {

	private int terminalId;
	private int branchId;
	private String name;
	private String softVer;
	private String hardVer;
	private int status;
	
	public String branchName;
	
	

	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "terminal_id", unique = true, nullable = false)
	public int getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}

	@Column(name="terminal_branch_id")
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
		
		if(branchId==3){
			this.branchName="交通厅";
		}else if(branchId==5){
			this.branchName="软件园";
		}else{
			this.branchName="╮(╯﹏╰）╭";
		}
	}
	
	@Column(name="terminal_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="terminal_softVer")
	public String getSoftVer() {
		return softVer;
	}
	public void setSoftVer(String softVer) {
		this.softVer = softVer;
	}
	
	@Column(name="terminal_hardVer")
	public String getHardVer() {
		return hardVer;
	}
	public void setHardVer(String hardVer) {
		this.hardVer = hardVer;
	}
	
	@Column(name="terminal_status")
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	


		

	
	
	
	
	public void print(){
		System.out.println("--------------------------------");
		System.out.println("Terminal ID: "+terminalId);
		System.out.println("Terminal Name: "+name);
		System.out.println("Branch Name:"+branchName);
	}
	
	
}
