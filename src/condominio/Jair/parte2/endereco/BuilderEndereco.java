package condominio.Jair.parte2.endereco;

import condominio.Jair.parte2.builder.Builde;

public class BuilderEndereco implements Builde {

	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String lagradouro;
	private String cep;
	private String numeroDaCasa;
	
	
	@Override
	public void setNome(String nome) {
		
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public void setLagradouro(String lagradouro) {
		this.lagradouro = lagradouro;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public void setNumeroDaCasa(String numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
	
	public Endereco getBuilderEndereco()
	{
		return new Endereco(pais,estado,cidade,bairro,lagradouro,cep,numeroDaCasa);
	}
	
	

}
