package condominio.Jair.parte2.animal;

import condominio.Jair.parte2.imovel.Imovel;
import condominio.Jair.parte2.morador.Morador;

public class Animal {
	
	private String nome;
	private Morador dono;
	private String tipo;
	private Imovel pertenceAoImovel;
	
	Animal(String nome, Morador dono, String tipo, Imovel pertenceAoImovel) {
		
		this.nome = nome;
		this.dono = dono;
		this.tipo = tipo;
		this.pertenceAoImovel = pertenceAoImovel;
	}
	
	public Morador getDono() {
		return dono;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Imovel getPertenceAoImovel() {
		return pertenceAoImovel;
	}

	
	public void exibeInfo() {
		System.out.println("________________________________");
		System.out.println("_____Informaçoes do Animal______");
		System.out.println("Animal............: "+this.tipo);
		System.out.println("Nome do animal....: "+this.nome);
		System.out.println("Dono do animal....: "+this.dono.getNome());
		System.out.println("Pertence ao imovel: "+this.pertenceAoImovel.getNome());
		System.out.println("________________________________");
	}
	
	
	
}
