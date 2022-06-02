package br.com.entra21.java.avancado.principal.aula1.enums;
import java.util.Scanner;

public enum gameCharacter {
	
	//cria��o da minhas constantes
	BARBARO(1000, "Full HP"), ANAO(100, "Ferreiro"), DRUIADA(50, "Suport"), SACERDOTE(10, "Saving"), MAGO(50, "Supreme");
	
	//criando os v�riaveis para minhas constantes
	private final int LIFE;
	private final String DESCRICAO;
	
	//construtor
	private gameCharacter(int life, String descricao) {
	this.LIFE = life;
	this.DESCRICAO = descricao;
	}
	
	//gets
	//(n�o pode se usar sets porque s�o constantes)
	public int getLIFE() {
		return LIFE;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}
}
