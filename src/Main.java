import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		

		int pista = 0;
		int quantidadeGrilos = 0;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Quantos grilos devem competir?");
			 quantidadeGrilos = input.nextInt();
			 while (quantidadeGrilos < 0|| quantidadeGrilos > 6) {
			 System.out.println("Por favor, insira um valor entre 2 e 6.");
			 quantidadeGrilos = input.nextInt();
			 }
			 
			 System.out.println("Quantos cm deve ter a corrida?");
			 pista = input.nextInt();
		}
		 
		Grilo[] grilo = new Grilo[quantidadeGrilos];
		
		for(int i =0; i < quantidadeGrilos; i++) {
			grilo[i] = new Grilo();
			grilo[i].setNome("Grilo_" + (i + 1));
			grilo[i].setDistanciaTotal(pista);
		}
		
	
		
		/*for (int i = 0; i < quantidadeGrilos; i++) {
			grilo[i].start();
			
		}*/
		
		
	}
	
}

	

