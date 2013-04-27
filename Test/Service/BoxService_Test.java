package Service;

import junit.framework.TestCase;

public class BoxService_Test extends TestCase{
	
	BoxService boxService;
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		boxService=new BoxService();
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
	public void testIncreaseBoxService(){
		assertTrue(boxService.IncreaseBoxService(4, 19, 4));
	}
	

}
