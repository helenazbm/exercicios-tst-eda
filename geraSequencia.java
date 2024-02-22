import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class geraSequencia {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.nextLine();
		int j = sc.nextInt();

		geraSequencia seq = new geraSequencia();
		System.out.println(seq.maiorSeq(seq.sequencia(i, j)));	

	}
	public int[] sequencia(int inicio, int fim) {
		int[] sequencia = new int[fim-inicio + 1];
		int contador = inicio;

		for(int i = 0; i< sequencia.length; i++){

			sequencia[i] = contador;
			contador += 1; 
		}

		return sequencia;
	}

	public int maiorSeq(int[] sequencia){	
		int maior = 0;

		for (int i = 0; i < sequencia.length; i++){
			ArrayList<Integer> seq = new ArrayList<>();
			seq.add(sequencia[i]);

			while (sequencia[i] != 1){ 

			if(sequencia[i] % 2 == 0){
				sequencia[i] = sequencia[i] / 2 ;
			
			} else {
			    sequencia[i] = (sequencia[i] * 3 ) + 1;
			}
			seq.add(sequencia[i]);

			}
			if(seq.size() > maior){
			 
				maior = seq.size();	
			}
		}
              	return maior;
	}
}
