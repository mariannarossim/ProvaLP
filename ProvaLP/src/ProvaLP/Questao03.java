package ProvaLP;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
        
		String frase;
		
		System.out.println("Escreva uma frase: ");
		frase = entrada.nextLine();
		
		frase = frase.toUpperCase();
        
        while (menu != 5) {
        	
        	System.out.println("1 - Número de frases \n2 - Número de palavras \n3 - Número de vogais \n4 - Número de consoantes \n5 - Sair");
           

            menu = entrada.nextInt();
            switch (menu) {
                case 1:
                	System.out.println("SISTEMA ENCERRADO!");
                    break;
                case 2:
                	System.out.println("SISTEMA ENCERRADO!");
                    break;
                case 3:
                	System.out.println("SISTEMA ENCERRADO!");
                    break;
                case 4:
                    System.out.println("SISTEMA ENCERRADO!");
                    break;
                case 5:
                    System.out.println("SISTEMA ENCERRADO!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;

            }
        }
    }

}