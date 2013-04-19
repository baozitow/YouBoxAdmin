package Utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MySessionFactory {
	// ����һ����̬�ַ����������Hibernate�������ļ���
	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
	// ����һ���ֲ߳̾���������
	private static final ThreadLocal threadLocal = new ThreadLocal();
	// ����һ����̬��Configuration����
	private static final Configuration cfg=new Configuration();
	// ����һ����̬��SessionFactory����
	private static org.hibernate.SessionFactory sessionFactory;

	// ȡ��һ����ǰ��Session����
	public static Session currentSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		if (session == null) {
			if (sessionFactory == null) {
				try {
					// ���������ļ�������Hibernate

					// ͨ��Configuration���󴴽�SessionFactory����
					
//					ServiceRegistry serviceRegistry =new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
//					sessionFactory = cfg.configure().buildSessionFactory(serviceRegistry);
					
				     //���������ļ�������Hibernate  
				     cfg.configure(CONFIG_FILE_LOCATION);  
				     //ͨ��Configuration���󴴽�SessionFactory����  
				     sessionFactory = cfg.buildSessionFactory();  
				     
				     
				} catch (Exception e) {
					System.err.println("��ϵͳ����  ����SessionFactory����ʱ����ԭ���ǣ�");
					e.printStackTrace();
				}
			}
			// ͨ��SessionFactory���󴴽�Session����
			session = sessionFactory.getCurrentSession();
			threadLocal.set(session);
		}
		return session;
	}

	// �ر�һ��Session����
	public static void closeSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		threadLocal.set(null);
		if (session != null&&session.isConnected()!=false) {

			session.close();
		}
	}

	// ���췽��
	private MySessionFactory() {
	}
}