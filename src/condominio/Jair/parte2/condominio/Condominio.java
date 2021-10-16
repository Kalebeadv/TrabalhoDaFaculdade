package condominio.Jair.parte2.condominio;

import java.util.ArrayList;

import condominio.Jair.parte2.endereco.Endereco;
import condominio.Jair.parte2.imovel.Imovel;

public class Condominio {
	
	String nome;
	String cnpj;
	Endereco endereco;
	ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
	
	
	


	Condominio(String nome, String cnpj, Endereco endereco, Imovel imoveis) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.imoveis.add(imoveis);
	}


	public String getNome() {
		return nome;
	}


	public String getCnpj() {
		return cnpj;
	}


	public Endereco getEndereco() {
		return endereco;
	}
	
	
	

}
