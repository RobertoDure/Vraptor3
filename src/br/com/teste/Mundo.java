package br.com.teste;

import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {
	
	public String ola(){
		System.out.println("Olá mundo");
		return "olá mundo Vraptor";
	}

}
