import java.util.Random;

public class Grilo {
	
	Random random = new Random();
	String nome;

	
	int pulo;
	int puloMax = 100;
	int puloMin = 10;
	int contPulos;
	int distancia;

	public Grilo (String nome){
		this.distancia = 0;
		this.contPulos = 0;
		this.nome = nome;
	}
	
	public void Pular () {
		this.pulo = random.nextInt(puloMax - puloMin + 1) + puloMin;
		this.distancia += this.pulo;
		this.contPulos ++;
		System.out.println( this.nome + " pulou " + this.pulo + "cm e percorreu " + this.distancia + "cm!");
		
		System.out.println( this.nome + " deu " + this.contPulos + " pulos!");
	}
	
}
