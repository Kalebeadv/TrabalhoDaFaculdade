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
	
	public void CreateUmMoradores(BuilderMorador morador)
	{
		morador.setNome("juliano");
		morador.setResponsavelPeloImovel(true);
		morador.setTelefone("3333-3333");
		morador.setTelefone("4444-4444");
		morador.setEmail("juliano@gmail.com");
		morador.setEmail("cabanadaspalmeiras@gmail.com");
		morador.getBuilderMorador();
		
	}
	
	public void CreateImovel(BuilderImovel imovel, Endereco endereco)
	{
		imovel.setNome("Imovel do Juliano");
		imovel.setEndereco(endereco);
	}
	
	

}
