package condominio.Jair.parte2;

import java.util.ArrayList;

public class Imovel {
	private String nome;
	private Endereco endereco;
	private ArrayList<Morador> moradores = new ArrayList<Morador>();
	private ArrayList<Animal> animais = new ArrayList<Animal>();
	private ArrayList<Carro> carros = new ArrayList<Carro>();
	
	
	public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	
	
	
	
}
