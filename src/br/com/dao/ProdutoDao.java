package br.com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.entity.Produto;
import br.com.util.HibernateUtil;

@Component
public class ProdutoDao {
	
private final Session session;
	
	public ProdutoDao(){
		
		this.session = HibernateUtil.getSession();
		
	}

	public void salvar( Produto use) {
		Transaction tx = session.beginTransaction();
		session.save(use);
		tx.commit();
		session.close();
	}

	public void atualizar(Produto use){
	
		Transaction tx = session.beginTransaction();
		session.update(use);
		tx.commit();
		session.close();
	}

	public Produto carrega(Long id) {
		return (Produto) this.session.get(Produto.class,id);
	}
	
	public void remover(Produto use){
		Transaction tx = session.beginTransaction();
		session.delete(use);
		tx.commit();
		session.close();
	}
	
	
	public List<Produto> listaTudo(){
		return this.session.createCriteria(Produto.class).list();
	}


}
