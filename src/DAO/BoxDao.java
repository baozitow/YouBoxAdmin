package DAO;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import Utils.HibernateUtil;


import Beans.Box;
import Beans.Package;

public class BoxDao {
	
	private SessionFactory sessionFactory;
	
	public BoxDao(){
		sessionFactory=HibernateUtil.getSessionFactory();
	}
	Transaction tr=null;
	
	public List<Box> boxStatusInThisTerminal(int terminalId){
		
		Session session=sessionFactory.openSession();
		tr=session.beginTransaction();
		List<Box> boxes=null;
		
		Criteria c=session.createCriteria(Box.class);
		c.add(Restrictions.eq("terminalId",terminalId)); //select * from boxstatus where box_terminalId=terminalID;
		boxes=(ArrayList<Box>)c.list();
		
		tr.commit();
		
		session.close();
		
	
		
		return boxes;
	}
	
	public boolean addBox(int terminalID,int boxNum,int boxType){
		
		Session session=sessionFactory.openSession();
		tr=session.beginTransaction();
			Box box=new Box();
			box.setBoxNum(boxNum);
			box.setBoxStatus(0);
			box.setBoxType(boxType);
			box.setTerminalId(terminalID);
			session.save(box);
		tr.commit();
		session.close();
		return true;
	
	}
	
	
	public boolean setBoxAvailable(int terminalId,int boxNum){
		
		Session session=sessionFactory.openSession();
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
				
				session.close();
				return false;
			}
			
			
		}else{

			session.close();
			return false;
			
		}
		
		

		
		tr.commit();
		session.close();
		
		return true;
		
		
	}
	public Box boxStatusByBoxID(int boxID){
		return null;
	}
}
