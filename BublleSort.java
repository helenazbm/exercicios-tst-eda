import java.util.Scanner;
import java.util.*;

public class BublleSort{



	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String[] entrada = sc.nextLine().split(" ");

		int[] inteiros = new int[entrada.length];

		for(int i = 0; i< entrada.length; i++){
			inteiros[i] = Integer.parseInt(entrada[i]);
		}
		

		BublleSort b = new BublleSort();
		System.out.println(Arrays.toString(b.bubble_sort(inteiros)));

		}

		public int[] bubble_sort(int[] lista){
					
			for(int i = 0; i < lista.length ; i++){

				for(int j = 0; j < lista.length - 1; j++) {

				if(lista[j] > lista[j+1]){

				int aux = lista[j];
				lista[j] = lista[j+1];
				lista[j+1] = aux;
				
				}
		}


			}

		return lista;
}

}

