package condominio.Jair.parte2;

public class Condominio {
	
	private String nome;
	private String cnpj;
	private Endereco endereco;
	
	
	public Condominio(String nome, String cnpj, Endereco endereco) {
		super();
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
	
	
	

}
