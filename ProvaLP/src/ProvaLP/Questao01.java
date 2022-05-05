package ProvaLP;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		String cor1 = "Azul";
		String cor2 = "Vermelha";
		String cor3 = "Verde";
	
		
		int aux;
		int soma=0;	
        int [] notas = new int[10];
        for (int i = 0; i < 10;i++){
        	
        	System.out.println("Digite a cor da chave n° " + (i+1) );
        	notas [i] = entrada.nextInt();
        	soma = soma + notas[i];
        }
        
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < 9; j++) {
        		if(notas [j] > notas [j + 1]) {
        			aux = notas [j];
        			notas [j] = notas [j + 1];
        			notas [j  + 1 ] = aux;
        			

        
        		}
        		
        	}

        }
	}
}

