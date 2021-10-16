package condominio.Jair.parte2.morador;

import java.util.ArrayList;

import condominio.Jair.parte2.builder.Builder;


public class BuilderMorador implements Builder {

	private String nome;
	private Boolean responsavelPeloImovel = false;
	private ArrayList<String> telefone = new ArrayList<String>();
	private ArrayList<String> email =  new ArrayList<String>();

	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setResponsavelPeloImovel(Boolean responsavel)
	{
		this.responsavelPeloImovel = responsavel;
	}
	
	public void setTelefone(String telefone)
	{
		this.telefone.add(telefone);
	}
	
	public void setEmail(String email)
	{
		this.email.add(email);
	}
	
	public Morador getMorador()
	{
		return new Morador(nome,responsavelPeloImovel,telefone,email);
	}
}
