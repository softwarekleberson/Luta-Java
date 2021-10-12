package luta;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private String categoria;
	private int vitoria;
	private int empate;
	private int derrota;
	private double peso;
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, int vitoria, int empate, int derrota, double peso) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.vitoria = vitoria;
		this.empate = empate;
		this.derrota = derrota;
		this.setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	private void setCategoria() {
		if(peso < 52.2) {
			this.categoria = "Invalido";
		}
		else if(peso <=70.3) {
			this.categoria = "Leve";
		}
		else if(peso <=83.9) {
			this.categoria = "Medio";
		}
		else if(peso <=120.2) {
			this.categoria = "Pesado";
		}
		else {
			this.categoria = "Invalido";
		}
	}
	
	public int getVitoria() {
		return vitoria;
	}
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	
	public int getEmpate() {
		return empate;
	}
	
	public void setEmpate(int empate) {
		this.empate = empate;
	}
	
	public int getDerrota() {
		return derrota;
	}
	
	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
	
	public void apresentar() {
		System.out.println("Nome " + this.nome);
		System.out.println("A nacionlidade " + this.nacionalidade);
		System.out.println("A idade " + this.idade);
		
	}
	
	public void status() {
		System.out.println("Vitoria ate aqui " + this.vitoria);
		System.out.println("Empates ate aqui " + this.empate);
		System.out.println("Derrotas ate aqui " + this.derrota);
		System.out.println("Categoria " + this.categoria);
	}
	
	public void ganharLuta() {
		this.vitoria += 1;
	}
	
	public void perderLuta() {
		this.derrota += 1;
	}
	
	public void empateLuta() {
		this.empate += 1;
	}

	
}
