package Campo;

public class Jogador {
	public String nomeJogador;
	private String posicaoJogador;
	public String timeJogador;
	private String numeroJogador;
	
	public void Atacante() {
		System.out.println("Jogador entra na posicao de ataque... " + this.nomeJogador);
	}
	public String getPosicaoJogador() {
		return posicaoJogador;
	}
	public void setPosicaoJogador(String posicaoJogador) {
		this.posicaoJogador = posicaoJogador;
	}
	public String getNumeroJogador() {
		return numeroJogador;
	}
	public void setNumeroJogador(String numeroJogador) {
		this.numeroJogador = numeroJogador;
	}
	
}
