package condominio.Jair.parte2.director;

import condominio.Jair.parte2.animal.*;
import condominio.Jair.parte2.builder.Builde;
import condominio.Jair.parte2.carro.*;
import condominio.Jair.parte2.endereco.*;
import condominio.Jair.parte2.morador.*;
import condominio.Jair.parte2.visitante.*;
import condominio.Jair.parte2.condominio.*;
import condominio.Jair.parte2.imovel.*;

public class Director {
	
	public void createUmMoradores(BuilderMorador morador)
	{
		morador.setNome("juliano");
		morador.setResponsavelPeloImovel(true);
		morador.setTelefone("3333-3333");
		morador.setTelefone("4444-4444");
		morador.setEmail("juliano@gmail.com");
		morador.setEmail("cabanadaspalmeiras@gmail.com");
		morador.getBuilderMorador();
		
	}
	
	public void createImovelJuliano(BuilderImovel imovel, Endereco endereco)
	{
		imovel.setNome("Imovel do Juliano");
		imovel.setEndereco(endereco);
		
	}
	
	public void createEnderecoSalvador(BuilderEndereco endereco)
	{
		endereco.setPais("Brasil");
		endereco.setEstado("Bahia");
		endereco.setCidade("Salvador");
		endereco.setCep("69888-123");
		endereco.setLagradouro("Rua das palmeiras");
		endereco.setBairro("FinalValendo10");
		endereco.setNumeroDaCasa("5464");
		endereco.getBuilderEndereco();
	}
	
	public void createCondominioDoJair(BuilderCondominio condominio,Endereco endereco)
	{
		condominio.setCnpj("1234567-8");
		condominio.setEndereco(endereco);
		condominio.setNome("Condominio do Jair");
		condominio.getBuilderCondominio();
	}
	
	public void createAnimalCachorroBolao(BuilderAnimal animal,Morador morador,Imovel imovel)
	{
		animal.setDono(morador);
		animal.setNome("Bolao");
		animal.setPertenceAoImovel(imovel);
		animal.setTipo("Cachorro");
		animal.getBuilderAnimal();
	}
	
	public void createCarroUno(BuilderCarro carro, Morador morador, Imovel imovel)
	{
		carro.setImovelPertencente(imovel);
		carro.setPertenceAoMorador(morador);
		carro.setMarca("Uno 2010");
		carro.setModelo("21219QW");
		carro.setNome("Botafogo");
		carro.setTipo("carro popular");
		carro.getBuilderCarro();
	}
	
	public void createVisitanteHospede(BuilderVisitante visitante)
	{
		visitante.Setfuncao("Hóspede");
		visitante.setNome("Maria");
	}
	
	

}
