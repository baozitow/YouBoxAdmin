package Action;

import java.util.ArrayList;

import Beans.Box;
import DAO.BoxDao;

import com.opensymphony.xwork2.ActionSupport;

public class BoxAction extends ActionSupport{
	
	ArrayList<Box> boxes;
	


	public String boxList(){
		BoxDao boxDao=new BoxDao();
	    boxes=(ArrayList<Box>) boxDao.boxStatusInThisTerminal(3);
		
		return "boxList";
	}
	
	
	
	public ArrayList<Box> getBoxes() {
		return boxes;
	}


	public void setBoxes(ArrayList<Box> boxes) {
		this.boxes = boxes;
	}

}
