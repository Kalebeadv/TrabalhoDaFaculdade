package condominio.Jair.parte2.carro;

import condominio.Jair.parte2.builder.Builde;
import condominio.Jair.parte2.imovel.Imovel;
import condominio.Jair.parte2.morador.Morador;

public class BuilderCarro implements Builde{

	private Morador pertenceAoMorador;
	private String modelo;
	private String tipo;
	private String marca;
	private Imovel imovelPertencente;
	
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	public void setPertenceAoMorador(Morador pertenceAoMorador) {
		this.pertenceAoMorador = pertenceAoMorador;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setImovelPertencente(Imovel imovelPertencente) {
		this.imovelPertencente = imovelPertencente;
	}
	
	
	public Carro getBuilderCarro()
	{
		return new Carro(pertenceAoMorador,modelo,tipo, marca,imovelPertencente);
	}

}
