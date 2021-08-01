
public class Main {
	
	
  
  

	public static void main(String[] args) {
		

		Grilo[] grilo;
		
		grilo = new Grilo[5];
		
		grilo[0] = new Grilo("joaquin");
		grilo[1] = new Grilo("jorge");
		grilo[2] = new Grilo("bejamin");
		grilo[3] = new Grilo("bores");
		grilo[4] = new Grilo("Marcia");
		
		int pista = 600;
		
		for (int i = 0; i < 10; i++) {
			
	        while (grilo[i].distancia < pista)
	       {
	                       grilo[i].Pular();
	                       }
	}
		
	}
	
}

	

