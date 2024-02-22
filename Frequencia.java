import java.util.Scanner;
import java.util.*;

public class Frequencia {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		sc.nextLine();
		String[] entrada = sc.nextLine().split(" ");
		int[] entradaInt = new int[entrada.length];

		for (int i = 0; i < entradaInt.length; i++) {
			entradaInt[i] = Integer.parseInt(entrada[i]);
		}

		Frequencia f = new Frequencia();
		System.out.println(f.frequencia(entradaInt, numero));
	       
	}

	public int frequencia(int[] sequencia, int numero){
		int contador = 0;

		for (int i = 0; i < sequencia.length; i++){
			if(sequencia[i] == numero){
				contador += 1;
			}

	         }

		return contador;
	}
}
