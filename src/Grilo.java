import java.util.Random;
import java.util.concurrent.Semaphore;

public class Grilo extends Thread{
	
	Random random = new Random();
	String nome;

	private int pulo;
	private int puloMax = 100;
	private int puloMin = 10;
	private int contPulos = 0;
	private int distancia = 0;
	
	Semaphore getpulo;
	
	int distanciaTotal = 100;

	public Grilo(Semaphore getpulo) {
		this.getpulo = getpulo;
	}
	
	public void Pular () {
	
			
		this.pulo = random.nextInt(puloMax - puloMin + 1) + puloMin;
		this.distancia += this.pulo;
		this.contPulos ++;
		System.out.println( this.nome + " pulou " + this.pulo + "cm        e já percorreu " + this.distancia + "cm! \n");
		
		
		
			
		}
		
	
	
	
	@Override
	public void run() {
		
		while (distancia < distanciaTotal) {
			
			if (getpulo.tryAcquire())
			{
				
			
			Pular();
			
			try {
				Thread.sleep(30 * ((int) Math.random() * 200));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			getpulo.release();
			}
			
			}
		System.out.println( this.nome + " alcançou a linha de chegada com " + this.contPulos + " pulos! \n");
		}
	
	public void setDistanciaTotal(int total) {
		distanciaTotal = total;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
