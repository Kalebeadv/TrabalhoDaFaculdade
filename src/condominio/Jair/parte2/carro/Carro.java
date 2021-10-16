package condominio.Jair.parte2.carro;

import condominio.Jair.parte2.imovel.Imovel;
import condominio.Jair.parte2.morador.Morador;

public class Carro {
	
	Morador pertenceAoMorador;
	String modelo;
	String tipo;
	String marca;
	Imovel imovelPertencente;
	
	
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

	
	
	

}
