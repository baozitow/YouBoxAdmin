package Action;

import java.util.ArrayList;

import Beans.Box;
import DAO.BoxDao;

import com.opensymphony.xwork2.ActionSupport;

public class BoxAction extends ActionSupport{
	
	ArrayList<Box> boxes;
	public int terminalId;


	public String boxList(){
		BoxDao boxDao=new BoxDao();
	    boxes=(ArrayList<Box>) boxDao.boxStatusInThisTerminal(terminalId);
		System.out.println("terminalID: "+terminalId);
		
		return "boxList";
	}
	
	
	
	public ArrayList<Box> getBoxes() {
		return boxes;
	}


	public void setBoxes(ArrayList<Box> boxes) {
		this.boxes = boxes;
	}


	public int getTerminalId() {
		return terminalId;
	}


	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}

	
}
