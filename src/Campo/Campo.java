package Campo;

public class Campo {
	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		Jogador jogador3 = new Jogador();
		Jogador jogador4 = new Jogador();
		
		jogador1.nomeJogador = "Alex";
		jogador1.timeJogador = "Santos";
		jogador1.setPosicaoJogador ("Atacante!");
		
		jogador2.nomeJogador = "Vitao";
		jogador2.timeJogador = "Santos";
		jogador2.setPosicaoJogador ("Goleiro");
		
		jogador3.nomeJogador = "Gui";
		jogador3.timeJogador = "Santos";
		jogador3.setPosicaoJogador ("Lateral");
		
		jogador4.nomeJogador = "Kaique";
		jogador4.timeJogador = "Santos";
		jogador4.setPosicaoJogador ("Zagueiro");
		
		System.out.println("No time " + jogador1.timeJogador);
		System.out.println("Temos o Jogador " + jogador1.nomeJogador);
		System.out.println("Na posicao de " + jogador1.getPosicaoJogador());
		
		
	}

}
