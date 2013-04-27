package DAO;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import Beans.Terminal;

import Utils.HibernateUtil;

public class TerminalDao {

	private SessionFactory sessionFactory;
	private Transaction tr = null;

	public TerminalDao() {
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public ArrayList<Terminal> returnAllTermials() {

		Session session = sessionFactory.openSession();
		tr = session.beginTransaction();
		
			ArrayList<Terminal> terminals = null;
	
			Criteria c = session.createCriteria(Terminal.class);
			terminals = (ArrayList<Terminal>) c.list();
	
			tr.commit();
		session.close();
		return terminals;
	}
	
	public ArrayList<Terminal> returnTermialByBranchID(int branchID) {

		Session session = sessionFactory.openSession();
			tr = session.beginTransaction();
		
			ArrayList<Terminal> terminals = null;
	
			Criteria c = session.createCriteria(Terminal.class);
			c.add(Restrictions.eq("branchId",branchID));
			terminals = (ArrayList<Terminal>) c.list();
	
			tr.commit();
		session.close();
		return terminals;
	}
	
	
}
