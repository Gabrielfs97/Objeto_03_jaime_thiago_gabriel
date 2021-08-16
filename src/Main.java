import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.ArrayList;

public class Main {
	

	public static void main(String[] args) {
		
		
		int pista = 0;
		int quantidadeGrilos = 0;
		
		Semaphore semaphore = new Semaphore(1);
	
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Quantos grilos devem competir?");
			 quantidadeGrilos = input.nextInt();
			 while (quantidadeGrilos < 2|| quantidadeGrilos > 6) {
			 System.out.println("Por favor, insira um valor entre 2 e 6.");
			 quantidadeGrilos = input.nextInt();
			 }
			 
			 System.out.println("Quantos cm deve ter a corrida?");
			 pista = input.nextInt();
		}
		ArrayList<Grilo> Time_A = new ArrayList<Grilo>(); 
		ArrayList<Grilo> Time_B = new ArrayList<Grilo>(); 
		
		Grilo[] grilo = new Grilo[quantidadeGrilos];
		
		for(int i =0; i < quantidadeGrilos; i++) {
			grilo[i] = new Grilo(semaphore);
			grilo[i].setNome("Grilo_" + (i + 1));																			
			grilo[i].setDistanciaTotal(pista);
			
			if (Time_A.size() <= Time_B.size()) {
				Time_A.add(grilo[i]);
			} else {
				Time_B.add(grilo[i]);
			}
			
		}
		
		for (int i = 0; i < quantidadeGrilos; i++) {
			grilo[i].start();
			
		}
		}
		
	}
	

	

