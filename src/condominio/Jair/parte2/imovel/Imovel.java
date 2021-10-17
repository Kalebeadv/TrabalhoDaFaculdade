package condominio.Jair.parte2.imovel;

import java.util.ArrayList;

import condominio.Jair.parte2.animal.Animal;
import condominio.Jair.parte2.carro.Carro;
import condominio.Jair.parte2.endereco.Endereco;
import condominio.Jair.parte2.morador.Morador;
import condominio.Jair.parte2.visitante.Visitante;

public class Imovel {

	private String nome;
	private Endereco endereco;
	private ArrayList<Morador> moradores = new ArrayList<Morador>();
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	private ArrayList<Visitante> visitantes = new ArrayList<Visitante>();
	
	
	Imovel(String nome, Endereco endereco, 
			ArrayList <Morador> moradores,
			ArrayList<Animal> animais, ArrayList<Carro> carros,
			ArrayList <Visitante> visitante) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.moradores.addAll(moradores);
		this.animais.addAll(animais);
		this.carros.addAll(carros);
		this.visitantes.addAll(visitantes);
	}
	
	

	public String getNome() {
		return nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}



	public ArrayList<Morador> getMoradores() {
		return moradores;
	}



	public ArrayList<Animal> getAnimais() {
		return animais;
	}



	public ArrayList<Carro> getCarros() {
		return carros;
	}



	public ArrayList<Visitante> getVisitantes() {
		return visitantes;
	}
	
	
	
	
	
	
	
	
}
