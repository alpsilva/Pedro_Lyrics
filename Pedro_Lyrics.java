import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Pedro_Lyrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			
			String verso = in.nextLine();
			int verso_tam = verso.length();

			if (verso_tam > 0) {
				String[] palavras = new String[100];
				int palavras_index = 0;
				int parada = 0;
				int nPalavras = 0;

				for (int i = 0; i < verso_tam; i++) {
					if (verso.charAt(i) == ' ' || i == verso_tam-1) {
						String aux;
						if (i == verso_tam-1) {
							aux = verso.substring(parada, i+1);
						} else {
							aux = verso.substring(parada, i);
						}
						
						palavras[palavras_index] = aux;
						palavras_index++;
						parada = i + 1;
						nPalavras++;
					}
					
					
				}

				int randomNum = ThreadLocalRandom.current().nextInt(0, nPalavras);

				for (int i = 0; i < nPalavras; i++) {
					if (i == randomNum) {
						System.out.print("PEDRO ");
					} else {
						System.out.print(palavras[i] + " ");
					}
				}
				
			}
			System.out.println();

		}

	}

}
