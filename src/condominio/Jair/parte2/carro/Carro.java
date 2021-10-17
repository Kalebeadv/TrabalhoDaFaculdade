package condominio.Jair.parte2.carro;

import condominio.Jair.parte2.imovel.Imovel;
import condominio.Jair.parte2.morador.Morador;

public class Carro {
	
	private Morador pertenceAoMorador;
	private String modelo;
	private String tipo;
	private String marca;
	private Imovel imovelPertencente;
	
	
	Carro(Morador pertenceAoMorador, String modelo, String tipo, String marca, 
		  Imovel imovelPertencente) {
		
		this.pertenceAoMorador = pertenceAoMorador;
		this.modelo = modelo;
		this.tipo = tipo;
		this.marca = marca;
		this.imovelPertencente = imovelPertencente;
	}

	public Morador getPertenceAoMorador() {
		return pertenceAoMorador;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public Imovel getImovelPertencente() {
		return imovelPertencente;
	}

	public void exibeInfo() {
		System.out.println("________________________________");
		System.out.println("______Informaçoes do Carro______");
		System.out.println("Tipo do carro..: "+this.tipo);
		System.out.println("Modelo do carro: "+this.modelo);
		System.out.println("Marca do carro.: "+this.marca);
		System.out.println("Dono do carro..: "+this.pertenceAoMorador.getNome());
		System.out.println("Imovel do carro: "+this.imovelPertencente.getNome());
		System.out.println("________________________________");

	}
	
	

}
