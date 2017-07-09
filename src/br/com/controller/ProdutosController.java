package br.com.controller;

import java.util.List;


import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.dao.ProdutoDao;
import br.com.entity.Produto;

@Resource
//@Path("/oia")
public class ProdutosController {
	
private final ProdutoDao dao;
private final Result result;


	
	public ProdutosController(ProdutoDao dao, Result result){
		this.dao = dao;
		this.result = result;
	}
	
	public void teste(){
		System.out.println("Olá mundo");
	}
/*	@Get
	@Path("/listartudo")
*/
	public List<Produto> lista(){
		return dao.listaTudo();
	}
	
	public void formulario(){
		
	}
	
	public void adiciona(Produto produto){
		dao.salvar(produto);
		//“Como resultado, quero redirecionar para a lógica ProdutosController.lista()”.
		//essa forma é feita para redirecionar p/ outro controller. result.redirectTo(ProdutosController.class).lista();
		//como é para um mesmo controller pode ser feito dessa forma abaixo!
		result.redirectTo(this).lista();
		
	}
	
	/* @Get  
	    @Path("/produtos/{id}")  */
	public void altera(Produto produto){
		dao.atualizar(produto);
		result.redirectTo(this).lista();
	}

	public Produto edita(Long id){
		return dao.carrega(id);
	}
	
	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remover(produto);
		result.redirectTo(this).lista();
	}
}
