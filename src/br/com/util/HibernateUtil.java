package br.com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class HibernateUtil  {
	
	public  static Session getSession() {
		
		try{
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		return session;
		}catch(Exception e){
			System.out.println("Erro na conexão com o banco de dados "+ e);
		}
		return null;
		
		
	}


}
