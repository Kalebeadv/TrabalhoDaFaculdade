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
	
	
	Imovel(String nome, Endereco endereco) {
		
		this.nome = nome;
		this.endereco = endereco;
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
	
	public void InserirMorador(Morador morador)
	{
		this.moradores.add(morador);
	}
	
	public void inserirAnimal(Animal animal)
	{
		this.animais.add(animal);
	}
	
	public void inserirCarro(Carro carro)
	{
		this.carros.add(carro);
	}
	
	public void inserirVisitante(Visitante visitante)
	{
		this.visitantes.add(visitante);
	}
	
	public void exibeINFO()
	{
		System.out.print("Moradores : ");
		moradores.forEach(teste -> {System.out.println(teste.toString());});
		System.out.println("");
	}
	
	
	
	
	
	
	
	
}
