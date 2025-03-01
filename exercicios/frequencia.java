package exercicios;

import java.util.Scanner;

public class frequencia {
	public static void main(String[] args){
	Scanner scanner = new Scanner (System.in);

       	int numero = scanner.nextInt();
	scanner.nextLine();

	String[] seq = scanner.nextLine().split(" ");
	
	
	int contador = 0;
	for(int i = 0; i < seq.length ; i ++) {
		if(Integer.valueOf(seq[i]) == numero){
		contador ++; 
		}
	}

	System.out.println(contador);
	
	}



}
