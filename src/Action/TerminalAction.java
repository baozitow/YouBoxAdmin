package Action;

import java.util.ArrayList;

import Beans.Terminal;
import DAO.TerminalDao;

import com.opensymphony.xwork2.ActionSupport;

public class TerminalAction extends ActionSupport{
	
	private int terminalId;

	private TerminalDao terminalDao;
	
	ArrayList<Terminal> terminals;

	
	public String returnAllTerminals(){
		terminalDao=new TerminalDao();
		terminals=terminalDao.returnAllTermials();
		
		for(Terminal t:terminals){
			t.print();
		}
		
		
		return "success";
	}
	public String edit(){
		System.out.println("terminalID ------->"+terminalId);
		return "success";
	}
	
	
	
	public int getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(int terminalId) {
		this.terminalId = terminalId;
	}
	
	
	
	public ArrayList<Terminal> getTerminals() {
		return terminals;
	}
	public void setTerminals(ArrayList<Terminal> terminals) {
		this.terminals = terminals;
	}
	
	
	
	
}
