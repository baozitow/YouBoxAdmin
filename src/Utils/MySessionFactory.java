package Utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MySessionFactory {
	// 定义一个静态字符串变量存放Hibernate的配置文件名
	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
	// 创建一个线程局部变量对象
	private static final ThreadLocal threadLocal = new ThreadLocal();
	// 创建一个静态的Configuration对象
	private static final Configuration cfg=new Configuration();
	// 定义一个静态的SessionFactory对象
	private static org.hibernate.SessionFactory sessionFactory;

	// 取得一个当前的Session对象
	public static Session currentSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		if (session == null) {
			if (sessionFactory == null) {
				try {
					// 根据配置文件，配置Hibernate

					// 通过Configuration对象创建SessionFactory对象
					
//					ServiceRegistry serviceRegistry =new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
//					sessionFactory = cfg.configure().buildSessionFactory(serviceRegistry);
					
				     //根据配置文件，配置Hibernate  
				     cfg.configure(CONFIG_FILE_LOCATION);  
				     //通过Configuration对象创建SessionFactory对象  
				     sessionFactory = cfg.buildSessionFactory();  
				     
				     
				} catch (Exception e) {
					System.err.println("【系统错误】  创建SessionFactory对象时出错，原因是：");
					e.printStackTrace();
				}
			}
			// 通过SessionFactory对象创建Session对象
			session = sessionFactory.getCurrentSession();
			threadLocal.set(session);
		}
		return session;
	}

	// 关闭一个Session对象
	public static void closeSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		threadLocal.set(null);
		if (session != null&&session.isConnected()!=false) {

			session.close();
		}
	}

	// 构造方法
	private MySessionFactory() {
	}
}