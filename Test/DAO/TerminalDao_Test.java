package DAO;

import java.util.ArrayList;

import Beans.Terminal;
import junit.framework.TestCase;

public class TerminalDao_Test extends TestCase{
	
	TerminalDao terminalDao;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		terminalDao=new TerminalDao();
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	public void TestReturnAllTerminal(){
		ArrayList<Terminal> terminals=terminalDao.returnAllTermials();
		assertNotNull(terminals);
		for(Terminal t:terminals){
			t.print();
		}
		
	}
	
	public void testreturnTermialByBranchID(){
		ArrayList<Terminal> terminals=terminalDao.returnTermialByBranchID(3);
		assertNotNull(terminals);
		for(Terminal t:terminals){
			t.print();
		}
	}

}
