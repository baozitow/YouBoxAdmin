package DAO;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import Utils.MySessionFactory;
import Beans.Box;
import Beans.Package;

public class BoxDao {

	Transaction tr=null;
	
	public List<Box> boxStatusInThisTerminal(int terminalId){
		
		Session session=MySessionFactory.currentSession();
		tr=session.beginTransaction();
		List<Box> boxes=null;
		
		Criteria c=session.createCriteria(Box.class);
		c.add(Restrictions.eq("terminalId",terminalId)); //select * from boxstatus where box_terminalId=terminalID;
		boxes=(ArrayList<Box>)c.list();
		
		tr.commit();
		
		MySessionFactory.closeSession();
		
	
		
		return boxes;
	}
	
	
	public boolean setBoxAvailable(int terminalId,int boxNum){
		
		Session session=MySessionFactory.currentSession();
		tr=session.beginTransaction();
		List<Box> boxes=null;
		List<Package> packages=null;
		Box box=null;
		Package p=null;
		
		Criteria c=session.createCriteria(Box.class);
		c.add(Restrictions.eq("terminalId",terminalId));
		c.add(Restrictions.eq("boxNum",boxNum));
		
		boxes=(ArrayList<Box>)c.list();
		
		
		
		if(boxes.iterator().hasNext()){
			box=boxes.iterator().next();
			box.setBoxStatus(0);
			session.update(box);
			c=session.createCriteria(Package.class);
			c.add(Restrictions.eq("terminalId",terminalId));
			c.add(Restrictions.eq("boxId",boxNum));
			c.add(Restrictions.eq("packageStatus",0));
			packages=(ArrayList<Package>)c.list();
			
			
			System.out.println("packages number: "+packages.size());
			
			if(packages.iterator().hasNext()){
				for(Package p1:packages){
					p1.setPackageStatus(1);
					session.update(p1);
				}
			}else{
				
				MySessionFactory.closeSession();
				return false;
			}
			
			
		}else{

			MySessionFactory.closeSession();
			return false;
			
		}
		
		

		
		tr.commit();
		MySessionFactory.closeSession();
		
		return true;
		
		
	}
	public Box boxStatusByBoxID(int boxID){
		return null;
	}
}
