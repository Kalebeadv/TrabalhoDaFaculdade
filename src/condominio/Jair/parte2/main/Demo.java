package condominio.Jair.parte2.main;

import condominio.Jair.parte2.director.Director;
import condominio.Jair.parte2.imovel.BuilderImovel;
import condominio.Jair.parte2.morador.BuilderMorador;
import condominio.Jair.parte2.morador.Morador;

public class Demo {
	
	public static void main(String[] args) {
		
		Director director = new Director();
		
		BuilderMorador morador = new BuilderMorador();
		BuilderImovel imovel = new BuilderImovel();
		
		director.CreateUmMoradores(morador);
		
		
		
		System.out.println(morador.toString());
		
	}

}
