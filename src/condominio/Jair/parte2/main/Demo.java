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
		
		
		
		Animal animal = builderAnimal.getBuilderAnimal();
		Carro carro = builderCarro.getBuilderCarro();
		Condominio condominio = builderCondominio.getBuilderCondominio();
		Endereco endereco = builderEndereco.getBuilderEndereco();
		Imovel imovel = builderImovel.getBuilderImovel();
		Morador morador = builderMorador.getBuilderMorador();
		Visitante visitante = builderVisitante.getBuilderVisitante();
		

		//Coisas para fazer, fazer um metodo exibeINFO em todas as classes base.
		//Ajeitar tirar os arrayList dos contrutores e dos builders (APENAS PARA CLASSES
		//QUE POSSUI ARRAYLIST DE OBJETOS OUTRA CLASSE ex. Imovel,Condominio e etc.
		
		
	}

}
