package DAO;

import java.util.List;

import junit.framework.TestCase;
import Beans.Box;

public class BoxDao_Test extends TestCase{

	 BoxDao boxDao;
	 
	protected void setUp() throws Exception {
		boxDao=new BoxDao();
	}
	
	public void preparetestBoxStatusInThisTerminal(){
		List<Box> boxes=boxDao.boxStatusInThisTerminal(1);
		assertEquals(true, boxes.iterator().hasNext());
	}
	public void TestSetBoxAvailable(){
		assertEquals(true, boxDao.setBoxAvailable(1, 4));
	}
	
	public void testAddBox(){
		assertTrue(boxDao.addBox(4,2,1));
		
	}
	
}
