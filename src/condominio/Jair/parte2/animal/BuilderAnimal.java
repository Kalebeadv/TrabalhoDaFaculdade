package condominio.Jair.parte2.animal;
import condominio.Jair.parte2.builder.*;
import condominio.Jair.parte2.imovel.Imovel;
import condominio.Jair.parte2.morador.Morador;

public class BuilderAnimal implements Builde{

	private String nome;
	private Morador dono;
	private String tipo;
	private Imovel pertenceAoImovel;
	
	@Override
	public void setNome(String nome) {
	 
		this.nome = nome;
	}

	public void setDono(Morador dono) {
		this.dono = dono;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPertenceAoImovel(Imovel pertenceAoImovel) {
		this.pertenceAoImovel = pertenceAoImovel;
	}
	
	public Animal getBuilderAnimal()
	{
		return new Animal(nome,dono,tipo,pertenceAoImovel);
	}

}
