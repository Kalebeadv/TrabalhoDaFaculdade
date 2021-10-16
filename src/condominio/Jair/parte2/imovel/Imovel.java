package condominio.Jair.parte2.imovel;

import java.util.ArrayList;

import condominio.Jair.parte2.animal.Animal;
import condominio.Jair.parte2.carro.Carro;
import condominio.Jair.parte2.condominio.Condominio;
import condominio.Jair.parte2.endereco.Endereco;
import condominio.Jair.parte2.morador.Morador;

public class Imovel {
	Condominio condominio;
	String nome;
	Endereco endereco;
	ArrayList<Morador> moradores = new ArrayList<Morador>();
	ArrayList<Animal> animais = new ArrayList<Animal>();
	ArrayList<Carro> carros = new ArrayList<Carro>();
	
	
	
	Imovel(Condominio condominio, String nome, Endereco endereco, Morador moradores,
			Animal animais, Carro carros) {
		super();
		this.condominio = condominio;
		this.nome = nome;
		this.endereco = endereco;
		this.moradores.add(moradores);
		this.animais.add(animais);
		this.carros.add(carros);
	}
	
	
	public Condominio getCondominio() {
		return condominio;
	}

	public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	
	
	
	
	
}
