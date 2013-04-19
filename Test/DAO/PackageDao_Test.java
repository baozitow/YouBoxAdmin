package DAO;

import java.util.List;
import Beans.Package;

import junit.framework.TestCase;

public class PackageDao_Test extends TestCase{
	
	PackageDao packageDao;
	
	protected void setUp() throws Exception {

		packageDao=new PackageDao();
	}
	public void PreparetestPackagesInThisTerminal(){
		List<Package> packages=packageDao.PackagesInThisTerminal(1);
		assertNotNull(packages);
//		for(Package p:packages){
//			p.print();
//			
//		}
		assertEquals(true, packages.iterator().hasNext());

		
	}
	
	public void PreparetestGetPackageDetailsByID(){
		assertNotNull(packageDao.getPackageDetailsByID(23));
	}
	
	public void testGetPacakgeDetailsByBoxNum(){
		List<Package> packages=packageDao.getPacakgeDetailsByBoxNum(4);
		assertNotNull(packages);
		for(Package p:packages){
			p.print();
			
		}
		assertEquals(true, packages.iterator().hasNext());
		
	}
	

}
