package condominio.Jair.parte2.animal;

import condominio.Jair.parte2.imovel.Imovel;
import condominio.Jair.parte2.morador.Morador;

public class Animal {
	
	Morador dono;
	String tipo;
	String nome;
	Imovel pertenceAoImovel;
	
	
	
	Animal(Morador dono, String tipo, String nome, Imovel pertenceAoImovel) {
		this.dono = dono;
		this.tipo = tipo;
		this.nome = nome;
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

	
	
	
	
	
}
