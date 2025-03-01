package exercicios;

import java.util.Scanner;

public class buscaBinariaRecursiva {

public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	String[] input = sc.nextLine().split(" ");
	int chave = sc.nextInt();


	int[] entrada = new int[input.length];

	for(int i =0; i< input.length; i++){
		entrada[i] = Integer.parseInt(input[i]);
	
	}


	buscaBinariaRecursiva r = new buscaBinariaRecursiva();
	System.out.println(r.buscaRecursiva(entrada, 0, entrada.length-1, chave));

}



public int buscaRecursiva(int[] entrada, int inicio, int fim,  int chave) {

	if (inicio <= fim) {
	
		int meio = (inicio + fim) / 2;


		if (entrada[meio] == chave){
			return meio;
		
		}

		 if(entrada[meio] > chave){

			return buscaRecursiva(entrada, inicio, meio-1, chave);
			
			
		} 
		
		if(entrada[meio] < chave) {
			return buscaRecursiva(entrada, meio +1, fim, chave);
		
		}
	
	
	 } 

	return -1;

}

}


