package condominio.Jair.parte2.morador;

import java.util.ArrayList;

import condominio.Jair.parte2.imovel.Imovel;

public class Morador {
	String nome;
	Boolean responsavelPeloImovel = false;
	ArrayList<String> telefone = new ArrayList<String>();
	ArrayList<String> email =  new ArrayList<String>();
	Imovel imovel;
	
	
	Morador(String nome, Boolean responsavelPeloImovel, String telefone, String email,
			Imovel imovel) {
		this.nome = nome;
		this.responsavelPeloImovel = responsavelPeloImovel;
		this.telefone.add(telefone);
		this.email.add(email);
		this.imovel = imovel;
	}

	public String getNome() {
		return nome;
	}
	
	public Boolean getResponsavelPeloImovel() {
		return responsavelPeloImovel;
	}
	
	public ArrayList<String> getTelefone() {
		return telefone;
	}
	
	public ArrayList<String> getEmail() {
		return email;
	}
	
	public Imovel getImovel() {
		return imovel;
	}

	
	
	
	

}
