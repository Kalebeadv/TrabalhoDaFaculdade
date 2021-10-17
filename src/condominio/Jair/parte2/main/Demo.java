package condominio.Jair.parte2.main;

import condominio.Jair.parte2.animal.*;
import condominio.Jair.parte2.carro.*;
import condominio.Jair.parte2.condominio.*;
import condominio.Jair.parte2.director.*;
import condominio.Jair.parte2.endereco.*;
import condominio.Jair.parte2.imovel.*;
import condominio.Jair.parte2.morador.*;
import condominio.Jair.parte2.visitante.*;

public class Demo {
	
	public static void main(String[] args) {
		
		Director director = new Director();
		
		BuilderCondominio builderCondominio = new BuilderCondominio();
		BuilderMorador builderMorador = new BuilderMorador();
		BuilderImovel builderImovel = new BuilderImovel();
		BuilderEndereco builderEndereco = new BuilderEndereco();
		BuilderVisitante builderVisitante = new BuilderVisitante();
		BuilderCarro builderCarro = new BuilderCarro();
		BuilderAnimal builderAnimal = new BuilderAnimal();
		
		
		director.createUmMoradores(builderMorador);
		Morador morador = builderMorador.getBuilderMorador();
		
		director.createEnderecoSalvador(builderEndereco);
		Endereco endereco = builderEndereco.getBuilderEndereco();
		
		director.createImovelJuliano(builderImovel, endereco);
		Imovel imovel = builderImovel.getBuilderImovel();
		
		director.createAnimalCachorroBolao(builderAnimal, morador, imovel);
		Animal animal = builderAnimal.getBuilderAnimal();
		
		director.createCarroUno(builderCarro, morador, imovel);
		Carro carro = builderCarro.getBuilderCarro();
	
		director.createVisitanteHospede(builderVisitante);
		Visitante visitante = builderVisitante.getBuilderVisitante();
		
		director.createCondominioDoJair(builderCondominio, endereco);
		Condominio condominio = builderCondominio.getBuilderCondominio();
		
		imovel.InserirMorador(morador);
		imovel.inserirAnimal(animal);
		imovel.inserirCarro(carro);
		imovel.inserirVisitante(visitante);
		
		condominio.inserirImovel(imovel);
		
		
		//Coisas para fazer, fazer um metodo exibeINFO em todas as classes base.
		//Ajeitar tirar os arrayList dos contrutores e dos builders (APENAS PARA CLASSES
		//QUE POSSUI ARRAYLIST DE OBJETOS OUTRA CLASSE ex. Imovel,Condominio e etc.
		
		
	}

}
