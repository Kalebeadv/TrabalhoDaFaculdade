package condominio.Jair.parte2.morador;

import java.util.ArrayList;


public class Morador {
	private String nome;
	private Boolean responsavelPeloImovel = false;
	private ArrayList<String> telefone = new ArrayList<String>();
	private ArrayList<String> email =  new ArrayList<String>();
	
	
	
	
	Morador(String nome, Boolean responsavelPeloImovel, ArrayList<String> telefone,
			ArrayList<String> email) {
		
		this.nome = nome;
		this.responsavelPeloImovel = responsavelPeloImovel;
		this.telefone.addAll(telefone);
		this.email.addAll(email);
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
	

	
	
	
	

}
