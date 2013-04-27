package DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import Utils.MySessionFactory;

import Beans.Admin;



public class AdminDao {
	
	Transaction tr=null;
	
	public Admin get(String username,String password){
		Session session=MySessionFactory.currentSession();
		Admin admin=null;

		tr=session.beginTransaction();
		Criteria c=session.createCriteria(Admin.class);
		c.add(Restrictions.eq("username",username));
		c.add(Restrictions.eq("password",password));
		List result=c.list();
		if(result.iterator().hasNext()){
			admin= (Admin) result.iterator().next();
		}
		
		tr.commit();
		
		MySessionFactory.closeSession();
		return admin;
		
		
		

		
	}
}
