package DAO;

import junit.framework.TestCase;

public class AdminDAO_Test extends TestCase{
	
	
	AdminDao adminDao;
	
	protected void setUp() throws Exception {
		super.setUp();
		adminDao=new AdminDao();
	}
	public void testGetAdmin_By_Username_And_Password(){
		assertNotNull(adminDao.get("leo", "123"));
		assertNull(adminDao.get("leo","234"));
		assertEquals(Beans.Admin.class, adminDao.get("leo", "123").getClass());
	}

}
