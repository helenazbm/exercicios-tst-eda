package exercicios;

import java.util.Scanner;

public class EncontraNegativo {
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String[] entrada = sc.nextLine().split(" ");

	int[] entradaInt = new int[entrada.length];

	for(int i =0; i< entrada.length; i++){
		entradaInt[i] = Integer.parseInt(entrada[i]);
	}

	EncontraNegativo e = new EncontraNegativo();
	System.out.println(e.negativo(entradaInt));
}

	String saida = "-";
	int contador = 0;
	public String negativo(int[] tokens){
		if (contador < tokens.length) {
		if (tokens[contador] < 0){
			saida = Integer.toString(tokens[contador]);
		} else {
			contador += 1;
			negativo(tokens);
		}

	} 
		return saida;
	}
}
