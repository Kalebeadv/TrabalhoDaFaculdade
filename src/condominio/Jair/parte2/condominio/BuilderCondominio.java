package condominio.Jair.parte2.condominio;



import condominio.Jair.parte2.builder.*;
import condominio.Jair.parte2.endereco.Endereco;

public class BuilderCondominio implements Builde {
	
	private String nome;
	private String cnpj;
	private Endereco endereco;


	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	
	public Condominio getBuilderCondominio()
	{
		return new Condominio(nome,cnpj,endereco);
	}

}
