package luta;

import java.util.Random;

public class Porrada {
	
	private Lutador desafiante;
	private Lutador Desafiado;
	private int rounds;
	private boolean aprovado;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
				this.aprovado = true;
				this.Desafiado = l1;
				this.desafiante = l2;
			
		}
		
		else {
			this.aprovado = false;
			this.Desafiado = null;
			this.desafiante = null;
			System.out.println("Luta não pode acontecer");
		}
	}
	
	public void luta() {
		if(this.aprovado) {
			
			System.out.println("* * * * Desafiado * * * * *");
			System.out.println(" ");
			Desafiado.apresentar();
			
			System.out.println(" * * * * Desafiante * * * * *");
			System.out.println(" ");
			desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			System.out.println(" = = = = = = = = = Resultado da luta = = = = = = =");
			System.out.println(" ");
			
			switch(vencedor) {
			
			case 0:
				System.out.println("Empatou luta");
				this.Desafiado.empateLuta();
				this.desafiante.empateLuta();
				break;
				
			case 1:
				System.out.println("O vencedor foi " + this.Desafiado.getNome());
				this.Desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2:
				System.out.println("O vencedor foi " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.Desafiado.perderLuta();
				break;
			}
			
			System.out.println(" = = = = = =  = = = = = =  = = = =  = = =  =");
			System.out.println(" ");
			
		}
		
		
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return Desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		Desafiado = desafiado;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	
	

}
