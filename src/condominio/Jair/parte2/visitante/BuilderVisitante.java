package condominio.Jair.parte2.visitante;

import condominio.Jair.parte2.builder.*;

public class BuilderVisitante implements Builder {
	
	private String funcao;
	private String nome;
	
	

	public void Setfuncao(String funcao) {
		this.funcao = funcao;
		
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Visitante getVisitante()
	{
		return new Visitante(funcao,nome);
	}

	
	
	
	

}
