package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import Utils.MySessionFactory;

import Beans.Package;
public class PackageDao {
	
	Transaction tr=null;
	
	public List<Package> PackagesInThisTerminal(int terminalId){
		
		Session session=MySessionFactory.currentSession();
		tr=session.beginTransaction();
		List<Package> packages=null;
		
		Criteria c=session.createCriteria(Package.class);
		c.add(Restrictions.eq("terminalId",terminalId));
		packages=(ArrayList<Package>)c.list();
		
		tr.commit();
		MySessionFactory.closeSession();
		
	
		
		return packages;
		
	}
	
	public Package getPackageDetailsByID(int packageId){
		
		Session session=MySessionFactory.currentSession();
		tr=session.beginTransaction();
		Package p=null;
		p=(Package) session.get(Package.class, packageId);
		session.getTransaction().commit();
		MySessionFactory.closeSession();
		
		p.print();
		return p;

	}
	
	public List<Package> getPacakgeDetailsByBoxNum(int boxNum){
		Session session=MySessionFactory.currentSession();
		tr=session.beginTransaction();
		List<Package> packages=null;
		
		Criteria c=session.createCriteria(Package.class);
		c.add(Restrictions.eq("boxId",boxNum));
		c.add(Restrictions.eq("packageStatus",0));
		packages=(ArrayList<Package>)c.list();
		
		tr.commit();
		
		MySessionFactory.closeSession();
		
	
		return  packages;
		
		
	}
}
