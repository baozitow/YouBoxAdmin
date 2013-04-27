package Utils;

	import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
	public class HibernateUtil {
		private static  Configuration cfg=new Configuration();
		private static SessionFactory sessionFactory;
		static {
			try {
				ServiceRegistry serviceRegistry =new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
				sessionFactory = cfg.configure().buildSessionFactory(serviceRegistry);
			} catch (Throwable ex) {
				throw new ExceptionInInitializerError(ex);
			}
		}
		public static SessionFactory getSessionFactory() {
			// Alternatively, you could look up in JNDI here
			return sessionFactory;
		}
		public static void shutdown() {
			// Close caches and connection pools
			getSessionFactory().close();
		}
	}
