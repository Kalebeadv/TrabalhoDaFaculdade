package condominio.Jair.parte2.imovel;

import condominio.Jair.parte2.builder.Builde;
import condominio.Jair.parte2.endereco.Endereco;


public class BuilderImovel implements Builde {

	private String nome;
	private Endereco endereco;
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	public Imovel getBuilderImovel()
	{
		return new Imovel(nome,endereco);
	}
	
	
	

}
