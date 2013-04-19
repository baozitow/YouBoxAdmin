package Action;

import com.opensymphony.xwork2.ActionSupport;

public class TerminalAction extends ActionSupport{
	
	private int terminalId;


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
}
