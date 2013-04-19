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
		tr=session.beginTransaction();
		Admin admin=null;
		
		String getUserSql="select * from admin where admin_userName='"+username+"' and admin_psd='"+password+"'";
		Query q= session.createSQLQuery(getUserSql).addEntity(Admin.class);		
		List result=q.list();
		if(result.iterator().hasNext()){
			admin= (Admin) result.iterator().next();
		}
		
		
//		Criteria c=session.createCriteria(Admin.class);
//		c.add(Restrictions.eq("username",username));
//		c.add(Restrictions.eq("password",password));
//		List result=c.list();
		
		tr.commit();
		
		MySessionFactory.closeSession();
		return admin;
		
		
		

		
	}
}
