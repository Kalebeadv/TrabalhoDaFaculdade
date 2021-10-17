package condominio.Jair.parte2.condominio;

import java.util.ArrayList;

import condominio.Jair.parte2.endereco.Endereco;
import condominio.Jair.parte2.imovel.Imovel;

public class Condominio {
	
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private ArrayList<Imovel> imoveis = new ArrayList<Imovel>();


	Condominio(String nome, String cnpj, Endereco endereco) {
		
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		
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
	
	public void inserirImovel(Imovel imovel)
	{
		this.imoveis.add(imovel);
	}

}
