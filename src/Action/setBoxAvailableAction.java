package Action;

import DAO.BoxDao;

import com.opensymphony.xwork2.ActionSupport;

public class setBoxAvailableAction extends ActionSupport{
	
	private int boxNum;
	private int terminalId;
	
	BoxDao boxDao;
	
	
	public String execute(){
		boxDao=new BoxDao();
		if(boxDao.setBoxAvailable(terminalId, boxNum)){
			return "success";
		}else{
			return "fail";
		}
		
		
	}


	public int getBoxNum() {
		return boxNum;
	}


	public void setBoxNum(int boxNum) {
		this.boxNum = boxNum;
	}


	public int getTerminalId() {
		return terminalId;
	}


	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}

}
