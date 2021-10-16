package condominio.Jair.parte2;

import java.util.ArrayList;

public class Morador {
	private String nome;
	private Boolean responsavelPeloImovel = false;
	private ArrayList<String> telefone = new ArrayList<String>();
	private ArrayList<String> email =  new ArrayList<String>();
	private Imovel imovel;
	
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
