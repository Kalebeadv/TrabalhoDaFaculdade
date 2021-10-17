package condominio.Jair.parte2.imovel;

import java.util.ArrayList;

import condominio.Jair.parte2.animal.Animal;
import condominio.Jair.parte2.builder.Builde;
import condominio.Jair.parte2.carro.Carro;
import condominio.Jair.parte2.endereco.Endereco;
import condominio.Jair.parte2.morador.Morador;
import condominio.Jair.parte2.visitante.Visitante;

public class BuilderImovel implements Builde {

	private String nome;
	private Endereco endereco;
	private ArrayList<Morador> moradores = new ArrayList<Morador>();
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	private ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setMoradores(Morador moradores) {
		this.moradores.add(moradores);
	}

	public void setAnimais(Animal animais) {
		this.animais.add(animais);
	}

	public void setCarros(Carro carros) {
		this.carros.add(carros);
	}

	public void setVisitantes(Visitante visitantes) {
		this.visitantes.add(visitantes);
	}
	
	public Imovel getBuilderImovel()
	{
		return new Imovel(nome,endereco,moradores,animais,carros,visitantes);
	}
	
	
	

}
