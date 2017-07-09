package br.com.teste;

import br.com.dao.ProdutoDao;
import br.com.entity.Produto;

public class TesteGravar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto use = criarUsuario();
		
		  new ProdutoDao().salvar( use);
		  System.out.println("usuário "+ use +" gravado com sucesso");
		  

		}

		

		private static Produto criarUsuario() {
			Produto use = new Produto();
			use.setNome("celular");
			use.setDescricao("moto G");
			use.setPreco(800.00);
			return use;
		}



}
