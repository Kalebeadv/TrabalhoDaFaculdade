package condominio.Jair.parte2.endereco;

public class Endereco {
	
	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String lagradouro;
	private String cep;
	private String numeroDaCasa;
	
	
	
	Endereco(String pais, String estado, String cidade, String bairro, String lagradouro, 
			String cep, String numeroDaCasa) {
		
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.lagradouro = lagradouro;
		this.cep = cep;
		this.numeroDaCasa = numeroDaCasa;
	}
	public String getPais() {
		return pais;
	}
	public String getEstado() {
		return estado;
	}
	public String getCidade() {
		return cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public String getLagradouro() {
		return lagradouro;
	}
	public String getCep() {
		return cep;
	}
	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}
	
	

}
