package condominio.Jair.parte2.visitante;

public class Visitante {
	private String funcao;
	private String nome;
	
	
	Visitante(String funcao, String nome) {
		this.funcao = funcao;
		this.nome = nome;
	}
	
	public String getFuncao() {
		return funcao;
	}
	public String getNome() {
		return nome;
	}
	
	public void exibeInfo() {
		System.out.println("______________________________");
		System.out.println("___Informaçoes do Visitante___");
		System.out.println("Função..: " + this.funcao);
		System.out.println("Nome....: " + this.nome);
		System.out.println("______________________________");
	}
	

}
